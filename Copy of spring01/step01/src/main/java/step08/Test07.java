package step08;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test07 {

  public static void main(String[] args) throws Exception {

    // 스프링 설정 파일을 읽고 인스턴스를 준비하라!
    ApplicationContext context = new ClassPathXmlApplicationContext(
        "step08/application-context07.xml");
    
    // @Qualifier를 사용하여 Computer에 주입할 모니터 객체를 지정할 수 있따.
    System.out.println(context.getBean("c1"));
    
    // 스프링 IoC 컨테이너에 들어있는 객체를 출력하기
    String[] names = context.getBeanDefinitionNames();
    for (String name : names)
      System.out.printf("%s : %s\n",
          name,
          context.getBean(name).getClass().getName());
  }
}
