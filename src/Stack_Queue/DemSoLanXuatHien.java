package Stack_Queue;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class DemSoLanXuatHien {
    public static void main(String[] args) {
        TreeMap<String, Integer> treeMap = new TreeMap<>();
        System.out.println("nhập chuỗi");
        Scanner scanner = new Scanner(System.in);
        String chuoi = scanner.nextLine();
        String arr[] = chuoi.split(" ");

        for (String element : arr){
            if(treeMap.containsKey(element)){
                int count=treeMap.get(element);
                count++;
                treeMap.put(element,count);
            }else
            {
                treeMap.put(element,1);
            }
        }
        System.out.print(treeMap);

//        Set<String> set = treeMap.keySet();
//        for (String key : set) {
//            System.out.println(key + " " + treeMap.get(key));
//        }

    }
}
