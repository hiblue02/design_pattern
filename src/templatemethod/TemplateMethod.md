## Template Method
### 특징
- 행동 패턴이다
- 핵심 단계를 설계를 정의하고, 하위 클래스에서 전체구조를 변경하지 않고 특정 단계를 재정의할 수 있게 한다. 
### 구성요소
#### Abstract Class(Interface)
- 템플릿 메소드를 정의하는 상위 클래스다. 
- 알고리즘 뼈대를 제공하며, abstaract 메소드를 하위 클래스에서 정의할 수 있게 한다. 
- 하위 클래스에서 공통적으로 사용하는 기능은 구체 메소드로 선언한다. 
#### Template Method
- 추상 클래스 안에 정의된 메소드로 알고리즘의 전체 구조를 특정 순서로 호출한다. 
- 보통 final로 선언되어 하위 클래스에서 메소드를 변경하는 것을 막는다.
#### Abstract (or Hook) Methods
- Abstract 클래스 안에 선언되는 메소드다. 
- 하위 클래스에서 정의되어야 한다. 
#### Concrete SubClasses
- abstract class를 구현한 클래스이다
- 전체적인 구조를 바꾸지 않고도 알고리즘 내부의 특정 단계를 정의할 수 있다. 

### 장점
- 코드의 중복을 줄인다. 
    - 같은 흐름과 변수를 가진 기능들이 있다면, 공통적인 부분에 대한 코드 중복을 줄일 수 있다.
- 어떤 흐름을 강제할 수 있다. 
### 단점 
- 알고리즘이 다양하다면, 과도한 추상화가 발생해 코드가 복잡해질 수 있다. 
- 각 단계 사이에 밀접한 연관이 있을 경우, 충분한 유연성을 제공하지 못할 수 있다. 그러면 한 단계를 수정할 때 다른 단계도 함께 수정해야 할 수 있다. 
- 템플릿 메소드 패턴은 구조나 행동이 미리 결정되는 패턴이다. 런타임에 유연하게 코드를 바꾸려고 하는 경우엔 맞지 않다.


