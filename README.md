# Spring Cloud Study

1. Spring Cloud API Gateway - Zuul


## 기본개념

**소제목**

내용

## 시작하기

모든 소스코드는 IntelliJ + Window10 + JAVA 8 환경에서 작성되었습니다.

### MAVEN을 이용한 의존성 프로젝트 추가

이 프로젝트에서는 아래 같은 **의존성 프로젝트**가 포함되어있습니다. 

**pom.xml** 파일에 아래와 같이 **의존성 프로젝트**를 추가해 주세요.

```
<dependencies>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-data-redis</artifactId>
        </dependency>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-security</artifactId>
        </dependency>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-web</artifactId>
        </dependency>
        <dependency>
            <groupId>org.springframework.cloud</groupId>
            <artifactId>spring-cloud-starter-netflix-zuul</artifactId>
        </dependency>
        <dependency>
            <groupId>org.springframework.session</groupId>
            <artifactId>spring-session-data-redis</artifactId>
        </dependency>

        <dependency>
            <groupId>org.projectlombok</groupId>
            <artifactId>lombok</artifactId>
            <optional>true</optional>
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
        <dependency>
            <groupId>org.springframework.security</groupId>
            <artifactId>spring-security-test</artifactId>
            <scope>test</scope>
        </dependency>
    </dependencies>
```

## 소스 코드



## 실행하기

window 10 환경

- `jdk8` 과 `maven` 을 설치합니다.
- `JAVA_JOME` 환경변수 설정을 합니다.
- `Path`에 `maven` 환경변수 설정을 합니다.spring boot 앱 실행

```
mvn spring-boot:run
```

- 중지하려면, 키보드에서 `Crtl + C`를 누릅니다.
- `application.properties` 파일이 필요합니다.

AWS EC2 Ubuntu 환경

- `jdk8` 과 `maven` 을 설치합니다.

백 그라운드 spring boot 앱 실행

```
nohup mvn spring-boot:run&
```

- 중지하려면,  `netstat -tnlp` 명령어를 통해 프로세스를 kill 하십시오.
- `application.properties` 파일이 필요합니다.

## 사용된 도구

* [Spring-boot](https://projects.spring.io/spring-boot/) - Spring-boot Web Framework
* [Maven](https://maven.apache.org/) - 의존성 관리 프로그램
* [IntelliJ IDEA](https://www.jetbrains.com/idea/) - IDEA
* [lombok](https://projectlombok.org/)
* [Redis](https://github.com/MicrosoftArchive/redis/releases) - 데이터베이스

## 저자

* **배다슬** - [bghgu](https://github.com/bghgu)


[기여자 목록](https://github.com/bghgu/Spring-Cloud-Study/graphs/contributors)을 확인하여 이 프로젝트에 참가하신 분들을 보실 수 있습니다.

## 감사 인사

* [http://blog.eomdev.com/](http://blog.eomdev.com/java/2016/05/30/API-Gateway.html)
* [우아한 형제들 기술 블로그](http://woowabros.github.io/r&d/2017/06/13/apigateway.html)

---


