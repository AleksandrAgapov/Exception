//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.time.LocalDate;

public class Bird extends Animal implements Flyable {
    private int wingQuantity;

    public Bird(String name, LocalDate birthDay, Illness illness, int wingQuantity) {
        super(name, birthDay, illness);
        this.wingQuantity = wingQuantity;
    }

    @Override
    public double fly() {
        return 15.4;
    }

    @Override
    public String toFly() {
        return name + " летит со скоростью  "  + fly() + " км/ч " ;
    }
}
