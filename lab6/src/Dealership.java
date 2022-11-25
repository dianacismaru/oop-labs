import java.util.Random;

public final class Dealership {
    private final class BrandOffer implements Offer {
        @Override
        public int getDiscount(Car car) {
            return switch (car.getCarType()) {
                case FIAT -> (int)(car.getPrice() * 0.1);
                case SKODA -> (int)(car.getPrice() * 0.15);
                case MERCEDES -> (int)(car.getPrice() * 0.05);
            };
        }
    }

    private final class DealerOffer implements Offer {
        @Override
        public int getDiscount(Car car) {
            int carAge = 2022 - car.getYear();

            return switch (car.getCarType()) {
                case FIAT -> 100 * carAge;
                case SKODA -> 150 * carAge;
                case MERCEDES -> 300 * carAge;
            };
        }
    }

    private final class SpecialOffer implements Offer {
        @Override
        public int getDiscount(Car car) {
            Random random = new Random(20);
            return random.nextInt(1000);
        }
    }

    public int getFinalPrice(Car car) {
        BrandOffer brandOffer = new BrandOffer();
        int brandDiscount = brandOffer.getDiscount(car);

        System.out.println("Applying Brand discount: " + brandDiscount + " euros");
        car.setPrice(car.getPrice() - brandDiscount);

        DealerOffer dealerOffer = new DealerOffer();
        int dealerDiscount = dealerOffer.getDiscount(car);

        System.out.println("Applying Dealer discount: " + dealerDiscount + " euros");
        car.setPrice(car.getPrice() - dealerDiscount);

        SpecialOffer specialOffer = new SpecialOffer();
        int specialDiscount = specialOffer.getDiscount(car);

        System.out.println("Applying Special discount: " + specialDiscount + " euros");
        car.setPrice(car.getPrice() - specialDiscount);

        return car.getPrice();
    }

    public void negotiate(Car car, Offer offer) {
        System.out.println("Applying Client discount: " + offer.getDiscount(car) + " euros");
        car.setPrice(car.getPrice() - offer.getDiscount(car));
    }
}
