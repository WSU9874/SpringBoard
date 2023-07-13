package kr.ac.kopo.ctc.kopo20.board.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import kr.ac.kopo.ctc.kopo20.board.domain.Sample;


@Mapper
@Repository
public interface SampleMapper {
	List<Sample> findAllEUIYEOB();

}
