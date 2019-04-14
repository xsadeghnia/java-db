package entity;

import java.util.HashSet;
import java.util.Set;

public class Person extends Entity {
    private String name;
    private String family;
    private Set<Email>  emails;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public Set<Email> getEmails() {
        if (emails == null){
            emails = new HashSet<Email>();
        }
        return emails;
    }

    public void setEmails(Set<Email> emails) {
        this.emails = emails;
    }
}
