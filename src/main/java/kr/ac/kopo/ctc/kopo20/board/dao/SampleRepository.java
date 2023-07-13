package kr.ac.kopo.ctc.kopo20.board.dao;

import java.util.*;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import kr.ac.kopo.ctc.kopo20.board.domain.Sample;

@Repository
public interface SampleRepository extends JpaRepository<Sample, Long>, JpaSpecificationExecutor<Sample> {//상속받고 있다
   //검색, 페이지네이션, 오름/내림차순
   
   Optional<Sample> findOneBytitle(String title);
   
   Page<Sample> findAllById(Long id, Pageable pageable);
   
   List<Sample> findAllById(Long id);

   Page<Sample> findAll(Pageable pageable);
}