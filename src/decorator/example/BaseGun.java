package decorator.example;

public class BaseGun implements Gun {

    private String ammo;

    public BaseGun(String ammo) {
        this.ammo = ammo;
    }

    public void fire() {
        System.out.println("This gun uses: " + ammo);
    }
}
