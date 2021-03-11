package ir.bigz.quartzsimple.repository;

import ir.bigz.quartzsimple.domain.MemberClass;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface ClassRepository extends JpaRepository<MemberClass, Long>, JpaSpecificationExecutor {

    List<MemberClass> findAllByNameContainsIgnoreCase(String searchString);
}
