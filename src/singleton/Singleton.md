## Singleton

### 개념

- 싱글톤 패턴은 클래스가 1개의 인스턴스만 가지도록 보장하고, 어디에서나 그 인스턴스에 접근할 수 는 방법을 제공한다.

### 원칙

#### Single Instance

- 인스턴스는 오직 1개다.

#### Global Access

- 전역에서 인스턴스에 접근할 수 있는 방법을 제공한다.

#### Lazy or Eager Initialization

- 인스턴스가 필요할 때(Lazy), 또는 인스턴스가 로드될 때(즉시)
  생성되도록 지원한다.

#### Thread Safety

- 멀티 스레드 환경에서 동시에 여러 인스턴스가 생성되지 않도록 방지한다.

#### Private Constructor

- 생성자를 private로 선언하여, 생성자에 직접 접근하는 것을 방지하고, access point를 제공한다.

### 구현방법

#### Lazy Initialization

- 객체가 필요할 때, 인스턴스를 생성한다. muti-thread 환경에서 인스턴스가 여러 개 생겨날 수 있다.

```kotlin
class Calculator private constructor() {

    companion object {
        private var instance: Calculator? = null
        private var per = 100

        fun getInstance(): Calculator {
            if (instance == null) {
                instance = Calculator()
            }
            return instance!!
        }
    }

    fun calculatePercent(target: Int): Double {
        return (target / per).toDouble()
    }
}

```

#### synchronized

- 객체가 필요할 때 인스턴스를 생성한다. synchronized 키워드를 사용해 다른 스레드에서 인스턴스가 생성되는 것을 막는다. 그러나 경합이 일어나 프로그램이 느려질 수 있다.
- *synchronized 블록 안의 코드는 한 스레드에서만 접근할 수 있다.

```kotlin
class Calculator2 private constructor() {

    companion object {

        private var instance: Calculator2? = null
        private var per = 100

        fun getInstance(): Calculator2 {
            if (instance == null) {
                synchronized(this) {
                    if (instance == null) {
                        instance = Calculator2()
                    }
                }
            }
            return instance!!
        }
    }

    fun calculatePercent(target: Int): Double {
        return (target / per).toDouble()
    }
}

```

#### Eager Initialization

- 인스턴스가 로드 될 때(application이 기동될 때) 인스턴스를 생성한다. 메모리가 낭비될 수 있다.

```kotlin
class Calculator3 private constructor() {

    companion object {
        private var instance: Calculator3 = Calculator3()
        private var per = 100

        fun getInstance(): Calculator3 {
            return instance
        }
    }

    fun calculatePercent(target: Int): Double {
        return (target / per).toDouble()
    }
}
```

#### Double Checked Locking / Voltaile + synchronized

- volatile을 사용해 static 변수가 최신 상태를 유지하게 한다. synchronized가 호출되는 오버헤드를 줄여준다.

```kotlin
class Calculator4 private constructor() {

    companion object {
        @Volatile
        private var instance: Calculator4? = null
        private var per = 100

        fun getInstance(): Calculator4 {
            if (instance == null) {
                synchronized(this) {
                    if (instance == null) {
                        instance = Calculator4()
                    }
                }
            }
            return instance!!

        }
    }

    fun calculatePercent(target: Int): Double {
        return (target / per).toDouble()
    }
}

```

#### Instantiation through inner class

- getInstance 시점에 innerClass를 통해 인스턴스가 생성된다. 한번 생성되면, 모든 스레드에서 같은 객체에 접근한다.
- Lasy Instantiation의 단점을 보완하고, Thread-safe한 방법이다.

```kotlin
class Calculator5 private constructor() {

    private object Holder {
        val INSTANCE: Calculator5 = Calculator5()

    }

    companion object {

        private var per = 100

        fun getInstance(): Calculator5 {
            return Holder.INSTANCE
        }
    }

    fun calculatePercent(target: Int): Double {
        return (target / per).toDouble()
    }
}
```

### Spring에서 Singlton을 사용하는 이유
- 대용량 처리를 위해서이다. 상태가 없는 자바 객체를 매번 새로 만드는 비효율을 줄이기 위해서이다. 
- Spring IoC Container가 생성될 때, (application 기동할 때) 모든 Bean들을 만들고, Bean 설정에 대한 예외처리를 초기에 검증한다.

참고

- https://www.geeksforgeeks.org/singleton-design-pattern/
- https://simyeju.tistory.com/121#%E2%9D%94%EC%96%B4%EB%96%BB%EA%B2%8C_Thread-safe%ED%95%98%EA%B2%8C_%EC%9E%91%EC%84%B1%ED%95%A0_%EC%88%98_%EC%9E%88%EB%82%98?
- https://velog.io/@diense_kk/Spring-Bean-%EC%83%9D%EC%84%B1-%EC%88%9C%EC%84%9C%EC%99%80-Life-Cycle
