package decorator.example;

public class ScopeDecorator extends Decorator {

    public ScopeDecorator(Gun gun) {
        super(gun);
    }

    public void fire() {
        super.fire();
        System.out.println("The gun has a scope attached");
    }
}
