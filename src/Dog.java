
import java.time.LocalDate;

public class Dog extends Animal implements Goable {
    public Dog(String name, LocalDate birthDay, Illness illness) {
        super(name, birthDay, illness);


    }
public Dog(){

}
//    @Override
//    public void toeat(){
//        System.out.println("кушает");
//
//    }

    @Override
    public  double run() {
        return 30.1;
    }

    @Override
    public String toGo() {
        return name + " бежит со скоростью  "  + run() + " км/ч " ;
    }
}
