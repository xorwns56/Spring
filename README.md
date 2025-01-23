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
      <img src="/images/new-project-setting.png" width="40%"/> <img src="/images/new-project-setting2.png" width="40%"/>
    * 설치된 JDK 버전과 다른 버전을 선택했을 시, 빌드 설정 파일을 JDK에 맞게 수정
      <details>
      <summary><b>Gradle(Java 8)</b></summary>
      <table>
      <tr><th>build.gradle 수정</th></tr>
      <tr><td>
        
      ```gradle
      plugins {
        id 'java'
        id 'war'
        id 'org.springframework.boot' version '2.7.18'
        id 'io.spring.dependency-management' version '1.1.7'
      }
      
      group = 'com.example'
      version = '0.0.1-SNAPSHOT'
      sourceCompatibility = '1.8'
      targetCompatibility = '1.8'
      
      repositories {
        mavenCentral()
      }
      
      dependencies {
        implementation 'org.springframework.boot:spring-boot-starter-web'
        providedRuntime 'org.springframework.boot:spring-boot-starter-tomcat'
        testImplementation 'org.springframework.boot:spring-boot-starter-test'
        testRuntimeOnly 'org.junit.platform:junit-platform-launcher'
      }
      
      tasks.named('test') {
        useJUnitPlatform()
      }
      ```
      </td></tr>
      </table>
      </details>

      <details>
      <summary><b>Maven(Java 8)</b></summary>
      <table>
      <tr><th>pom.xml 수정</th></tr>
      <tr><td>
        
      ```xml
      <?xml version="1.0" encoding="UTF-8"?>
      <project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
      	xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 https://maven.apache.org/xsd/maven-4.0.0.xsd">
      	<modelVersion>4.0.0</modelVersion>
      	<parent>
      		<groupId>org.springframework.boot</groupId>
      		<artifactId>spring-boot-starter-parent</artifactId>
      		<version>2.7.18</version>
      		<relativePath/> <!-- lookup parent from repository -->
      	</parent>
      	<groupId>com.example</groupId>
      	<artifactId>spring-web-test</artifactId>
      	<version>0.0.1-SNAPSHOT</version>
      	<packaging>war</packaging>
      	<name>SpringWebTest</name>
      	<description>Spring Web Test project for Spring Boot</description>
      	<url/>
      	<licenses>
      		<license/>
      	</licenses>
      	<developers>
      		<developer/>
      	</developers>
      	<scm>
      		<connection/>
      		<developerConnection/>
      		<tag/>
      		<url/>
      	</scm>
      	<properties>
      		<java.version>1.8</java.version>
      	</properties>
      	<dependencies>
      		<dependency>
      			<groupId>org.springframework.boot</groupId>
      			<artifactId>spring-boot-starter-web</artifactId>
      		</dependency>
      
      		<dependency>
      			<groupId>org.springframework.boot</groupId>
      			<artifactId>spring-boot-starter-tomcat</artifactId>
      			<scope>provided</scope>
      		</dependency>
      		<dependency>
      			<groupId>org.springframework.boot</groupId>
      			<artifactId>spring-boot-starter-test</artifactId>
      			<scope>test</scope>
      		</dependency>
      	</dependencies>
      	<build>
      		<plugins>
      			<plugin>
      				<groupId>org.springframework.boot</groupId>
      				<artifactId>spring-boot-maven-plugin</artifactId>
      			</plugin>
      		</plugins>
      	</build>
      </project>
      ```
      </td></tr>
      </table>
      </details>
4. **환경 구동 확인**
    * 프로젝트 우클릭 > Run As Spring Boot App<br/>
      <img src="/images/console-check.png" width="80%"/>
    * 브라우저에서 http://localhost:8080 접근하여 확인<br/>
      <img src="/images/browser-check.png" width="80%"/>


## 개발 환경 설정(프론트엔드)
1. **ㅇㅇ**
   * [ㅇㅇ](https://nodejs.org/ko)

