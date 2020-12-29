package pl.dawidkozub.hibernateMappedSuperclass;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="EMPLOYEES")
public class Employee extends Person {

    @Column(name = "COMPANY")
    private String company;

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }
}
