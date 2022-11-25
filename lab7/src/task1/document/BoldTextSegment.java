package task1.document;

public class BoldTextSegment extends TextSegment {
    BoldTextSegment(String content) {
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
