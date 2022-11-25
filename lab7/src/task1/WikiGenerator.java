package task1;

import task1.document.DocumentVisitor;
import task1.document.DokuWikiVisitor;
import task1.document.MarkdownVisitor;
import task1.document.TextSegment;

import java.util.List;

/**
 * Uses visitors to parse documents and provide dokuwiki and markdown outputs.
 */
public class WikiGenerator {

    private final List<TextSegment> textSegments;

    public WikiGenerator(List<TextSegment> textSegments) {
        this.textSegments = textSegments;
    }

    public StringBuilder getDokuWikiDocument() {
        DocumentVisitor visitor = new DokuWikiVisitor();
        for (TextSegment textSegment: textSegments) {
            textSegment.accept(visitor);
        }
        return null;
    }

    public StringBuilder getMarkdownDocument() {
        DocumentVisitor visitor = new MarkdownVisitor();
        for (TextSegment textSegment: textSegments) {
            textSegment.accept(visitor);
        }
        return null;
    }
}
