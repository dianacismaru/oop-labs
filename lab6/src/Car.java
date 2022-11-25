public class Car {
    public enum CarType {
        MERCEDES,
        FIAT,
        SKODA
    }

    private int price;
    private final int year;
    private final CarType carType;

    public Car(int price, CarType carType, int year) {
        this.price = price;
        this.carType = carType;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Car{" +
                "price=" + price +
                ", carType=" + carType +
                ", year=" + year +
                '}';
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getYear() {
        return year;
    }

    public CarType getCarType() {
        return carType;
    }
}
