## Strategy

### 개념
- 행동이나 알고리즘을 유형화해서 각각의 클래스로 만드는 패턴이다. 그리고 그 클래스를 런타임에 동적으로 바뀌게 할 수 있다. 
### 특징
#### Defines a family of algorithms
- 여러 개의 행동이나 알고리즘을 유형화해서 캡슐화한다. 
#### Encapsulates behaviors
- 전략 클래스를 캡슐화해서, 변경과 구현을 깨끗하고 독립적으로 만든다.  
#### Enables dynamic behavior switching
- 동적으로 행동을 바꿀 수 있다
#### Promotes object collaboration
- 컨텍스트 객체와 전략 객체 간의 협력을 지원한다. 컨텍스트 객체는 동작의 실행을 전략 객체에게 위임한다. 

### 전략 패턴의 구성 
#### Context
- 클라이언트와 전략 객체의 중개자
- 처리(행동)을 위한 참조정보를 가지고, 전략 객체의 메소드를 호출한다. 
#### Strategy Interface
- 전략 구현(concrete) 객체가 구현해야 하는 메소드를 정의한 인터페이스나 추상 클래스
#### Concrete Strategies
- 전략 구현 객체
#### Client
- 전략 구현 객체를 선택하고, 컨텍스트 객체에 전달한다. 


참고
- https://www.geeksforgeeks.org/strategy-pattern-set-1/
- https://www.geeksforgeeks.org/strategy-pattern-set-2/
