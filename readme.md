# servlet-practices

### 1. Maven War project 만들기
1.	maven project 생성:  packaging =>  war
2.	project 선택(오른쪽메뉴)-> java EE Tools -> generate Deployment Descriptor Stub(web.xml)
3.	web.xml 에서 xmlns="http://JAVA.sun.com/xml/ns/javaee" 수정
4.	pom.xml 설정(helloweb 참고)


### 2. Build 설정
1.	JRE installed == Compile 버전 확인
2.	프로젝트 오른쪽마우스 -> build path configure java11
3.	project Facets module 2.5, java 11, runtime tomcat 9.0 설정
4.	mvn project update



### 3. applications
1. model1:model +jsp(controller, view)
	- emaillist01
	- guestbook01
	
2. model2:model + View(jsp) + Controller(Servlet)
	- emaillist02
	- guestbook02

3. mysite
	- mysite02
	
