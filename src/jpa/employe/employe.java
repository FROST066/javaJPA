package jpa.employe;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity @Table(name="EMPLOYE")
public class employe implements Serializable {
    
    @Id 
    private String matricule;
    private String mot_de_pass;
    private String nom_employe;
    private String prenom_employe;

    public employe() {
        this("unknow", "unknow", "unknow", "unknow");
    }

    public employe(String matricule, String mot_de_pass, String nom_employe, String prenom_employe) {
        this.matricule = matricule;
        this.mot_de_pass = mot_de_pass;
        this.nom_employe = nom_employe;
        this.prenom_employe = prenom_employe;
    }

    public String getMatricule() {
        return matricule;
    }

    public String getMot_de_pass() {
        return mot_de_pass;
    }

    public String getNom_employe() {
        return nom_employe;
    }

    public String getPrenom_employe() {
        return prenom_employe;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    public void setMot_de_pass(String mot_de_pass) {
        this.mot_de_pass = mot_de_pass;
    }

    public void setNom_employe(String nom_employe) {
        this.nom_employe = nom_employe;
    }

    public void setPrenom_employe(String prenom_employe) {
        this.prenom_employe = prenom_employe;
    }
}
