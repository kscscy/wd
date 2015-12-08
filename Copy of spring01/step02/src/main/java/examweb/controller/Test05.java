package examweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/test05/") // 확장자를 붙이지 않는 것이 유지보수에 좋다.
public class Test05 {

	@RequestMapping("e1")
	public String execute1() {
		System.out.println("Test05.e1()");
		return "/test05/e1.jsp";
	}
	@RequestMapping("e2")
	public String execute2() {
		System.out.println("Test05.e2()");
		return "/test05/e2.jsp";
	}
	@RequestMapping("e3")
	public String execute3() {
		System.out.println("Test05.e3()");
		return "/test05/e3.jsp";
	}
}
