package step08;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test04 {

  public static void main(String[] args) throws Exception {

    // 스프링 설정 파일을 읽고 인스턴스를 준비하라!
    ApplicationContext context = new ClassPathXmlApplicationContext(
        "step08/application-context04.xml");
    
    // @Autowired 처리 후
    System.out.println(context.getBean("c1"));
  }
}
