package kr.ac.kopo.ctc.kopo20.board.web;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import kr.ac.kopo.ctc.kopo20.board.dao.SampleMapper;
import kr.ac.kopo.ctc.kopo20.board.dao.SampleRepository;
import kr.ac.kopo.ctc.kopo20.board.domain.Sample;

@Controller
public class SampleController {

	@Autowired
	private SampleRepository sampleRepository;
	
	@Autowired
	private SampleMapper sampleMapper;

	@RequestMapping(value = "/sample1")
//우리는 특정 uri로 요청을 보내면 Controller에서 어떠한 방식으로 처리할지 정의를 한다.
//이때 들어온 요청을 특정 메서드와 매핑하기 위해 사용하는 것이 @RequestMapping이다.
//value는 요청받을 url을 설정하게 된다.
//method는 어떤 요청으로 받을지 정의하게 된다.(GET, POST, PUT, DELETE 등)

	@ResponseBody
	// 이 어노테이션이 붙은 파라미터에는 http요청의 본문(body)이 그대로 전달된다.
	// @ResponseBody 가 붙은 파라미터가 있으면 HTTP요청의 미디어타입과 파라미터의 타입을 먼저 확인한다.
	public List<Sample> list(Model model) {

		PageRequest pageable = PageRequest.of(0, 10);
		List<Sample> list12 = sampleRepository.findAll();
		return list12;
	}

	@RequestMapping(value = "/sample2")
	@ResponseBody // 자바객체를 HTTP요청의 바디내용으로 매핑하여 클라이언트로 전송한다
	public Page<Sample> list2(Model model) {

		Map<String, Object> filter = new HashMap<String, Object>();
		filter.put("title", "a");

		PageRequest pageable = PageRequest.of(0, 10);
//      Page<Sample> page =
//            sampleRepository.findAllById((long)1,pageable); id가 1인 title만 가져옴
		Page<Sample> page = sampleRepository.findAll(pageable);
		return page;
	}
	
	
	//===================================================================================


	@RequestMapping(value = "/sample3")
	@ResponseBody
	public List<Sample> list3() {
		List<Sample> list3 = sampleMapper.findAllEUIYEOB();
		return list3;
	}

}