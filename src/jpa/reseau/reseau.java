package jpa.reseau;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity @Table(name="RESEAU")
public class reseau implements Serializable {
    
@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_reseau;
    private String nom;
    
    public reseau() {
        this("unknow");
    }

    public reseau(String nom) {
        this.nom = nom;
    }

    public int getId_reseau() {
        return id_reseau;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
}
