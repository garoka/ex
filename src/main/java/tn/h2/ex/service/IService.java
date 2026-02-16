package tn.h2.ex.service;

import tn.h2.ex.entity.condidat;

import java.util.List;

public interface IService {
    public List<condidat> getall();
    public void savecon(condidat condidat);
}
