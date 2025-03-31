## Adatper Pattern
### 특징
- 구조 패턴 structural design pattern
- 두 클래스 사이의 다리 역할을 하는 패턴이다.
- 새로운 라이브러리나 레거시 코드를 새로운 시스템에 통합하려할 때, 유용하다.
### 구성요소
#### Target Interface
- 클라이언트가 기대하는(사용하는) 메소드가 정의된 인터페이스다
#### Adaptee
- 새로운 시스템에 통합되어야 하는 호환되지 않는 인터페이스를 가진 객체이다. 
#### Adapter
- target interface의 구현체다.
- 내부에서 adaptee를 이용해 target interface에 적합한 형태로 바꾼다.
#### Client
- target interface를 사용하는 객체다. 
- adaptee와 adaptor의 관계를 모른다. 

### 스프링
- Spring MVC / Handler Adaptor
- Spring AOP / Advice

참고
- https://www.geeksforgeeks.org/adapter-pattern/
