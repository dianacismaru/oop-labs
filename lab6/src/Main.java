import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public final class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int taskNum = scanner.nextInt();
        ArrayList<Car> carArrayList;

        switch(taskNum) {
            case 1:
                Car mercedes = new Car(20000, Car.CarType.MERCEDES, 2019);
                Car fiat = new Car(7000, Car.CarType.FIAT, 2020);
                Car skoda = new Car(12000, Car.CarType.SKODA, 2022);
                Dealership dealership = new Dealership();
                break;

            case 2:
                dealership = new Dealership();
                carArrayList = new ArrayList<>();
                carArrayList.add(new Car(20000, Car.CarType.MERCEDES, 2010));
                carArrayList.add(new Car(35000, Car.CarType.MERCEDES, 2015));
                carArrayList.add(new Car(3500, Car.CarType.FIAT, 2008));
                carArrayList.add(new Car(7000, Car.CarType.FIAT, 2010));
                carArrayList.add(new Car(12000, Car.CarType.SKODA, 2015));
                carArrayList.add(new Car(25000, Car.CarType.SKODA, 2021));

                for (Car car: carArrayList)
                    System.out.println(dealership.getFinalPrice(car) + "\n");
                break;

            case 3:
                 dealership = new Dealership();
                 Car car = new Car(2000, Car.CarType.MERCEDES, 2019);
                 dealership.negotiate(car, new Offer() {
                     @Override
                     public int getDiscount(Car car) {
                         return (int)(car.getPrice() * 0.05);
                     }
                 });
                break;

            case 4:
                carArrayList = new ArrayList<>();
                carArrayList.add(new Car(30000, Car.CarType.MERCEDES, 2019));
                carArrayList.add(new Car(50000, Car.CarType.MERCEDES, 2021));
                carArrayList.add(new Car(10000, Car.CarType.FIAT, 2018));
                carArrayList.add(new Car(20000, Car.CarType.SKODA, 2019));

                System.out.println("\nList before selecting the cheaper cars:");
                System.out.println(carArrayList);

                Selection selection = carArrayList1 -> {
                    for (int i = 0; i < carArrayList1.size(); i++)
                        if (carArrayList1.get(i).getPrice() > 25000)
                            carArrayList1.remove(i--);
                    return carArrayList1;
                };

                System.out.println("\nList after selecting the cheaper cars:");
                System.out.println(selection.getCheapCars(carArrayList));
                break;
        }
    }
}