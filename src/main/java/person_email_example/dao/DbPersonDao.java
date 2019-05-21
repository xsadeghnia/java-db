package person_email_example.dao;

import person_email_example.entity.Person;

public class DbPersonDao extends DbDao<Person> implements PersonDao {
    @Override
    protected String generateInsertQuery(Person person) {
        return "insert into person(id,name,family) values("
                + person.getId() + ",'"
                + person.getName()+ "','"
                + person.getFamily() + "')";
    }

    @Override
    protected String generateUpdateQuery(Person person) {
        return "update person set name = "
                + person.getName()
                + ", family = '"
                + person.getFamily()
                + "' where id = "
                + person.getId();
    }

}
