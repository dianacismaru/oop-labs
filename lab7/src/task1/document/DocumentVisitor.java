package task1.document;

public interface DocumentVisitor {
    String visit(TextSegment textSegment);

    StringBuilder getDocument();
}
