package ro.uvt.info.designpatterlab2023.model;

public class Paragraph {
    private String text;

    @Override
    public void add(Element e) {

    }

    @Override
    public void remove(Element e) {

    }

    public void print() {
        System.out.println(text);
    }

    public Paragraph(String text) {
        this.text = text;
    }
}
