public class Nurse extends Personal implements Toheal {


    public Nurse(String name, String surname, String profession) {
        super(name, surname, profession);
    }

    @Override
    public String heal() {
        return "медсестра  ставит укол";

    }


}