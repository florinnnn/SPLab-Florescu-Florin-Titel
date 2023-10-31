package ro.uvt.info.designpatterlab2023.model;

public class Image {
    private String imageName;

    @Override
    public void add(Element e) {

    }

    @Override
    public void remove(Element e) {

    }

    public void print() {
        System.out.println(imageName);
    }

    public Image(String imageName) {
        this.imageName = imageName;
    }
}
