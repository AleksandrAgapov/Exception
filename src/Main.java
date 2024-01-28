
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Animal cat = new Animal("Барсик", LocalDate.of(2020, 3, 20), new Illness("Лишай"));
        System.out.println(cat.getName());

        new Animal();
        cat.setIllness(new Illness((String)null));
        System.out.println(cat.getIllness());

        Animal dog = new Dog("Персик", LocalDate.of(2020, 2, 10), new Illness("Лишай"));
//        System.out.println(dog.illness);

        List<Animal> list = new ArrayList<>();
        list.add(dog);
        list.add(cat);
        list.add(new Bird("Ласточка", LocalDate.of(2020, 3, 20), new Illness("Лишай"), 2));

//        System.out.println(list);
        dog.lifeCycle();

        Animal eagle = new Eagle("орел",LocalDate.of(2022,5,12),new Illness(null));
//        System.out.println(eagle.swim());

        Animal duck = new Duck("уточка",LocalDate.of(2021,12,02),new Illness(null));

        Animal fish = new Fish("рыбка",LocalDate.of(2023,11,01), new Illness(null));

        System.out.println(dog.fly());

        System.out.println(fish.toGo());

        System.out.println(duck.fly());


    }
}
