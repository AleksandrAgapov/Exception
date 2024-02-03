import java.io.PrintStream;
import java.time.LocalDate;

public class Animal {

    protected String name;
    protected LocalDate birthDay;

   public Illness illness;

    public Animal(String name, LocalDate birthDay, Illness illness) {
        this.name = name;
        this.birthDay = birthDay;
        this.illness = illness;
    }

    public Animal() {
        this("Вася", LocalDate.now(), new Illness("Болезнь"));
    }

    public Animal(String a) {
        new Illness(a);
    }

    private void wakeUp() {
        System.out.println(this.name + " проснулся");
    }



    private void hunt() {
        System.out.println(this.getType() + " охотится");
    }

    private void eat() {
        System.out.println(this.getType() + " кушает");
    }

    private void slip() {
        System.out.println(this.getType() + " спит");
    }

    public void lifeCycle() {
        this.wakeUp();
        this.hunt();
        this.eat();
        this.slip();
    }

    public void setIllness(Illness illness) {
        this.illness = illness;
    }
// создаем методы гетеры
    public String getName() {
        return this.name;
    }

    public LocalDate getBirthDay() {
        return this.birthDay;
    }

    public Illness getIllness() {
        return this.illness;
    }
// печатаем название класса
    public String getType() {
        return this.getClass().getSimpleName();
    }
// метод вывода данных в нужном формате
    public String toString() {
        return String.format("name =%s, birthday =%s, illness =%s", this.name, this.birthDay, this.illness);
    }

//     public void toGo() {
//        System.out.println("животное бежит");
//    }

//    public void toFly() {
//        System.out.println(" птица летит");
//    }










//    public String toGo(){
//        if (name.equals("рыбка"))
//        return ("рыбы не бегают");
//        else
//        return ((name) +" бежит");
//    }
//    public String fly(){
//        if ((name.equals("рыбка")) || (name.equals("Персик")))
//            return (name) + " не летает";
//        else
//        return ((name)+ " летит");
//    }
//    public String swim(){
//        if (name.equals("орел"))
//            return ("орлы не плавают");
//        else
//        return (name)+ " плывет";
//    }



}
