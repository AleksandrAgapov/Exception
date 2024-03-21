package exeption_homework;

import java.io.*;

public class WriteFile extends ScanerMetod {

    File file;
    String strName;


    //  метод создания имени файла
    public void FailName() {
        dataName = getDataName();
        strName = dataName[0];
    }


    // метод создания нового файла
    public File PathFile() {
        File  File = new File("D:\\2024\\IT учеба\\Java OOP\\Calculator_2\\untitled\\src\\exeption_homework\\" + strName + ".txt");
        return File;
    }


    // метод записи данных в файл
    public void WriteFileData  () throws RuntimeException {
        file = PathFile();
        try {
            FileWriter fileWriter = new FileWriter(file, true);
            fileWriter.write(toString());
            fileWriter.append('\n');
            fileWriter.close();
            System.out.println("Данные записаны в файл");
        } catch (IOException e) {
            System.err.println("Ошибка записи в файл: " + e.getMessage());
        }

    }
}

