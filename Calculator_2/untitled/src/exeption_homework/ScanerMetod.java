package exeption_homework;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class ScanerMetod {
    private String lastname;
    private String surname;
    private String name;
    private LocalDate birthDate;
    private Long phoneNumber;
    private String gender;
    String[] dataName;


    public ScanerMetod() {

    }

    public String getLastname() {
        return lastname;
    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public Long getPhoneNumber() {
        return phoneNumber;
    }

    public String getGender() {
        return gender;
    }

    public String[] getDataName() {
        return dataName;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public void setPhoneNumber(Long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setDataName(String[] dataName) {
        this.dataName = dataName;
    }

    public String[] ScannerDate() {
        String line;

//        int counter = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println(" Введите через пробел личные данные Фамилия Имя Отчество дата _ рождения номер _ телефона пол \n" +
                "фамилия, имя, отчество - строки \n " +
                "дата _ рождения - строка формата yyyy.mm.dd \n" +
                " номер _ телефона - целое беззнаковое число  \n" +
                " пол - символ латиницей f или m. \n" +
                " Формат ввода данных: Иванов Иван Иванович 1998-08-14 904905856 m\n");
        line = sc.nextLine();
        dataName = line.split(" ");
//        sc.close();

        return dataName;


    }


    public void checkDate() throws InDataException {
        String[] dataName = ScannerDate();

        int counter = 0;
        for (String data : dataName) {
            counter++;

        }
        if (counter < 6) {
            throw new InDataException("вы ввели недостаточное колличество данных ");

        }
        if (counter > 6) {
            throw new InDataException("вы ввели больше  данных чем нужно");


        }
    }


    public void converter() throws  InDataException, DateTimeParseException, NumberFormatException {
        this.surname = dataName[0];
        this.name = dataName[1];
        this.lastname = dataName[2];

        try {
            this.birthDate = LocalDate.parse(dataName[3]);
        } catch (DateTimeParseException e) {
            throw new InDataException("Некорректные данные дата _ рождения ");
        }

        try {
            this.phoneNumber = Long.parseLong(dataName[4]);
        } catch (NumberFormatException e) {
            throw new InDataException("введенные данные номера не являются числом");
        }

        if ("m".equals(dataName[5]) || "w".equals(dataName[5])) {
            this.gender = dataName[5];
        } else {
            throw new InDataException("не корректный ввод данных пол");
        }


    }

    @Override
    public String toString() {
        return Arrays.toString(dataName);
    }
}




