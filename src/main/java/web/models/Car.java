package web.models;

public class Car {
    private String carBrand;
    private String model;

    private int yearOfProdaction;

    public Car(String carBrand, String model, int yearOfProdaction) {
        this.carBrand = carBrand;
        this.model = model;
        this.yearOfProdaction = yearOfProdaction;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYearOfProdaction() {
        return yearOfProdaction;
    }

    public void setYearOfProdaction(int yearOfProdaction) {
        this.yearOfProdaction = yearOfProdaction;
    }

    @Override
    public String toString() {
        return "Car{" +
                "carBrand='" + carBrand + '\'' +
                ", model='" + model + '\'' +
                ", yearOfProdaction=" + yearOfProdaction +
                '}';
    }
}
