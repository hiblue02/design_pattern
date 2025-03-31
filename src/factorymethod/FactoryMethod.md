## 팩토리 메소드

### 특징
- 생성 패턴 creational design pattern
- 상위 클래스가 객체를 생성할 수 있는 인터페이스를 제공하고, 하위 클래스가 생성할 객체 유형을 지정할 수 있게 돕는다. 
- 객체를 생성하는 메소드를 별도 클래스로 모아두어, 객체 생성자와 객체가 느슨한 결합을 가지도록 돕는다. 
- 유연성, 확장성, 유지보수성을 높이고 하위 클래스가 특정 타입 객체를 생성할 수 있는 자체 factory 메소드를 가지게 한다.

### 사용하는 경우 
- 객체를 생성하는 과정이 복잡하고, 조건이 다양할 때 팩토리 메소드를 사용하면 client의 코드가 단순해진다. 
- interface나 abstarct class로 객체를 생성할 수 있어, 구현체를 숨길 수 있다. (존재하는 코드에 영향을 주지 않고 기능을 바꾸거나 확장할 수 있다)
- 새로운 type이나 상품의 버전이 올라가도, 팩토리 메소드를 사용하면 다양한 버전을 지원할 수 있다.
- 설정 logic을 숨긴다. client는 팩토리 메소드가 제공하는 파라미터나 옵션을 사용해 객체 생성을 customize 할 수 있다. 

### 구성요소
#### Creator
- 팩토리 메소드가 선언된 인터페이스나 추상 클래스
#### Concrete Creator
- Creator 구현체
#### Product
- 팩토리 메소드가 만들 객체의 인터페이스나 추상 클래스
#### Concrete Product
- Product 구현체 (서브 클래스)


### 스프링
- Factory Bean
참고
- https://www.geeksforgeeks.org/factory-method-for-designing-pattern/
