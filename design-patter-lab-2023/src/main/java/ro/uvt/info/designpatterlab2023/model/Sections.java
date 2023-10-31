package ro.uvt.info.designpatterlab2023.model;

import java.util.ArrayList;
import java.util.List;
public class Sections {
    public String title;
    List<Element> elementList = new ArrayList<Element>();
    @Override
    public void add(Element e) {
        elementList.add(e);
    }


    @Override
    public void remove(Element e) {
        elementList.remove(e);
    }

    @Override
    public void print() {
        System.out.println(title);
        for (Element element : elementList) {
            element.print();
        }
    }

    public Sections(String title) {
        this.title = title;
    }
}
