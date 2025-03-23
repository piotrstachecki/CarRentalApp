package pl.bangly.carrental.entity;

import jakarta.persistence.*;

import java.sql.Date;

@Entity
@Table(name="car")
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name="brand")
    private String brand;

    @Column(name="model")
    private String model;

    @Column(name="available")
    private boolean available;

    @Column(name="rented_since")
    private Date rented_since;

    @Column(name="rented_until")
    private Date rented_until;

    @Column(name="price")
    private String price;

    public Car() {

    }

    public Car(String brand, String model, boolean available, Date rented_since, Date rented_until, String price) {
        this.brand = brand;
        this.model = model;
        this.available = available;
        this.rented_since = rented_since;
        this.rented_until = rented_until;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public Date getRented_since() {
        return rented_since;
    }

    public void setRented_since(Date rented_since) {
        this.rented_since = rented_since;
    }

    public Date getRented_until() {
        return rented_until;
    }

    public void setRented_until(Date rented_until) {
        this.rented_until = rented_until;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", available=" + available +
                ", rented_since=" + rented_since +
                ", rented_until=" + rented_until +
                ", price='" + price + '\'' +
                '}';
    }
}
