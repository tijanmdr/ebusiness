/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Car;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;

/**
 *
 * @author Tijan
 */
@Entity
@NamedQuery(name = "findOldCars", query = "SELECT o from oldcar o")
public class OldCar extends Car implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Long odometer;
    private int regoNum;
    private String regoExp;
    private String serviceHistory;
    private String vehicleID;
    private String carHistory;

    public OldCar() {
        super();
    }
    
    public OldCar(Long id, Long odometer, int regoNum, String regoExp, String serviceHistory, String vehicleID, String carHistory, Long mainCarID, Long price, String refNum, String make, String model, String type, String color, String transmission, String engine, String fuel, int doors, int seats) {
        super(mainCarID, price, refNum, make, model, type, color, transmission, engine, fuel, doors, seats);
        this.id = id;
        this.odometer = odometer;
        this.regoNum = regoNum;
        this.regoExp = regoExp;
        this.serviceHistory = serviceHistory;
        this.vehicleID = vehicleID;
        this.carHistory = carHistory;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getOdometer() {
        return odometer;
    }

    public void setOdometer(Long odometer) {
        this.odometer = odometer;
    }

    public int getRegoNum() {
        return regoNum;
    }

    public void setRegoNum(int regoNum) {
        this.regoNum = regoNum;
    }

    public String getRegoExp() {
        return regoExp;
    }

    public void setRegoExp(String regoExp) {
        this.regoExp = regoExp;
    }

    public String getServiceHistory() {
        return serviceHistory;
    }

    public void setServiceHistory(String serviceHistory) {
        this.serviceHistory = serviceHistory;
    }

    public String getVehicleID() {
        return vehicleID;
    }

    public void setVehicleID(String vehicleID) {
        this.vehicleID = vehicleID;
    }

    public String getCarHistory() {
        return carHistory;
    }

    public void setCarHistory(String carHistory) {
        this.carHistory = carHistory;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OldCar)) {
            return false;
        }
        OldCar other = (OldCar) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Car.oldCar[ id=" + id + " ]";
    }
    
}
