
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import jpa.reseau.reseau;


public class Main {

    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = null;
        EntityManager entityManager = null;
        try {
            entityManagerFactory = Persistence.createEntityManagerFactory("Gestion_Park");
            entityManager = entityManagerFactory.createEntityManager();
            
            System.out.println( "- Insertion d'un nouvel article ----------" );
            
            EntityTransaction trans = entityManager.getTransaction();
            trans.begin();
            
            reseau rs = new reseau("HOUNDJO");
            entityManager.persist(rs);
        trans.commit();
        } finally {
            if ( entityManager != null ) entityManager.close();
            if ( entityManagerFactory != null ) entityManagerFactory.close();
        }
    }
    
}
