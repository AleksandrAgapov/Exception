import java.time.LocalDate;

public  class Fish extends Animal implements Swimable{
    public Fish(String name, LocalDate birthDay, Illness illness) {
        super(name, birthDay, illness);
    }


    @Override
    public double swim() {
        return 2;
    }
    @Override
    public String toSwim() {
        return name + " плывет со скоростью  "  + swim() + " км/ч " ;
    }
}


