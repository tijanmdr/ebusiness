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
@NamedQuery(name = "findNewCars", query = "SELECT n FROM newcar n")
public class NewCar extends Car implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String warranty;
    private String extWarranty;
    private String rsap;
    private String stockCars;

    public NewCar() {}

    public NewCar(Long id, String warranty, String extWarranty, String rsap, String stockCars, Long mainCarID, Long price, String refNum, String make, String model, String type, String color, String transmission, String engine, String fuel, int doors, int seats) {
        super(mainCarID, price, refNum, make, model, type, color, transmission, engine, fuel, doors, seats);
        this.id = id;
        this.warranty = warranty;
        this.extWarranty = extWarranty;
        this.rsap = rsap;
        this.stockCars = stockCars;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getWarranty() {
        return warranty;
    }

    public void setWarranty(String warranty) {
        this.warranty = warranty;
    }

    public String getExtWarranty() {
        return extWarranty;
    }

    public void setExtWarranty(String extWarranty) {
        this.extWarranty = extWarranty;
    }

    public String getRsap() {
        return rsap;
    }

    public void setRsap(String rsap) {
        this.rsap = rsap;
    }

    public String getStockCars() {
        return stockCars;
    }

    public void setStockCars(String stockCars) {
        this.stockCars = stockCars;
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
        if (!(object instanceof NewCar)) {
            return false;
        }
        NewCar other = (NewCar) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Car.NewCar[ id=" + id + " ]";
    }
    
}
