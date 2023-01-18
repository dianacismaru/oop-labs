package task1.document;

public final class MarkdownVisitor implements DocumentVisitor {
    @Override
    public String visit(TextSegment textSegment) {
        return textSegment.getContent(this);
    }

    @Override
    public StringBuilder getDocument() {
        return null;
    }
}
