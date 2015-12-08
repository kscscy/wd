package examweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping // 확장자를 붙이지 않는 것이 유지보수에 좋다.
public class Test02 {

	@RequestMapping("/test02")
	public void execute() {
		System.out.println("Test02.execute()");
		
	}
}
