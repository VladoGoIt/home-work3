package modul3;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Volodymyr Dzhuhalyk on 10.07.2017.
 */
public class HomeWork3 {
    public static void main(String[] args) {

        Scanner in = new Scanner (System.in);
        int length;

        while(true)
        {
            try {
                System.out.println("Введіть розмір масиву");
                length = in.nextInt();
                in.nextLine();
                break;
            } catch (Exception e){
                System.out.println("Введено не число!");
                in.nextLine();
            }
        }

        int[] arr = new int[length];


        while(true)
        {
            try {
                System.out.println("Введіть масив чисел:");
                for (int i=0; i < arr.length; i++ ) {
                    arr[i] = in.nextInt();
                    in.nextLine();
                }
                break;
            } catch (Exception e){
                System.out.println("Введено не число!");
                in.nextLine();
            }
        }
        int max = arr[0];
            for(int i: arr){
                if (max < i)
                    max = i;
        }

        int min = arr[0];
            for(int i: arr){
                if (min > i)
                    min = i;
        }
        System.out.println("Максимальне число масиву: "+ max);
        System.out.println("Мінімальне число масиву: "+ min);

        int count = 0;
        int num = 5;
        for (int n:arr)
            if (n == num) count++;
        System.out.println("Число 5 повторяється " + count + " разів");

        Arrays.sort(arr);
        for(int a : arr){
            System.out.println(a);
        }


    }
}
