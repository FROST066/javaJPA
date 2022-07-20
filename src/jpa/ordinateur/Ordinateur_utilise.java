package jpa.ordinateur;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import jpa.employe.Employe;

@Entity @Table(name="ORDINATEUR_UTILISE")
public class Ordinateur_utilise extends Ordinateur_dispo {

    private int id_employe;

    @ManyToOne
    @JoinColumn(name = "id_employe", nullable = false)
    private Employe employe;

    public Ordinateur_utilise() {
        this(0, 0);
    }

    public Employe getEmploye(){return this.employe;}
    public Ordinateur_utilise(int id_ordinateur, int id_employe) {
        super(id_employe);
        this.id_employe = id_employe;
    }

    public int getId_employe() {
        return id_employe;
    }

    public void setId_employe(int id_employe) {
        this.id_employe = id_employe;
    }

}
