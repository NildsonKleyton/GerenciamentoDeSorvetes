package util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *  
 * A classe JPAUtil tem a funcionalidade de disponibilizar as EntityManager <b>(conexões com o banco de dados)</b>.
 * Também é uma classe sington, sóvai existir uma instancia dessa classe no projeto todo.
 *
 * @author Nildson Kleyton
 */

public class JpaUtil {
	private static EntityManagerFactory factory;

    static {
        factory = Persistence.createEntityManagerFactory("PROJETOMV");
    }

    public static EntityManager getEntityManager() {
        return factory.createEntityManager();
    }

    public static void close() {
        factory.close();
    }
}
