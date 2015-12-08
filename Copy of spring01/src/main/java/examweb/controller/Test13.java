package examweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
@RequestMapping("/test13/*") // 확장자를 붙이지 않는 것이 유지보수에 좋다.
public class Test13 {
	
	/* GET과 POST 구분하기
	 */
	@RequestMapping(value="e1", method=RequestMethod.GET)
	public String get() throws Exception {
		return "test13/get";
	}
	
	@RequestMapping(value="e1", method=RequestMethod.POST)
	public String post() throws Exception {
		return "test13/post";
	}
}
