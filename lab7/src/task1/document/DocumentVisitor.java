package task1.document;

public interface DocumentVisitor {
    void visit(TextSegment textSegment);

    StringBuilder getDocument();
}
