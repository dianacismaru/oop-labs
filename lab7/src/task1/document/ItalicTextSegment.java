package task1.document;

public class ItalicTextSegment extends TextSegment {
    ItalicTextSegment(String content) {
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
