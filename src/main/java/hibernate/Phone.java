package hibernate;

import javax.persistence.*;


@Entity
@Table(name = "phone_tbl")

public class Phone {
    @Id
    @GeneratedValue
    @Column(name = "tbl_id")
    private int id;
    @Column(name ="number_column" , length = 120, nullable = true)
    private  String number;
    @ManyToOne
    @JoinColumn(name = "person_id",nullable = false)
    private Person owner;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Phone phone = (Phone) o;
        return id == phone.id;
    }

    @Override
    public int hashCode() {
        return id;
    }

    public Person getOwner() {
        return owner;
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }
}
