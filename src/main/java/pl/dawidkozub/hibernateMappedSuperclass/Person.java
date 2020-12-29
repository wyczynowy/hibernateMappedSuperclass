package pl.dawidkozub.hibernateMappedSuperclass;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class Person {

    @Id
    @Column(name = "PERSON_ID")
    private long personId;

    @Column(name = "NAME")
    private String name;

    public long getPersonId() {
        return personId;
    }

    public void setPersonId(long personId) {
        this.personId = personId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
