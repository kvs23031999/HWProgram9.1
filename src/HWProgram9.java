import java.util.Random;
import java.util.Scanner;

public class HWProgram9 {

    public static void main(String[] args) {

        Random random = new Random();
        int computerNum1 = random.nextInt(10) + 1;
        int computerNum2 = random.nextInt(10) + 1;
        int computerNum3 = random.nextInt(10) + 1;
        int computerNum4 = random.nextInt(10) + 1;
        int computerNum5 = random.nextInt(10) + 1;
        int computerNum6 = random.nextInt(10) + 1;
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.println("введіть число в діапозоні до 10");
            int manualNum1 = scanner.nextInt();
            int manualNum2 = scanner.nextInt();
            int manualNum3 = scanner.nextInt();
            int manualNum4 = scanner.nextInt();
            int manualNum5 = scanner.nextInt();
            int manualNum6 = scanner.nextInt();
            if ( computerNum1 == manualNum1 && computerNum2 == manualNum2 && computerNum3 == manualNum3 && computerNum4 == manualNum4 && computerNum5 == manualNum5 && computerNum6 == manualNum6 ){
                System.out.println("Ви вгадали 6 чисел");
                break;
            }
            System.out.println("Ви не вгадали 6 чисел");

        }
        System.out.println(computerNum1);
        System.out.println(computerNum2);
        System.out.println(computerNum3);
        System.out.println(computerNum4);
        System.out.println(computerNum5);
        System.out.println(computerNum6);


    }
}

