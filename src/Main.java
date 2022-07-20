
import jpa.ordinateur.Ordinateur_util;

public class Main {

    public static void main(String[] args) {
        Ordinateur_util util = new Ordinateur_util();
        util.ajouter_to_Ordinateur("HP", "QuadCore", 500, 12, 2.4);
        util.closeEntityManager();
    }

}
