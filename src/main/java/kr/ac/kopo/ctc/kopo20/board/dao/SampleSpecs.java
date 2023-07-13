//package kr.ac.kopo.ctc.kopo20.board.dao;
//
//
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Map;
//
//import org.apache.catalina.User;
//import org.springframework.data.jpa.domain.Specification;
//
//
//public class SampleSpecs {
//	public static Specification<User> search(Map<String, Object> filter){
//		return (root, query, builder) -> {
//			List<Predicate> predicates = new ArrayList<>();
//			filter.forEach(key, value) -> {
//				switch(key) {
//				case ""
//				+"":
//				predicates.add(builder.equal(root.get(key).as(String.class),value));
//				}
//			};
//			return builder.and(predicates.toArray(new Predicate[0]));
//		};
//	}
//
//}
package kr.ac.kopo.ctc.kopo20.board.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.data.jpa.domain.Specification;
import jakarta.persistence.criteria.Predicate;
import kr.ac.kopo.ctc.kopo20.board.domain.Sample;

public class SampleSpecs {
   public static Specification<Sample> search(Map<String, Object> filter){
      return(root, query, builder) -> {
         List<Predicate> predicates = new ArrayList<>();
         filter.forEach((key, value) -> {
            switch(key) {
            case ""
                  +"":
                     predicates.add(builder.equal(root.get(key).as(String.class), value));
            }
         });
         return builder.and(predicates.toArray(new Predicate[0]));
      };
   }
}


