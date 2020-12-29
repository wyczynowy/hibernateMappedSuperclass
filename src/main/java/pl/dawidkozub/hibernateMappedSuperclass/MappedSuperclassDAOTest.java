package pl.dawidkozub.hibernateMappedSuperclass;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class MappedSuperclassDAOTest {

    public static void main(String[] args) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("EmployeesDB");
        EntityManager entityManager = factory.createEntityManager();

        entityManager.getTransaction().begin();

        Employee newEmployee = new Employee();
        newEmployee.setName("Jacob");
        newEmployee.setCompany("superCompany");

        entityManager.persist(newEmployee);

        entityManager.getTransaction().commit();

        entityManager.close();
        factory.close();
    }
}