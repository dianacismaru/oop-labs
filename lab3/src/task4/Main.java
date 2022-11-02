package task4;
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

public class Main {
    public static void main(String[] args) {
        CandyBag presentBag = new CandyBag();

        for (int i = 0; i < presentBag.getCandies().size(); i++) {
            System.out.println(presentBag.getCandies().get(i));
        }
    }
}