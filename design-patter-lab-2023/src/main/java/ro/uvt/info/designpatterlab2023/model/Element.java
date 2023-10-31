package ro.uvt.info.designpatterlab2023.model;

import java.util.List;

public interface Element {
    void add(Element e);
    default Element getElement() {
        return this;
    };
    void remove(Element e);
    void print();
}
