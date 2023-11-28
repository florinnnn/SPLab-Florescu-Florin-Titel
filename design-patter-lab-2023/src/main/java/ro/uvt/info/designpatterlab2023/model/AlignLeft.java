package ro.uvt.info.designpatterlab2023.model;

public class AlignLeft implements AlignStrategy {
    public String render(String text, int lineLength) {
        int length = text.length();
        StringBuilder result = new StringBuilder();
        int start = 0;
        while (start < length) {
            int end = Math.min(start + lineLength, length);
            result.append(text, start, end).append('\n');
            start = end;
        }
        return result.toString();
    }

    @Override
    public void printAligned(String text) {

    }
}