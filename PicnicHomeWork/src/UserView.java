import java.io.IOException;
import java.util.Scanner;

public class UserView {


    public void run() {

        UserController userController = new UserController();
        while (true) {
            System.out.println("выберете комманду  \n" + "1 - Осуществить подсчет слов \n"
                    + "2 - Найти самое длинное слово \n" + "3 - Вычислить частоту слов \n" + "4 - Завершить программу");
            int command = ReadCommand("Ведиту команду");


            switch (command) {
                case 1 -> {
                    try {
                        userController.CountWordFile();

                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                }
                case 2 -> {
                    userController.SearchCountWordMax();
                }
                case 3 -> {
                    try {
                        userController.FrequencyWord();
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                }
                case 4 -> System.exit(0);
            }

        }


    }

    public int ReadCommand(String message) {
        Scanner in = new Scanner(System.in);
        System.out.println(message);
        return in.nextInt();
    }

}

