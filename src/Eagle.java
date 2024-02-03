import java.time.LocalDate;

public class Eagle extends Animal implements Flyable{
    public Eagle(String name, LocalDate birthDay, Illness illness) {
        super(name, birthDay, illness);
    }

    @Override
    public double fly() {
        return 30.2;
    }

    @Override
    public String toFly() {
        return name + " летит со скоростью  "  + fly() + " км/ч " ;
    }


}

