package ro.uvt.info.designpatterlab2023.model;

public class Context {
    private AlignStrategy alignStrategy;

    public Context(AlignStrategy alignStrategy) {
        this.alignStrategy = alignStrategy;
    }

    public void setAlignStrategy(AlignStrategy alignStrategy) {
        this.alignStrategy = alignStrategy;
    }

    public void printAligned(String text) {
        alignStrategy.printAligned(text);
    }
}
