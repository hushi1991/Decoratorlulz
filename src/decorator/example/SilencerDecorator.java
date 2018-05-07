package decorator.example;

public class SilencerDecorator extends Decorator{
    public SilencerDecorator(Gun gun) {
        super(gun);
    }

    public void fire() {
        super.fire();
        System.out.println("The gun makes no sound");
    }
}
