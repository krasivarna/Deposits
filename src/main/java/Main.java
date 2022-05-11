import _02.Customer;
import _02.Product;
import _02.Sale;
import _02.StoreLocation;
import _05.AccountType;
import _05.User;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory factory=
                Persistence.createEntityManagerFactory("PU_Name");

        EntityManager entityManager=factory.createEntityManager();
        entityManager.getTransaction().begin();
//-------2--------
        //Product product=new Product("test",1, BigDecimal.TEN);
        //StoreLocation storeLocation=new StoreLocation("mag 1");
        //Customer customer=new Customer("petyr","kk@ddd","dsdsd");

        //Sale sale=new Sale(product,customer,storeLocation);

        //entityManager.persist(product);
        //entityManager.persist(customer);
        //entityManager.persist(storeLocation);
        //entityManager.persist(sale);
//-------3---------
//-------5---------
        User user=new User("krasi", AccountType.GOLD);
        entityManager.persist(user);
//-----------------
        entityManager.getTransaction().commit();
        entityManager.close();
    }
}
