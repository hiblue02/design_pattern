## Proxy
### 개념
- 구조 패턴이다. 
- 프록시 객체를 통해 client와 acutal object를 연결하는 디자인 패턴이다. 
- 실제 객체로 요청울 보내기 전에, proxy 객체는 caching, security, loging, lazy loging 등 추가 작업을 처리할 수 있다.

### Chaning of Proxies
- 프록시 여러 개를 순차적으로 연결할 수 있다. 각 프록시는 다음 프록시나 실제 객체에 요청을 전달하기 전에 동작이나 검사를 추가한다. 

### 구성요소
#### Subject
- RealSubject와 Proxy Class가 공유하는 공통 인터페이스를 정의한 interface 또는 abstract class 
#### RealSubject
- Proxy가 나타내는 실제 객체이다. 
- 클라이언트 코드가 접근하려는 비즈니스 로직이나 자원을 갖고 있다. 
#### Proxy
- RealSubject의 대리자나 자리 표시자 역할을 한다. Proxy는 실제 객체에 대한 접근을 제어하며, lazy loading, access control, logging 등의 추가 기능을 제공한다. 

### 프록시 패턴이 필요한 경우
#### Lazy Loading
- 객체 생성 또는 초기화가 많은 자원을 소모하는 경우, 프록시는 실제 객체의 생성을 필요한 시점까지 지연시킨다. 
#### Access Control 
- GateKeeper 역할을 하며, 보안 조건을 확인하거나 특정 조건이 충족될 때만 실제 객체에 접근하도록 제한할 수 있다. 
#### Caching
- 프록시는 결과나 데이터를 저장하는 캐싱 메커니즘을 구현할 수 있다. 반복적인 작업이나 데이터 가져오기를 최적화해 성능을 향상시킨다. 
#### Logging and Monitoring
- 실제 객체로 향하는 메서드 호출을 가로채어 정보를 기록하거나 사용량을 추적하거나 성능을 측정할 수 있다. 이를 통해 실제 객체를 수정하지 않고도 로깅 및 모니터링 기능을 추가할 수 있다. 

### 스프링AOP와 프록시 패턴
- 스프링 AOP는 런타임에 동적으로 프록시 객체를 생성하여 subject에 부가적인 동작을 추가한다. 
- 대상 객체를 감싸고, 메서드 호출 시 Aspect를 실행한 후 실제 객체의 메서드를 호출한다. 
- 동적 프록시 Dynamic Proxy
  - 인터페이스 기반의 객체에는 Java의 동적 프록시를, 클래스 기반 객체에는 CGLIB을 사용합니다. 
  

참고
- https://www.geeksforgeeks.org/proxy-design-pattern/

