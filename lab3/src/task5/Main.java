package task5;

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
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String flavor = scanner.next();
        String origin = scanner.next();
        float length = scanner.nextFloat();
        float width = scanner.nextFloat();
        float height = scanner.nextFloat();
        float radius = scanner.nextFloat();

        // TODO: Uncomment the code after implementing the task.

        Lindt lindtBox = new Lindt(flavor, origin, length, width, height);
        Baravelli baravelliBox = new Baravelli(flavor, origin, radius, height);
        ChocAmor chocAmorBox = new ChocAmor(flavor, origin, length);

        lindtBox.printLindtDim();
        baravelliBox.printBaravelliDim();
        chocAmorBox.printChocAmorDim();
    }
}