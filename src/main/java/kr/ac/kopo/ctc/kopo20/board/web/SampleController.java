package kr.ac.kopo.ctc.kopo20.board.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import kr.ac.kopo.ctc.kopo20.board.dao.SampleRepository;
import kr.ac.kopo.ctc.kopo20.board.domain.Sample;

@Controller
public class SampleController {
	
	@Autowired
	private SampleRepository sampleRepository;
	
	@RequestMapping(value = "/sample/list")
	@ResponseBody
	public List<Sample> list(Model model){
		return sampleRepository.findAll();
	}

}
