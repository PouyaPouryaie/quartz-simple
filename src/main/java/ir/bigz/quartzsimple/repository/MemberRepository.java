package ir.bigz.quartzsimple.repository;

import ir.bigz.quartzsimple.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;


public interface MemberRepository extends JpaRepository<Member, Long> , JpaSpecificationExecutor {
}
