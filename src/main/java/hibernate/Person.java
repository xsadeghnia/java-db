package hibernate;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "person_tbl")

public class Person {
    @Id
    @GeneratedValue
    @Column(name = "tbl_id")
    private int id;
    @Column(name="column_name" , length = 120, nullable = false)
    private String name;
    @Column(name="column_family" , length = 120, nullable = false)
    private String family;
    @Column(name="column_age" , length = 120, nullable = true)
    private Integer age;
    @OneToMany(mappedBy = "owner")
    private Set<Phone> phones;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Set<Phone> getPhones() {
        if (phones == null){
            phones = new HashSet<Phone>();
        }
        return phones;
    }

    public void setPhones(Set<Phone> phones) {
        this.phones = phones;
    }


}
