package decorator.example;

public class GunDecoratorDemo {
    public static void main(String[] args) {
        Gun gun = new ScopeDecorator(new SilencerDecorator(new BaseGun("9 mm")));
        Gun gun1 = new BaseGun("5.56 mm");
        gun1.fire();
        System.out.println("Test gun1");
        gun.fire();
    }
}
