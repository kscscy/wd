package step06;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test03 {

  public static void main(String[] args) throws Exception {

    // 스프링 설정 파일을 읽고 인스턴스를 준비하라!
    ApplicationContext context = new ClassPathXmlApplicationContext(
        "step06/application-context03.xml");
    
    System.out.println(context.getBean("c1"));
    System.out.println(context.getBean("c2"));
    //System.out.println(context.getBean("c3"));
    
    
    /*  get은 호출할때만?
     *  setType()
        setType()
        setType()
        getObject()
        Computer [model=울트라 게이밍 No.1, maker=용산컴, ram=16, speed=4.2, monitor=null, options=null, storage=null, sepecs=null]
        getObject()
        Computer [model=사무용날쌘돌이, maker=아무나컴, ram=2, speed=2.0, monitor=null, options=null, storage=null, sepecs=null]
     */
  }
}
