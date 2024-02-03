import java.util.Scanner;

public class Doctor extends Personal implements Toheal{


    public Doctor(String name, String surname, String profession) {
        super(name, surname, profession);
    }

    public Illness doDiagnose(Animal patient) {

           return patient.getIllness();
        }




    @Override
    public String heal() {
        return "доктор осмотрел животное";
    }
}
