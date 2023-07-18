package hellojpa;

import javax.persistence.Persistence;

public class JpaMain {
    public static void main(String[] args) {
//        System.out.println("Hello world!");
        EntityManagerFactory hello = Persistence.createEntityManagerFactory("hello");
        Persistence.createEntityManagerFactory()
    }
}
