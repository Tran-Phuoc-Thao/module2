package File.bt1;

import java.io.*;
import java.util.Scanner;

public class CopyFile {
    private static final String file = "D:\\codegym\\module2\\src\\File\\bt1\\File.csv";
    private static final String fileCopy = "D:\\codegym\\module2\\src\\File\\bt1\\FileCopy.csv";

    public static void copy() throws IOException {
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        FileWriter fileWriter = new FileWriter(fileCopy);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        String line;
        while ((line = bufferedReader.readLine()) != null) {
          bufferedWriter.write(line + "\r\n");
        }
        bufferedWriter.close();

    }



    public static void main(String[] args) {

        try {
            copy();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
