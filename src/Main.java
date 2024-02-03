
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Cat cat = new Cat("Барсик", LocalDate.of(2020, 3, 20), new Illness("Лишай"));
//        System.out.println(cat.getName());

        new Animal();
        cat.setIllness(new Illness((String) null));
//        System.out.println(cat.getIllness());

        Dog dog = new Dog("Персик", LocalDate.of(2020, 2, 10), new Illness("Лишай"));
//        System.out.println(dog.illness);

        List<Animal> list = new ArrayList<>();
        list.add(dog);
        list.add(cat);
        list.add(new Bird("Ласточка", LocalDate.of(2020, 3, 20), new Illness("Лишай"), 2));

//        System.out.println(list);


        // вызываем метод жизненный цикл для собаки
//        dog.lifeCycle();


// создадим экземпляры класса Animal

        Eagle eagle = new Eagle("Беркут", LocalDate.of(2022, 5, 12), new Illness(null));
//        System.out.println(eagle.swim());

        Duck duck = new Duck("уточка дикая", LocalDate.of(2021, 12, 02), new Illness(null));

        Fish fish = new Fish("рыбка карась", LocalDate.of(2023, 11, 01), new Illness("здорова"));

        Bird bird = new Bird("Ласточка", LocalDate.of(2023, 05, 22), new Illness(null), 2);

        Dog dog1 = new Dog("Мухтар", LocalDate.of(2021, 10, 02), new Illness("Чумка"));

        Cat cat1 = new Cat("Мурка", LocalDate.of(2020, 3, 20), new Illness("Лишай"));

        Cat cat3 = new Cat("симка", LocalDate.of(2021, 2, 11), new Illness("бешенство"));
// добавим наших пациентов в клинику

        VeterinaryClinic veterinaryClinic = new VeterinaryClinic();

        veterinaryClinic.addPatient(duck);
        veterinaryClinic.addPatient(fish);
        veterinaryClinic.addPatient(bird);
        veterinaryClinic.addPatient(dog1);
        veterinaryClinic.addPatient(cat1);
        veterinaryClinic.addPatient(eagle);
        veterinaryClinic.addPatient(cat3);


//        System.out.println(dog.getType());

//        System.out.println(fish.swim());

        // проверка плавающих и бегающих на правильность действий

//        System.out.println(fish.toSwim());
//
//        System.out.println(cat1.toGo());
//
//        System.out.println(bird.toFly());
//
//        System.out.println(fish.toSwim());
//
//        System.out.println(duck.toFly());
//
//        System.out.println(duck.toSwim());
//
//        System.out.println(duck.toGo());

//  запросим показать всех пациентов нашей клиники

//        System.out.println(veterinaryClinic.getPatient());
//
//        //  запросим показать всех бегающих пациентов нашей клиники
//
//        System.out.println(veterinaryClinic.getRun());
//        //  запросим показать всех плавающих пациентов нашей клиники
//        System.out.println(veterinaryClinic.getSwim());
//        //  запросим показать всех летающих пациентов нашей клиники
//        System.out.println(veterinaryClinic.getFly());

// создадим экземпляры класса Personal

        Doctor doctor1 = new Doctor("Сергей", "Иванов", "доктор ветеринар");
        Doctor doctor2 = new Doctor("Петр", "Сидоров", "доктор ветеринар2");
        Nurse nurse = new Nurse("Лида", "кузнецова", "старшая медсестра");
        Nurse nurse2 = new Nurse("Полина", "Широва", "медсестра");

// добавим персонал в клинику

        veterinaryClinic.addPersonal(doctor1);
        veterinaryClinic.addPersonal(doctor2);
        veterinaryClinic.addPersonal(nurse);
        veterinaryClinic.addPersonal(nurse2);
////       посмотрим  наш персонал
//        System.out.println(veterinaryClinic.getPersonals());


//        System.out.println(doctor2.doDiagnose(fish));

//в отдельный список добавим докторов

        veterinaryClinic.addDoctors(doctor1);
        veterinaryClinic.addDoctors(doctor2);

//в отдельный список добавим медсестер

        veterinaryClinic.addNurse(nurse2);
        veterinaryClinic.addNurse(nurse);
//            список доктров
        System.out.println(veterinaryClinic.getDoctors());

        //список медсестер
        System.out.println(veterinaryClinic.getNurses());

Illness illness = new Illness("jjnmiojmo");

        System.out.println(illness);
    }

}

