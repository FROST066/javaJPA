package jpa.logiciel;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity @Table(name="LOGICIEL")
public class Logiciel implements Serializable {
    
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_logiciel;
    private String nom_logiciel;
    private String type;
    private String version;

    public Logiciel() {
        this("unknow", "unknow", "unknow");
    }

    public Logiciel(String nom_logiciel, String type, String version) {
        this.nom_logiciel = nom_logiciel;
        this.type = type;
        this.version = version;
    }

    public int getId_logiciel() {
        return id_logiciel;
    }

    public String getNom_logiciel() {
        return nom_logiciel;
    }

    public String getType() {
        return type;
    }

    public String getVersion() {
        return version;
    }

    public void setId_logiciel(int id_logiciel) {
        this.id_logiciel = id_logiciel;
    }

    public void setNom_logiciel(String nom_logiciel) {
        this.nom_logiciel = nom_logiciel;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setVersion(String version) {
        this.version = version;
    }
}
