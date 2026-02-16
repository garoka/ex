package tn.h2.ex.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
@Entity
@Getter
@Setter
@Data


public class Facteur {
    @Id
    @GeneratedValue
    private int id;
    private String status;
    private String date;
    private float montant;
    private String modePaiement;
    public Facteur() {}
    public Facteur(String status, String date, float montant, String modePaiement) {
        this.status = status;
        this.date = date;
        this.montant = montant;
        this.modePaiement = modePaiement;
    }
    @Override
    public String toString() {
        return "Facteur{id=" + id +
                ", status='" + status + '\'' +
                ", date=" + date +
                ", montant=" + montant +
                ", modePaiement='" + modePaiement + '\'' +
                '}';
    }

    public float getmontant() {
        return montant;
    }
}

