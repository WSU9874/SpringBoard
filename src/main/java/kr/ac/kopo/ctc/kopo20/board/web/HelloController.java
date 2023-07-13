package kr.ac.kopo.ctc.kopo20.board.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.ac.kopo.ctc.kopo20.board.dao.SampleRepository;
import kr.ac.kopo.ctc.kopo20.board.service.BoardItemService;

@Controller
public class HelloController {

	@Autowired
	private BoardItemService boardItemService;

	@RequestMapping(value = "/hello")
	public String helloSpringBoot(Model model) {

		int sum = boardItemService.add(3, 5);

		model.addAttribute("name", "홍길동");
		model.addAttribute("sum", sum);
		return "hello";
	}

}
