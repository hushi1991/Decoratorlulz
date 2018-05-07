package decorator.example;

abstract public class Decorator implements Gun {

    private Gun gun;

    public Decorator(Gun gun) {
        this.gun = gun;
    }

    public void fire() {
        gun.fire();
    }
}
