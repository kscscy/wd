package wd.controller;

import java.util.HashMap;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import wd.dao.UserDao;
import wd.domain.User;

@Controller
@RequestMapping("/auth/*")
public class AuthController {

	@Autowired UserDao userDao; // 인터페이스를 구현한 객체 주소
	
	@RequestMapping(value="login", method=RequestMethod.GET)
	public String loginform(){
		return "auth/LoginForm";
	}
	
	@RequestMapping(value="login", method=RequestMethod.POST)
	public String login(
			String id,
			String password,
			String saveId,
			HttpServletResponse response,
			HttpSession session) {
		response.setContentType("text/plain;charset=UTF-8");
		
		Cookie idCookie = null;

		if (saveId != null) { 
			idCookie = new Cookie("id", id);
			idCookie.setMaxAge(60 * 60 * 24 * 15);
			response.addCookie(idCookie);
			
		} else {
			idCookie = new Cookie("id", "");
			idCookie.setMaxAge(0); 
			
		}
		response.addCookie(idCookie);
		
		HashMap<String, Object> paramMap = new HashMap<>();
		paramMap.put("id", id);
		paramMap.put("password", password);
		
		User user = userDao.login(paramMap);
		
		if (user == null) {
			session.invalidate(); 
			return "/auth/LoginFail";
		}
		session.setAttribute("loginUser", user);
		return "redirect:../board/list.do";
	}
	
	@RequestMapping("logout")
	public String logout(HttpSession session) {
		session.invalidate();
		return "redirect:login.do";
	}
}
