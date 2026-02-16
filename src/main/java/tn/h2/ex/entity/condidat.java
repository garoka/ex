package tn.h2.ex.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
@Entity


public class condidat {
    @Id
    @GeneratedValue
    private int id;
    private String condidat;
    private String email;
    public condidat() {}
    public condidat(String condidat ,String email) {
         this.condidat = condidat;
        this.email = email;
}

}
