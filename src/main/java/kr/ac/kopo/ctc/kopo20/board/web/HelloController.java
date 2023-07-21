package kr.ac.kopo.ctc.kopo20.board.web;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.HttpServletRequest;
import kr.ac.kopo.ctc.kopo20.board.domain.Hello;

@Controller
@RequestMapping(value = "/hello")
public class HelloController {

	@RequestMapping(value = "")
	public String helloSpringBoot(Model model) {
		model.addAttribute("name", "홍길동");
		return "hello";
	}
	
	@RequestMapping(value = "/getParameter")
	public String getParameter(Model model, HttpServletRequest req) {
		String name = req.getParameter("name");
		model.addAttribute("name", name);
		return "hello";
	}
	
	@RequestMapping(value="/requestParam")
	public String requestParam(Model model, @RequestParam(value="name") String name) {
		model.addAttribute("name", name);
		return "hello";
	}
	
	@RequestMapping(value="/pathVariable/{name}")
	public String pathVariable(Model model, @PathVariable("name") String name) {
		model.addAttribute("name", name);
		return "hello";
	}
	
	@RequestMapping(value="/modelAttribute")
	public String modelAttribute(Model model, @ModelAttribute Hello hello) {
		model.addAttribute("name", hello.getName());
		return "hello";
	}
	
	@RequestMapping(value="/requestBody1")
	public String requestBody1(Model model, @RequestBody Map<String, Object> obj) {
		model.addAttribute("name", obj.get("name"));
		return "hello";
	}
	
	@RequestMapping(value="/requestBody2")
	public String requestBody2(Model model, @RequestBody Hello hello) {
		model.addAttribute("name", hello.getName());
		return "hello";
	}

}
