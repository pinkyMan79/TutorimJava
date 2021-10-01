import java.util.Scanner;

public class Lesson2 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        String str1 = sc.nextLine();
        String str2 = sc.nextLine();

        int bykov = 0;
        int korow = 0;

        for (int i = 0; i < 4 ; i++) {

            if (str1.charAt(i) == str2.charAt(i)){

                bykov ++;

            }
        }

        for (int i = 0; i < 4; i++) {

            for (int j = 1; j < 4; j++) {

                if (str1.charAt(i) == str2.charAt(j)){

                    korow ++;

                }

            }

        }

        System.out.println(bykov + " " + korow);

    }

}
