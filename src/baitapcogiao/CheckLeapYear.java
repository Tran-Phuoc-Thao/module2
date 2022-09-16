    package baitapcogiao;

    import java.util.Scanner;

    public class CheckLeapYear {
        public static boolean check(int year) {
            if (year % 4 == 0)
            {
                if (year % 100 == 0) {
                    if (year % 400 == 0)
                        return true;
                    else
                        return false;
                } else
                    return true;
            }
        return false;
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("nhập năm bạn muốn kiểm tra");
            int year = Integer.parseInt(scanner.nextLine());
            if (check(year)) System.out.println("năm bạn vừa nhập là năm nhuận");
            else System.out.println("năm bạn vừa nhập không phải năm nhuận");

            }
        }

