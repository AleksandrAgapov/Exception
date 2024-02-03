import java.time.LocalDate;

public class Cat extends Animal implements Goable {


    public Cat(String name, LocalDate birthDay, Illness illness) {
        super(name, birthDay, illness);
    }
    public Cat(){

    }

    @Override
    public double run() {
        return 10;
    }

    @Override
    public String toGo() {
        return name + " бежит со скоростью  "  + run() + " км/ч " ;
    }
}
