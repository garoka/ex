package tn.h2.ex.repo;

import org.aspectj.apache.bcel.util.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import tn.h2.ex.entity.Facteur;

import java.util.List;

public interface Factuerrepo extends JpaRepository<Facteur,Integer>{
    @Query("SELECT f FROM Facteur f WHERE f.status = :status")
    List<Facteur> findByStatus(@Param("status") String status);

}
