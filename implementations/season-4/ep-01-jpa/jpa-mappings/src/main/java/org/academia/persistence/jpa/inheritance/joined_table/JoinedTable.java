package org.academia.persistence.jpa.inheritance.joined_table;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.RollbackException;

public class JoinedTable {

    private EntityManagerFactory emf;

    private JoinedTable() {
        this.emf = Persistence.createEntityManagerFactory("joinedTable");
    }


    public static void main(final String[] args) throws Exception {

        JoinedTable joinedTable = new JoinedTable();

        // create a new car
        Car car = new Car();
        car.setMaxSpeed(200);
        car.setGears(6);

        Car car1 = new Car();
        car1.setMaxSpeed(200);
        car1.setGears(6);

        // create a new boat
        Boat boat = new Boat();
        boat.setMaxSpeed(100);
        boat.setEngines(4);

        Boat boat1 = new Boat();
        boat1.setMaxSpeed(100);
        boat1.setEngines(4);

        // persist car
        Car savedCar = (Car) joinedTable.save(car);
        Boat savedBoat1 = (Boat) joinedTable.save(boat1);
        System.out.println("Car persisted with ID: " + savedCar.getId());

        // persist boat
        Boat savedBoat = (Boat) joinedTable.save(boat);
        Car savedCar1 = (Car) joinedTable.save(car1);
        System.out.println("Boat persisted with ID: " + savedBoat.getId());

        // fetch car
        Car fetchedCar = (Car) joinedTable.fetch(savedCar.getId(), Car.class);
        System.out.println("Fetched car: " + fetchedCar);

        // fetch boat
        Boat fetchedBoat = (Boat) joinedTable.fetch(savedBoat.getId(), Boat.class);
        System.out.println("Fetched boat: " + fetchedBoat);

        joinedTable.close();
    }

    private Object save(Object entity) {

        EntityManager em = emf.createEntityManager();

        try {

            em.getTransaction().begin();
            em.persist(entity);
            em.getTransaction().commit();

        } catch (RollbackException ex) {

            em.getTransaction().rollback();
            return null;

        } finally {
            if (em != null) {
                em.close();
            }
        }

        return entity;
    }

    private Object fetch(Integer id, Class type) {

        EntityManager em = emf.createEntityManager();

        try {

            return em.find(type, id);

        } finally {

            if (em != null) {
                em.close();
            }

        }
    }

    private void close() {
        emf.close();
    }
}
