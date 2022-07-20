package jpa.memoire;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity @Table(name="MEMOIRE")
public class Memoire implements Serializable {
    
@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_memoire;
    private String nom_memoire;
    private double capacite;

    public Memoire() {
        this("unknow",0);
    }

    public Memoire(String nom_memoire, double capacite) {
        this.capacite = capacite;
        this.nom_memoire = nom_memoire;
    }

    public int getId_memoire() {
        return id_memoire;
    }

    public double getCapacite() {
        return capacite;
    }

    public String getNom_memoire() {
        return nom_memoire;
    }

    public void setCapacite(double capacite) {
        this.capacite = capacite;
    }

    public void setNom_memoire(String nom_memoire) {
        this.nom_memoire = nom_memoire;
    }
}
