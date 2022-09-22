package File.bt2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadFile {
    public static List<QuocGia> readList() throws IOException {
    List<QuocGia> list = new ArrayList<>();
        FileReader fileReader = new FileReader("D:\\codegym\\module2\\src\\File\\bt2\\QuocGia.csv");
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line="";
        String arr[];
        while ((line = bufferedReader.readLine()) != null) {
            arr = line.split(",");
            int id = Integer.parseInt(arr[0]);
            String code =arr[1];
            String name =arr[2];
            QuocGia quocGia = new QuocGia(id,code,name);
            list.add(quocGia);
        }
        return list;
    }

    public static void main(String[] args) {
        try {
            for (QuocGia quocgia : readList()) {
                System.out.println(quocgia);

            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
