package kr.ac.kopo.ctc.kopo20.board.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import kr.ac.kopo.ctc.kopo20.board.domain.Sample;

@Repository
public interface SampleRepository extends JpaRepository<Sample, Long>{

}
