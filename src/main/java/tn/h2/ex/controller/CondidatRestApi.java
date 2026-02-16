package tn.h2.ex.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tn.h2.ex.entity.condidat;
import tn.h2.ex.service.ServiceCond;

import java.util.List;

@RestController

public class CondidatRestApi {
    public String title ="Title working";
    private ServiceCond serviceCond;
    @RequestMapping("/hello")
    public String getTitle() {
        return title;
    }

    @PostMapping
    public String saveCandidat(@RequestBody condidat ca) {
        try {
            serviceCond.savecon(ca);
            return "saved";
        }catch(Exception e) {
            return e.getMessage();
        }
    }
}
