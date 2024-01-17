package ro.uvt.info.designpatterlab2023.model;

public interface Visitor {
    void visitParagraph(Paragraph p);
    void visitSection(Section s);
    void visitImage(Image i);
    void visitTable(Table t);
    void visitBook(Book b);

    void VisitBook(Book b);
}