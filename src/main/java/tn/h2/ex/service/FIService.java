package tn.h2.ex.service;

import tn.h2.ex.entity.Facteur;

import java.util.List;

public interface FIService {
    public List<Facteur> getall();
    public void saveF(Facteur condidat);
}

