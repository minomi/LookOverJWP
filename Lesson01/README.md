### 1장 웹 어플리케이션의 이해

1장에서는 간단한 계산기 클라이언트, 서버 를 만들어 봤다. 공부한 내용은

*	##### 클라이언트 - 서버 아키텍쳐는 어떻게 발전해 봤는가?
*  ##### 웹 어플리케이션 서버가 필요한 이유가 무엇인가?

에 대해서 공부했다.

시간이 촉박하니 코드는 직접 작성해보지 않고 작성된 코드를 읽어보면서 책 내용을 따라 갔다. 중간에 멀티스레드를 이용해 다수의 계산기 클라이언트 request를 처리하는 부분에서는 어저께 공부했던 Thread Pool 을 적용 시켜 보았다.

#### 간단정리

##### 클라이언트 - 서버 아키텍쳐의 발전

1. 클라이언트 - 서버(DBMS)
	*	클라이언트가 바로 DBMS 에 접속하기 때문에 보안에 취약
	*  배포가 어려움
2. 클라이언트 - 어플리케이션 서버 - 서버(DBMS)
	*  비즈니스 로직을 `어플리케이션 서버`가 처리
	*  클라이언트가 바로 DBMS에 접속하는 상황을 없에서 보안 증가
	*  전통적인 C/S 아키텍쳐 보다 배포가 용이해짐
3. (웹 기술 적용) 클라이언트 - 웹 서버 - 어플리케이션 서버 - DBMS 서버
	* 클라이언트와의 통신은 웹 서버가 담당 (멀티스레드 프로그래밍에서 탈출)
	* 어플리케이션 서버는 어플리케이션 실행 및 관리에 집중

##### 웹 어플리케이션의 필요성

* 빠르게 발전하는 IT 기술의 변화에 대처하기 위해 잦은 시스템 변경이 필요함
* 기존의 C/S 환경에서는 불가능 했음
* 웹 어플리케이션 서버를 두면 서버 단에서 웹 어플리케이션을 자유롭게 수정, 배포 가능함