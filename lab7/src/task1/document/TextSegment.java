package task1.document;

/**
 * Represents a text segment of a document that needs to be parsed.
 */
public abstract class TextSegment implements Visitable {
    private final String content;

    public TextSegment(String content) {
        this.content = content;
    }

    public void accept(DocumentVisitor v) {
        v.visit(this);
    }

    public String getContent() {
        return content;
    }
}
