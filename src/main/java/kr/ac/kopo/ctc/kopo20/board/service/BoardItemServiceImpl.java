package kr.ac.kopo.ctc.kopo20.board.service;

import org.springframework.stereotype.Service;

@Service
public class BoardItemServiceImpl implements BoardItemService {
	
	@Override
	public int add(int a, int b) {
		return a + b;
	}

}
