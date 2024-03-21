package exeption_homework;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.Arrays;
import java.util.Scanner;

import static java.time.LocalTime.now;

public class Main {


    public static void main(String[] args) {

        WriteFile writeFile = new WriteFile();
        while (true) {


            try {
                writeFile.checkDate();
            } catch (InDataException e) {
                System.err.println(e.getMessage());
                prompt_0();
                continue;
            }


            try {
                writeFile.converter();
            } catch (InDataException e) {
                System.err.println(e.getMessage());
                prompt_0();
                continue;
            }


            try {
                writeFile.FailName();
                writeFile.WriteFileData();

            } catch (RuntimeException e) {
                throw new RuntimeException(e);
            }
            prompt();

        }


    }

    private static void prompt() {
        Scanner sc = new Scanner(System.in);
        System.err.println("Продолжить вводить новые данные или завершить работу программы?... (y/n)");
        String action = sc.nextLine();
        if (!action.equalsIgnoreCase("y")) {
            System.exit(0);
        }
    }



        private static void prompt_0() {
            Scanner sc = new Scanner(System.in);
            System.err.println("Ввести данные еще раз или завершить работу программы?... (y/n)");
            String action = sc.nextLine();

            if (!action.equalsIgnoreCase("y")) {
                System.exit(0);
            }
    }

}




