package tn.h2.ex.service;

import org.springframework.stereotype.Service;
import tn.h2.ex.entity.Facteur;
import tn.h2.ex.repo.Factuerrepo;
import java.util.List;

@Service
public class ServiceFacteur implements FIService {

    private final Factuerrepo frepo;

    // Constructor injection
    public ServiceFacteur(Factuerrepo frepo) {
        this.frepo = frepo;
    }

    @Override
    public void saveF(Facteur c) {
        frepo.save(c);
    }

    @Override
    public List<Facteur> getall() {
        return frepo.findAll();
    }

    public float Allfacteurprice() {
        float total = 0;
        List<Facteur> facteurs = frepo.findAll();
        for (Facteur f : facteurs) {
             total += f.getmontant();
        }
        return total;
    }


    public List<Facteur> getfacteurStatus(String status) {
        List<Facteur> facteurs = frepo.findByStatus(status);
        return facteurs;
    }
    public int contALL(){
        return (int) frepo.count();
    }

    public void Delete(int id){
        frepo.deleteById(id);
    }
}