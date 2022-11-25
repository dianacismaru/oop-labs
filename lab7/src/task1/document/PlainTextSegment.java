package task1.document;

public class PlainTextSegment extends TextSegment {
    PlainTextSegment(String content) {
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
