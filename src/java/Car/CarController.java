/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Car;

import java.util.ArrayList;
import java.util.List;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author Tijan
 */
@ManagedBean
@RequestScoped
public class CarController {
    @EJB
    private CarEJB carEJB;
    private OldCar oldCar = new OldCar();
    private NewCar newCar = new NewCar();
    private List<OldCar> oldCarList = new ArrayList<OldCar>();
    private List<NewCar> newCarList = new ArrayList<NewCar>();

    // methods
    public String createOldCar () {
        oldCar = carEJB.insertOldCar();
        oldCarList = carEJB.getOldCars();
        return null;
    }
}
