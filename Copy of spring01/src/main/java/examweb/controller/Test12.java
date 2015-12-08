package examweb.controller;

import java.net.URLEncoder;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/test12/*") // 확장자를 붙이지 않는 것이 유지보수에 좋다.
public class Test12 {
	
	/* 파라미터로 쿠키 값 받기
	 * => 메서드 파라미터 앞에 @CookieValue를 붙여라
	 * => @CookieValue 를 붙이면 필수 항목이 된다.
	 * 		클라이언트에서 해당 쿠키를 안 보내면 오류가 발생한다.
	 * => 해결책 : 쿠키설정에서 기본 값을 정의하라
	 */
	@RequestMapping("e1")
	public String e1(
			@CookieValue(name="name", defaultValue="아몰랑") String name,
			@CookieValue(name="age", defaultValue="18") int age,
			HttpServletResponse response,
			Model model) throws Exception {
		
		model.addAttribute("name", name);
		model.addAttribute("age", age);

		// 쿠키의 값으로 멀티 바이트 문자 코드가 들어갈 수 없다.
		// 해결책 ? : URL인코딩 하여  =>ISO-8859-1형식으로 바꿔라
		// 만약 쿠키의 값이 URL 인코딩이 되어 있다면
		// 프론트 컨트롤러가 자동으로 디코딩하여 꼽아준다
		Cookie c1 = new Cookie("name", (
			URLEncoder.encode(name, "UTF-8") + "*"));
		Cookie c2 = new Cookie("age", Integer.toString((age + 1)));
		
		response.addCookie(c1); // 쿠키를 저장 하려면 이 방법 뿐이다...
		response.addCookie(c2);
		
		return "test12/e1";
	}
}
