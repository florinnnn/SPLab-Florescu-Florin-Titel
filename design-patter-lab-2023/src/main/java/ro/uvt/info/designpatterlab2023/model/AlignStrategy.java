package ro.uvt.info.designpatterlab2023.model;

public interface AlignStrategy {
    String render(String text, int lineLength);

    void printAligned(String text);
}