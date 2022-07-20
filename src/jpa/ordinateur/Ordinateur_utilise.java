package jpa.ordinateur;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import jpa.employe.Employe;

@Entity @Table(name = "ORDINATEUR_UTILISE")
public class Ordinateur_utilise implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_ordinateur_utilise;
    private int id_ordinateur;
    private int matricule;

    @ManyToOne
    @JoinColumn(name = "matricule", nullable = false,insertable=false, updatable=false)
    private Employe employe;

    public Employe getEmploye() {
        return this.employe;
    }

    @ManyToOne
    @JoinColumn(name = "id_ordinateur", nullable = false,insertable=false, updatable=false)
    private Ordinateur ordinateur;

    public Ordinateur getOrdinateur() {
        return this.ordinateur;
    }

    public Ordinateur_utilise() {
        this(0, 0);
    }

    public Ordinateur_utilise(int id_ordinateur, int matricule) {
        this.id_ordinateur = id_ordinateur;
        this.matricule = matricule;
    }

    public int getMatricule() {
        return matricule;
    }

    public void setMatricule(int matricule) {
        this.matricule = matricule;
    }
}
