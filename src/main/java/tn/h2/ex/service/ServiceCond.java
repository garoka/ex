package tn.h2.ex.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.h2.ex.repo.Candidatrepo;
import tn.h2.ex.entity.condidat;
import java.util.List;

@Service
public class ServiceCond implements IService {
    @Autowired
    public static Candidatrepo candidatrepo;

    public static List<condidat> getalll() {
        return candidatrepo.findAll();
    }

    @Override
    public List<condidat>getall(){
        return candidatrepo.findAll();
    }
    @Override
    public void savecon(condidat c) {
        candidatrepo.save(c);
    }



}
