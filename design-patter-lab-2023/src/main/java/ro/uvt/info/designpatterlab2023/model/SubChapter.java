package ro.uvt.info.designpatterlab2023.model;

public class SubChapter {
    private String name;

    @Override
    public void add(Element e) {

    }

    @Override
    public void remove(Element e) {

    }

    public void print() {
        System.out.println(name);
    }

    public SubChapter(String name) {
        this.name = name;
    }
}
