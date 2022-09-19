package Stack_Queue;

import java.util.Scanner;
import java.util.Stack;

public class DaoPhanTuTrongMangStack {
    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        int arr[]={1,2,3,4,5,6};
        for (int i = 0; i < arr.length ; i++) {
            stack.push(arr[i]);
            System.out.println(stack);
        }
        int a =stack.size();
        for (int i = 0; i < a; i++) {
            System.out.print(stack.pop());

        }






    }

}
