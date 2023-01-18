package task1.document;

public final class UrlSegment extends TextSegment {
    private final String description;

    public UrlSegment(String content, String description) {
        super(content);
        this.description = description;
    }

    @Override
    public String getContent(DokuWikiVisitor visitor) {
        return "[[" + super.getContent() +
                "|" + description + "]]";
    }

    @Override
    public String getContent(MarkdownVisitor visitor) {
        return "[" + description + "]" +
                "(" + super.getContent() + ")";
    }
}
