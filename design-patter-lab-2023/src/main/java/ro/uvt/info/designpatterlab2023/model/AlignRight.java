package ro.uvt.info.designpatterlab2023.model;

public class AlignRight implements AlignStrategy{
    @Override
    public void printAligned(String text) {
        System.out.println("Right alignment:");
        int lineWidth = 80;
        int spaces = lineWidth - text.length();
        for (int i = 0; i < spaces; i++) {
            System.out.print(" ");
        }
        System.out.println(text);
    }
}
