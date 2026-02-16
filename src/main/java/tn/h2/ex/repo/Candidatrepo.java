package tn.h2.ex.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import tn.h2.ex.entity.condidat;

public interface Candidatrepo extends JpaRepository < condidat,Integer>{
  //  @Query("select c from Condidat c where c.nom like :name")
    //public condidat findByNom(@Param("name") String name);
}
