## Decorator
### 개념
- 구조 패턴이다. (다른 객체에 영향을 주지 않으면서, 행동을 추가할 수 있게 해준다.)
### 특징
- 런타임에 기능을 조합해 객체를 구성할 수 있게 한다. 
- Open/Closed 원칙을 따르며, 기존 코드를 수정하지 않고도 기능을 확장할 수 있다.
### 데코레이터 패턴을 사용하는 경우
- Extending Functionality: 기존 코드에 영향 없이 기능을 확장해야 하는 경우
- Multiple Combinations of Features: 객체를 다양하게 조합해 사용하려는 경우 
- Legacy Code Integration: 레거시나 서드파티 라이브러리를 사용할 때, 코드 베이스를 수정하는 것이 어려운 경우
- GUI Components
- Input/Output Streams: 자바 스트림을 수정하지 않고도 버퍼링, 압축, 암호화, 로깅 기능을 추가하는 경우
### 구성 요소
- Component Interface: 구현체와 데코레이터 모두를 위한 공통의 인터페이스를 정의한 추상 클래스 또는 인터페이스 
- Concrete Component: Component Interface의 구현체. 우리가 확장하고 싶은 대상 
- Decorator: Component Interface를 구현하는 추상 클래스이며, Component Interface를 참조해 기능을 확장할 수 있다. 
- Concrete Decorator: Decorator 구현체이다. 컴포넌트에 특정 동작이나 책임을 추가한다.
참고
- https://www.geeksforgeeks.org/decorator-pattern/
