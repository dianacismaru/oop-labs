package task1.document;

public class UrlSegment extends TextSegment {
    private final String description;

    public UrlSegment(String content, String description) {
        super(content);
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
