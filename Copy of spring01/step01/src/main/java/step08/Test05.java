package step08;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test05 {

  public static void main(String[] args) throws Exception {

    // 스프링 설정 파일을 읽고 인스턴스를 준비하라!
    ApplicationContext context = new ClassPathXmlApplicationContext(
        "step08/application-context05.xml");
    
    // monitor property에 주입할 객체가 여러 개라서 오류 발생
    // => 해결책 ? 어떤 객체를 주입할 지 지정하라
    System.out.println(context.getBean("c1"));
  }
}
