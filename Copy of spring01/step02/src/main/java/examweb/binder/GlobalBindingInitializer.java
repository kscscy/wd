package examweb.binder;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.log4j.Logger;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.InitBinder;

@ControllerAdvice
public class GlobalBindingInitializer {

	private static final Logger logger = Logger.getLogger(GlobalBindingInitializer.class); 
	
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		logger.debug("initBinder() 호출됨");
		// 1) 변환기 준비 : 
		// 문자열(java.lang.String) => 날짜 객체(java.util.Date)
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		dateFormat.setLenient(false); // 형식에 맞지 않으면 엄격하게 오류를 발생한다.
		
		// 2) 프론트 컨트롤러가 넘겨준 관리대장에 기록한다.
		binder.registerCustomEditor(
				Date.class, // target type : 문자열을 이 타입의 객체로 바꿔야 한다.
				new CustomDateEditor(	//변환기
						dateFormat, 	// 실제 변환 작업을 할 객체
						false)				// null 허용 여부
				);	
	}
}
