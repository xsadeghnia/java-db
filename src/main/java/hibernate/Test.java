package hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test {
    public static void main(String[] args) {
        Configuration configuration = new Configuration();
        configuration.addAnnotatedClass(Person.class);
        configuration.addAnnotatedClass(Phone.class);
        SessionFactory sessionFactory = configuration.configure().buildSessionFactory();
        Session session = sessionFactory.openSession();

        Person person = new Person();
        person.setName("kami");
        person.setFamily("babahi");
        person.setAge(32);

        Transaction transaction = session.beginTransaction();
        session.save(person);

        for (int i = 0 ; i< 3; i++) {
            Phone phone = new Phone();
            phone.setNumber("935365"+ i);
            phone.setOwner(person);
            session.save(phone);
        }
        transaction.commit();



        System.out.println("ok.");
    }
}
