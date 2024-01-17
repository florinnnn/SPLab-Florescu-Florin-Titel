package ro.uvt.info.designpatterlab2023.model.Services;

import org.springframework.stereotype.Component;

@Component
public class SingletonComponent {
    public SingletonComponent() {
        System.out.println("SingletonComponent::SingletonComponent = " + this);
    }
    public void operation() {
        System.out.println("Invoked SingletonComponent::operation() on " + this);
    }
}