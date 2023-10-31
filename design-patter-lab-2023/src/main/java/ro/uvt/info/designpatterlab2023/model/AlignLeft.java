package ro.uvt.info.designpatterlab2023.model;

public class AlignLeft implements AlignStrategy{
    @Override
    public void printAligned(String text) {
        System.out.println("Left alignment:");
        System.out.println(text);
    }
}
