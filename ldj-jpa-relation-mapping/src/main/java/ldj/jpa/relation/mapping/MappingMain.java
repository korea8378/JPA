package ldj.jpa.relation.mapping;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class MappingMain {

    static EntityManagerFactory emf =
            Persistence.createEntityManagerFactory("jpabook");

    public static void main(String[] args) {

    }
}
