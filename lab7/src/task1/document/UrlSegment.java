package task1.document;

public class UrlSegment extends TextSegment {
    String url;
    String description;

    UrlSegment(String content) {
        super(content);
    }

    @Override
    public void visit(TextSegment textSegment) {

    }

    @Override
    public StringBuilder getDocument() {
        return null;
    }
}
