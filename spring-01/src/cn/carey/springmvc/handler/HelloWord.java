package cn.carey.springmvc.handler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.sun.swing.internal.plaf.metal.resources.metal;

@Controller
public class HelloWord {
	/*
	 * rest风格的url
	 * 以crud为例
	 * 新增：、order  post
	 *  
	 */
	@RequestMapping("/testRedirect")
	public String testRedirect() {
		System.out.println("testRedirect");
		return "redirect:/index.jsp";
	}
	
	
	@RequestMapping("/testview")
	public String testview() {
		System.out.println("testview");
		return "helloView";
	}
	
	public void name() {
		ModelAndView andView=new ModelAndView("success");
	}
	
	@RequestMapping("/testcookiesvalue")
	public String testcookiesvalue(@CookieValue("JSESSIONID") String sessionID) {
		System.out.println("============"+sessionID);
		return "success";
	}
	@RequestMapping("/testrequestParam")
	public String testrequestParam(@RequestParam(value= "username",required=false)String username,
			@RequestParam("age")String age) {
		System.out.println(username+"============"+age);
		return "success";
	}
	
	
	
	
	@RequestMapping("/testAntPath2/{name}")
	public String testAntPath2(@PathVariable("name") String name) {
		System.out.println(name);
		return  "success";
	}
	// @RequestMapping("/testAntPath/*/abc")
	// public String testAntPath() {
	// return "success";
	// }
	
	
	
	
	
	
	@RequestMapping("/helloword")
	public String hello() {
		System.out.println("hello word");
		return "success";
	}
	
	@RequestMapping(value="/testMethod",method=RequestMethod.POST)
	public String testMethod() {
		System.out.println("hello word");
		return "success";
	}
	
	@RequestMapping(value="/testMethodAndHanders",params={"username","age!=10"})
	public String testMethodAndHanders() {
		System.out.println("hello word");
		return "success";
	}
	
	
	
	
	
}
