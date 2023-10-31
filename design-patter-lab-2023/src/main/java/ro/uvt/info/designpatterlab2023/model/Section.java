package ro.uvt.info.designpatterlab2023.model;
import java.util.ArrayList;
import java.util.List;

public class Section implements TextElement {
    private String title;
    private List<TextElement> content = new ArrayList<>();

    public Section(String title) {
        this.title = title;
    }

    public int add(TextElement element) {
        content.add(element);
        return content.indexOf(element);
    }

    public TextElement get(int index) {
        return content.get(index);
    }

    public void remove(TextElement element) {
        content.remove(element);
    }

    public void print() {
        System.out.println(title);
        for (TextElement element : content) {
            element.print();
        }
    }
}
