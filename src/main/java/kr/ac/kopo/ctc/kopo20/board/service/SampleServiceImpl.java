package kr.ac.kopo.ctc.kopo20.board.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;
import kr.ac.kopo.ctc.kopo20.board.dao.SampleRepository;
import kr.ac.kopo.ctc.kopo20.board.domain.Sample;

@Service
public class SampleServiceImpl implements SampleService {

	@Autowired
	private SampleRepository sampleRepository;

	@Override
	public String testNoAop() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String testAop() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@Transactional
	public String testTransactional() {
		// TODO Auto-generated method stub
		Sample sample = sampleRepository.findById(1L).get();
		sample.setTitle("update1");
		sampleRepository.save(sample);

		throw new RuntimeException("Spring Boot Transactional");
	}
	// 한줄씩 실행하는데 exception이 발생하면 전부 적용하지 않는다

	@Override
	public String testNoTransactional() {
		Sample sample = sampleRepository.findById(1L).get();
		sample.setTitle("update1");
		sampleRepository.save(sample);

		throw new RuntimeException("Spring Boot No Transactional");
	}
	//한줄씩 샐행하면서 exception이 발생하면 실행된 것은 젹용한다.
}
	
