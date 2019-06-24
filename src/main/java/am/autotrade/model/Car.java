package am.autotrade.model;

import io.swagger.annotations.ApiModelProperty;

import java.util.Set;

public class Car {

    @ApiModelProperty(readOnly = true)
    private Long id;
    private Integer year;
    private String brand;
    private String model;
    private String modification;
    private Set<CarPart> carParts;

    public Car() { }

    public Car(Integer date, String brand, String model, String modification) {
        this.year = date;
        this.brand = brand;
        this.model = model;
        this.modification = modification;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
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

    public String getModification() {
        return modification;
    }

    public void setModification(String modification) {
        this.modification = modification;
    }

    public Set<CarPart> getCarParts() {
        return carParts;
    }

    public void setCarParts(Set<CarPart> carParts) {
        this.carParts = carParts;
    }

    @Override
    public String toString() {
        return "CarEntity{" +
                "id=" + id +
                ", year=" + year +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", modification='" + modification + '\'' +
                '}';
    }
}
