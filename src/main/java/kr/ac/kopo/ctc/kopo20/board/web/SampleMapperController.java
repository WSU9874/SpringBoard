//package kr.ac.kopo.ctc.kopo20.board.web;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.ResponseBody;
//
//import kr.ac.kopo.ctc.kopo20.board.dao.SampleMapper;
//import kr.ac.kopo.ctc.kopo20.board.domain.Sample;
//
//public class SampleMapperController {
//
////	private static final Logger Logger = LoggerFactory.getLogger(SampleMapperController.class);
//
//	@Autowired
//	SampleMapper sampleMapper;
//
//	
//	   @RequestMapping(value = "/sample3")
//	   @ResponseBody 
//	public List<Sample> findAll() {
//		List<Sample> samples = sampleMapper.findAll();
////		for (Sample sample : samples) {
////			Logger.info(sample.getId());
////		}
//		return samples;
//	}
//}
