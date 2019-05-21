package person_email_example;

import person_email_example.dao.PersonDao;
import person_email_example.entity.Person;

public class Test {
    public static void main(String[] args) {
        Person person = new Person();
        person.setId(1000);
        person.setName("efgh");
        person.setFamily("12345");

        PersonDao personDao = ServiceLocator.getPersonDao();
        personDao.insert(person);
        System.out.println("ok.");
    }
}
