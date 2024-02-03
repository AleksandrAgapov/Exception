public abstract class Personal {

    private final String name;
    private final String surname;

    private final String profession;

    public Personal(String name, String surname, String profession) {
        this.name = name;
        this.surname = surname;
        this.profession = profession;
}
        public String toString() {
            return String.format("Имя = %s, Фамилия = %s, должность = %s", this.name, this.surname, this.profession);
        }




    }


