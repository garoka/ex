package tn.h2.ex.controller;

import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;
import tn.h2.ex.entity.Facteur;
import tn.h2.ex.service.ServiceFacteur;

import java.util.List;

@RestController
@RequestMapping("/facteur")
public class FacteurContr {

    private final ServiceFacteur SR;

    public FacteurContr(ServiceFacteur SR) {
        this.SR = SR;
    }

    @GetMapping("/all1")
    public String All() {
        List<Facteur> list = SR.getall();
        list.forEach(f -> System.out.println(f)); // Utilise toString()
        return SR.getall().toString();
    }
    @GetMapping("/all")
    public List<Facteur> Alla() {

        return SR.getall();
    }


    @PostMapping("/cr")
    public String CR(@RequestBody Facteur fac) {
        SR.saveF(fac);
        return "Saved";
    }

    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable int id) {
        SR.Delete(id);
        return "Deleted";
    }
    @GetMapping("/caisse")
    public float Count() {
        return SR.Allfacteurprice();
    }
    @GetMapping("/Number")
    public int Somme() {
        return SR.contALL();
    }




}
