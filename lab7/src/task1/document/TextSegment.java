package task1.document;

/**
 * Represents a text segment of a document that needs to be parsed.
 */
public abstract class TextSegment implements Visitable {
    private final String content;

    public TextSegment(String content) {
        this.content = content;
    }

    public String accept(DocumentVisitor v) {
        return v.visit(this);
    }

    public String getContent() {
        return content;
    }

    public String getContent(DokuWikiVisitor visitor) {
        return this.getContent();
    }

    public String getContent(MarkdownVisitor visitor) {
        return this.getContent();
    }
}
