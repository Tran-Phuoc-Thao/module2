package vonglaptrongjava;



public class bai3_insnt_behon100 {
    public static void main(String[] args) {
        for (int i = 2 ; i <= 100 ; i++ ){
            if (CheckSNT(i) == 1) System.out.print(i + " ");
        }



    }

    public static int CheckSNT(int so) {
        int d = 0;
        if (so < 2) {
            return 0;
        } else {
            for (int i = 1; i <= so; i++) {
                if (so % i == 0) {
                    d++;
                }
            }
            if (d == 2) {
                return 1;
            } else {
                return 0;
            }
        }
    }
}
