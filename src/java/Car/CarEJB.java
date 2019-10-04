/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Car;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

/**
 *
 * @author Tijan
 */
@Stateless
public class CarEJB {
    
    private EntityManager em;

    public List<NewCar> getNewCars() {
        TypedQuery<NewCar> query = em.createNamedQuery("findNewCars", NewCar.class);
        return query.getResultList();
    }
    
    public List<OldCar> getOldCars() {
        TypedQuery<OldCar> query = em.createNamedQuery("findOldCars", OldCar.class);
        return query.getResultList();
    }
    
    public NewCar insertNewCar() {
        return null;
    }
    
    public OldCar insertOldCar() {
        return null;
    }
    
    public List<NewCar> searchNewCars() {
        return null;
    }
    
    public List<NewCar> searchOldCars() {
        return null;
    }    
    
    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    
    
}
