package step07;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test01 {

  public static void main(String[] args) throws Exception {

    // 스프링 설정 파일을 읽고 인스턴스를 준비하라!
    ApplicationContext context = new ClassPathXmlApplicationContext(
        "step07/application-context01.xml");
    
    // 기본이 singleton
    Computer p1 = (Computer) context.getBean("c1");
    Computer p2 = (Computer) context.getBean("c1");
    
    if (p1 == p2) {
      System.out.println("p1 == p2");
    }
    
    Computer p3 = (Computer) context.getBean("c2");
    Computer p4 = (Computer) context.getBean("c2");
    
    if (p3 == p4) {
      System.out.println("p3 == p4");
    }
    
    Computer p5 = (Computer) context.getBean("c3");
    Computer p6 = (Computer) context.getBean("c3");
    
    if (p5 == p6) {
      System.out.println("p5 == p6");
    }
    System.out.println(p1.hashCode());
    System.out.println(p2.hashCode());
    System.out.println(p3.hashCode());
    System.out.println(p4.hashCode());
    System.out.println(p5.hashCode());
    System.out.println(p6.hashCode());

  }
}
