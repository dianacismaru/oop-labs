package task1.document;

public final class ItalicTextSegment extends TextSegment {
    public ItalicTextSegment(String content) {
        super(content);
    }

    @Override
    public String getContent(DokuWikiVisitor visitor) {
        return "//" +
                super.getContent() +
                "//";
    }

    @Override
    public String getContent(MarkdownVisitor visitor) {
        return "*" +
                super.getContent() +
                "*";
    }
}
