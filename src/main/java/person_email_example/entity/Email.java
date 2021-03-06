package person_email_example.entity;

import person_email_example.annotation.TableName;

@TableName( name = "email")

public class Email extends Entity {
    private String address;
    private Person person;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

}
