package ro.uvt.info.designpatterlab2023.model;

public class Author {
    private String name;
    public void print() {
        System.out.println(name);
    }
    public Author(String name){
        this.name = name;
    }
}
