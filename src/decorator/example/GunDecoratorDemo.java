package decorator.example;

public class GunDecoratorDemo {
    public static void main(String[] args) {
        Gun gun = new ScopeDecorator(new SilencerDecorator(new BaseGun("9 mm")));
        gun.fire();
    }
}
