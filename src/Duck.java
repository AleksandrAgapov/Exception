import java.time.LocalDate;

public class Duck extends Animal implements Swimable,Flyable,Goable{
    public Duck(String name, LocalDate birthDay, Illness illness) {
        super(name, birthDay, illness);
    }

    public Duck(Animal duck) {

    }

    @Override
    public double swim() {
        return 5.1;
    }

    @Override
    public String toSwim() {
        return name + " плывет со скоростью  "  + swim() + " км/ч " ;
    }

    @Override
    public double fly() {
        return 7.4;
    }

    @Override
    public String toFly() {
        return name + " летит со скоростью  "  + fly() + " км/ч " ;
    }


    @Override
    public double run() {
        return 0.5;
    }

    @Override
    public String toGo() {
        return name + " идет со скоростью  "  + run() + " км/ч " ;
    }
}
