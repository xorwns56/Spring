<img src="/images/springboot.png" width="80%"/><br/>
## 개발 환경 설정
1. **JDK 설치 및 환경 변수 설정**
    * [JDK 설치](https://www.oracle.com/kr/java/technologies/downloads/archive/)
    * [제어판] - [시스템] - [고급 시스템 설정] - [환경변수] - [시스템 변수]<br/>
      `JAVA_HOME` 변수 새로 만들고 `JDK가 위치한 경로` 추가, `PATH` 변수에 `JAVA_HOME/bin` 추가
2. **IDE 설치**
    * [Spring Tool Suite](https://spring.io/tools) (Spring 기반의 개발을 지원하는 특수한 버전의 Eclipse)
3. **프로젝트 생성**
    * File > New > Spring Starter Project 선택</br>
      의존성 선택 - Spring Web, JDBC API, MyBatis Framework, MariaDB Driver(사용하는 DB의 드라이버)
      <img src="/images/new-project-setting.png" width="40%"/> <img src="/images/new-project-setting2.png" width="40%"/>
    * 설치된 JDK 버전과 다른 버전을 선택했을 시, 빌드 설정 파일을 JDK에 맞게 수정
4. **환경 구동 확인**
    * 프로젝트 우클릭 > Run As Spring Boot App<br/>
      <img src="/images/console-check.png" width="80%"/>
    * 브라우저에서 http://localhost:8080 접근하여 확인<br/>
      <img src="/images/browser-check.png" width="80%"/>
