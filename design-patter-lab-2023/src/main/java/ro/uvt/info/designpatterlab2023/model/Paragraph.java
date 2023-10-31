package ro.uvt.info.designpatterlab2023.model;

public class Paragraph implements TextElement {
    private String text;

    public Paragraph(String text) {
        this.text = text;
    }

    public void add(int index, TextElement element) {
        throw new UnsupportedOperationException("You cannot do that");
    }

    public TextElement get(int index) {
        throw new UnsupportedOperationException("You cannot do that");
    }

    public void remove(TextElement element) {
        throw new UnsupportedOperationException("You cannot do that");
    }

    public void print() {
        System.out.println("Paragraph: " + text);
    }
}