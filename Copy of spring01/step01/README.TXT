[주제 : 스프링 IoC 컨테이너 사용법]
step01 (11/9)
  > Test01.java - 일반적인 객체 생성
  > Test02.java - 스프링 IoC 컨테이너를 이용한 객체 생성
  > Test03.java - bean의 아이디(id)와 이름(name)
  > Test04.java - bean의 이름과 별명 알아내기
  > Test05.java - 익명 bean

step02
  > Test01.java - 생성자 지정하기
  > Test02.java - 다양한 type을 갖는 생성자 호출하기  
  > Test03.java - argument type을 지정하지 않을 때, String type 우선됨
  > Test04.java - argument를 설정하는 다양한 방법
  > Test05.java - argument의 Index 지정하기

step03(11/10)
  > Test01.java - property 값 설정하기
  > Test02.java - <bean>의 속성을 이용하여 property 값 설정하기
  > Test03.java - <bean>의 속성을 이용하여 생성자 호출하기
  
step04
  > Test01.java - 의존 객체 주입  
  > Test01.java - property에 직접 객체를 생성하여 넣기
  
step05
  > Test01.java - 배열 property 값 설정하기   
  > Test02.java - List property 값 설정하기   
  > Test03.java - Set property 값 설정하기   
  > Test04.java - Map property 값 설정하기   
  
step06  
  > Test01.java - static Factory Method 호출하기
  > Test02.java - instance Factory Method 호출하기
  > Test03.java - 스프링에서 제안한 FactoryBean의 구현체 호출하기
  
step07 (11/11)
  > Test01.java - bean 생성 정책(bean scope) : singleton 과 prototype 비교
  > Test02.java - 날짜 property 값 입력하기 
  > Test03.java - PropertyEditor를 이용하여 날짜 변환기 설치하기
  > Test04.java - CustomPropertyEditor 만들기 두 번째 방법
  
step08
  > Test01.java - @Autowired 애노테이션을 처리 전
  > Test02.java - @Autowired 애노테이션을 처리 
  > Test03.java - @Autowired 는 필드에 붙여도 된다
  > Test04.java - @Autowired의 required 속성
  > Test05.java - 주입할 수 있는 의존 객체가 여러 개일 경우 오류 발생
  > Test06.java - @Qualifier 를  사용하여 주입할 객체를 지정한다.
  > Test07.java - @Autowired + @Qualifier = @Resource
  
step09
  > Test01.java - @Component 애노테이션 사용  
  
step10
  > Test01.java - 객체 생성 및 프로퍼티 설정 순서
step11(11/12)
  > Test01.java - log4j 사용 개요
  > Test02.java - log4j의 로깅 객체 생성과 사용 => 클래스 단위, 이름으로 묶기, 등급조정하기
  > Test03.java - 출력 담당자(appender) 지정. => ConsoleAppender 써보자
                  출력 형식 선언 => SimpleLayout, HTMLLayout, XMLLayout, PatternLayout
                  출력 패턴 지정
  > Test04.java - 출력 대상 지정
  