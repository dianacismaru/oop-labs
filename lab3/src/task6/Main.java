package task6;
import java.util.*;

class CandyBox {
    // TODO[0]: Add fields
    private String flavor;
    private String origin;

    // TODO[1]: Constructor without parameters which initialize all the fields
    public CandyBox() {
        this.flavor = "sugar-free";
        this.origin = "Switzerland";
    }

    // TODO[2]: Constructor with parameters
    public CandyBox(String flavor, String origin) {
        this.flavor = flavor;
        this.origin = origin;
    }

    // TODO[3]: Add getVolume() method
    float getVolume() {
        return 0;
    }

    // TODO[4]: Generate toString() method - "The [origin] [flavor] chocolate"
    @Override
    public String toString() {
        return "The " + origin + " " + flavor + " chocolate";
    }

    // TODO[0]: Add getters and setters
    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    // TODO: Generate equals() and hashCode() methods
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CandyBox candyBox = (CandyBox) o;
        return Objects.equals(flavor, candyBox.flavor) && Objects.equals(origin, candyBox.origin);
    }

    @Override
    public int hashCode() {
        return Objects.hash(flavor, origin);
    }

    public void printDim() {
        System.out.println("Dim din clasa de baza");
    }
}

class Lindt extends CandyBox {
    // TODO[0]: Add fields
    private float length;
    private float width;
    private float height;

    // TODO[1]: Constructor without parameters
    public Lindt() {
        this.length = this.width = this.height = 0.0F;
    }

    // TODO[2]: Constructor which initialize all fields (using super keyword)
    public Lindt(float length, float width, float height) {
        super();
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public Lindt(String flavor, String origin, float length, float width, float height) {
        super(flavor, origin);
        this.length = length;
        this.width = width;
        this.height = height;
    }

    // TODO[3]: Override getVolume() method
    @Override
    float getVolume() {
        return length * width * height;
    }

    // TODO[4]: Override toString() method - "The [origin] [flavor] has volume [volume]"
    @Override
    public String toString() {
        return "Lindt: The " + getOrigin() + " " + getFlavor() + " chocolate has volume " + getVolume();
    }

    // TODO[0]: Add getters and setters
    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    // TODO: Add printLindtDim() method
    void printLindtDim() {
        System.out.println("Lindt: " + length + " " + width + " " + height);
    }

    @Override
    public void printDim() {
        printLindtDim();
    }
}

class Baravelli extends CandyBox {
    // TODO[0]: Add fields
    private float radius;
    private float height;

    // TODO[1]: Constructor without parameters
    public Baravelli() {
        this.radius = this.height = 0.0F;
    }

    // TODO[2]: Constructor which initialize all fields  (using super keyword)
    public Baravelli(String flavor, String origin, float radius, float height) {
        super(flavor, origin);
        this.radius = radius;
        this.height = height;
    }

    // TODO[3]: Override getVolume() method
    @Override
    float getVolume() {
        return (float) (Math.PI * radius * radius * height);
    }

    // TODO[4]: Override toString() method - "The [origin] [flavor] has volume [volume]"
    @Override
    public String toString() {
        return "Baravelli: The " + getOrigin() + " " + getFlavor() + " chocolate has volume " + getVolume();
    }

    // TODO[0]: Add getters and setters
    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    // TODO: Add printBaravelliDim() method
    void printBaravelliDim() {
        System.out.println("Baravelli: " + radius + " " + height);
    }

    @Override
    public void printDim() {
        printBaravelliDim();
    }
}

class ChocAmor extends CandyBox {
    // TODO[0]: Add fields
    private float length;

    // TODO[1]: Constructor without parameters
    public ChocAmor() {
        this.length = 0.0F;
    }

    // TODO[2]: Constructor which initialize all fields  (using super keyword)
    public ChocAmor(String flavor, String origin, float length) {
        super(flavor, origin);
        this.length = length;
    }

    // TODO[3]: Override getVolume() method
    @Override
    float getVolume() {
        return length * length * length;
    }

    // TODO[4]: Override toString() method - "The [origin] [flavor] has volume [volume]"
    @Override
    public String toString() {
        return "ChocAmor: The " + getOrigin() + " " + getFlavor() + " chocolate has volume " + getVolume();
    }

    // TODO[0]: Add getters and setters
    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    // TODO: Add printChocAmorDim() method
    void printChocAmorDim() {
        System.out.println("ChocAmor: " + length);
    }

    @Override
    public void printDim() {
        printChocAmorDim();
    }
}

class CandyBag {
    // Add ArrayList as field "candies"
    private List<CandyBox> candies;

    // Constructor which populates the array list (the default gift)
    public CandyBag() {
        candies = new ArrayList<>();
        candies.add(new Lindt("cherry", "Austria", 20F, 5.4F, 19.2F));
        candies.add(new Lindt("apricot", "Austria", 20F, 5.4F, 19.2F));
        candies.add(new Lindt("strawberry", "Austria", 20F, 5.4F, 19.2F));
        candies.add(new Baravelli("grape", "Italy", 6.7F, 8.7F));
        candies.add(new ChocAmor("coffee", "France", 5.5F));
        candies.add(new ChocAmor("vanilla", "France", 5.5F));
    }

    // Add getter and setter
    public List<CandyBox> getCandies() {
        return candies;
    }

    public void setCandies(List<CandyBox> candies) {
        this.candies = candies;
    }
}

class Area {
    // TODO[0]: Add fields
    private CandyBag candyBag;
    private int number;
    private String street;
    private String message;

    // TODO[1]: Constructor without parameters
    public Area() {
        street = message = "nowhere";
    }

    // TODO[2]: Constructor which initialize all the fields
    public Area(CandyBag candyBag, int number, String street, String message) {
        this.candyBag = candyBag;
        this.number = number;
        this.street = street;
        this.message = message;
    }

    public Area(int number, String street, CandyBag candyBag, String message) {
        this.number = number;
        this.street = street;
        this.candyBag = candyBag;
        this.message = message;
    }

    // TODO[3]: Add getBirthdayCard() method with instanceof
    public void getBirthdayCard() {
        System.out.println("Street " + street + ", number " + number + "\n");
        System.out.println(message + "\n");

        for (CandyBox candy: candyBag.getCandies()) {
            if (candy instanceof Lindt) {
                ((Lindt) candy).printLindtDim();
            } else if (candy instanceof Baravelli) {
                ((Baravelli) candy).printBaravelliDim();
            } else if (candy instanceof  ChocAmor) {
                ((ChocAmor) candy).printChocAmorDim();
            }
        }
    }

    // TODO[4]: Add getBirthdayCardv2() method without instanceof
    public void getBirthdayCardv2() {
        System.out.println("Street " + street + ", number " + number + "\n");
        System.out.println("LMA\n");

        for (CandyBox candy: candyBag.getCandies()) {
            candy.printDim();
        }
    }

    // TODO[0]: Add getters and setters
    public CandyBag getCandyBag() {
        return candyBag;
    }

    public void setCandyBag(CandyBag candyBag) {
        this.candyBag = candyBag;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        String street = scanner.next();
        String message = scanner.next();

        // TODO: Uncomment the code after implementing the task.

        Area area = new Area(number, street, new CandyBag(), message);

        System.out.println("With instanceof:");
        area.getBirthdayCard();
        System.out.println();
        System.out.println("Without instanceof:");
        area.getBirthdayCardv2();
    }
}