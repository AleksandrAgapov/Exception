import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class UserController {

    private String Patch;
    HashMap<String, Integer> wordMaks = new HashMap<>();
    HashMap<String, Integer> wordCount = new HashMap<>();



    public String[] ArrayWord() throws IOException {
        int count = 0;
        String Patch = readPatch();
        File file = new File(Patch);
        FileInputStream fis = new FileInputStream(Patch);

        byte[] bytesArray = new byte[(int) file.length()];
        fis.read(bytesArray);
        String s = new String(bytesArray);
        String[] data = s.split(" ");
        return data;
    }

    // метод подсчета слов в файле
    public void CountWordFile() throws IOException {
        int count = 0;
        String[] wordarray = ArrayWord();
        for (int i = 0; i < wordarray.length; i++) {
            count++;
        }
        System.out.println("Количество слов в файле = " + count);
    }

    // метод поиска максимально длинных слов
    public void SearchCountWordMax() {
        List<String> list = new ArrayList<>();
        try {
            for (String item : ArrayWord()) {
                list.add(item);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        int max = 0;
        for (String word : list) {
            if (word.length() > max) {
                max = word.length();
            }
        }
        System.out.println("самое длинное слово в файле состоит из " + max + " символов");

        List<String> list1 = new ArrayList<>(); // создаем лист с длинными словами
        for (String item : list) {
            if (item.length() == max) {
                list1.add(item);
            }
        }

        for (String word1 : list1) {
            if (wordMaks.containsKey(word1)) {
                wordMaks.replace(word1, wordMaks.get(word1), wordMaks.get(word1).intValue() + 1);

            } else wordMaks.put(word1, 1);
        }
        wordMaks.entrySet().forEach(entry -> {
            System.out.println("Слово " + entry.getKey() + ":" + "Встречается в файле " + entry.getValue() + " раза");
        });


    }


    // метод подсчета частоты слов в файле

    public void FrequencyWord() throws IOException {
        int minWordLength = 2;
        for (String word : ArrayWord()) {

            String uniqueWord = word.toLowerCase();

            if (uniqueWord.length() > minWordLength) {

                if (wordCount.containsKey(uniqueWord)) {
                    wordCount.replace(uniqueWord, wordCount.get(uniqueWord), wordCount.get(uniqueWord).intValue() + 1);


                } else {
                    wordCount.put(uniqueWord, 1);
                }
            }
        }
        wordCount.entrySet().forEach(entry -> {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        });
    }
    public String readPatch(){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите имя файла или путь к файлу");
        Patch = in.nextLine();
        return Patch;
    }
}





