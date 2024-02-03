import java.util.ArrayList;
import java.util.List;

public class VeterinaryClinic {


    private List<Animal> patient;

    private List<Personal> personals;

    private List<Personal> doctors;
    private List<Personal> nurses;

    public VeterinaryClinic() {
        this.patient = new ArrayList<>();
        this.personals = new ArrayList<>();
        this.doctors =  new ArrayList<>();
        this.nurses=  new ArrayList<>();
    }

    public List<Animal> getPatient() {
        return patient;
    }

    public void addPatient(Animal a) {
        patient.add(a);



    }
// добавляем и получаем персонал
    public List<Personal> getPersonals() {
        return personals;
    }
    public void addPersonal(Personal a) {
        personals.add(a);

    }
    // добавляем и получаем докторов
    public List<Personal> getDoctors() {
        return doctors;
    }
    public void addDoctors(Personal a) {
        doctors.add(a);

    }
    // добавляем и получаем медсестер
    public List<Personal> getNurses() {
        return nurses;
    }
    public void addNurse(Personal a) {
        nurses.add(a);

    }

    //метод всех бегающих
    public List<Animal> getRun() {
        List<Animal> result = new ArrayList<>();

        for (Animal animal : patient) {
            if (animal instanceof Goable) {
                result.add(animal);
            }
        }
        return result;
    }

// метод для всех плавающих
public List<Animal> getSwim() {
    List<Animal> result = new ArrayList<>();

    for (Animal animal : patient) {
        if (animal instanceof Swimable) {
            result.add(animal);
        }
    }
    return result;
}
    // метод для всех летающих
    public List<Animal> getFly() {
        List<Animal> result = new ArrayList<>();

        for (Animal animal : patient) {
            if (animal instanceof Flyable) {
                result.add(animal);
            }
        }
        return result;
    }



}
