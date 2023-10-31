package ro.uvt.info.designpatterlab2023.model;

public class AlignCenter implements AlignStrategy{
    @Override
    public void printAligned(String text) {
        System.out.println("Center alignment:");
        int lineWidth = 80;
        int spaces = (lineWidth - text.length()) / 2;
        for (int i = 0; i < spaces; i++) {
            System.out.print(" ");
        }
        System.out.println(text);
    }
}
