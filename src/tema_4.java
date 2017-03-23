import java.text.DecimalFormat;

/**
 * Created by aaronmarton on 23/03/2017.
 *
 * given a list of numbers, determine the largest number (max)
 *
 */
public class tema_4 {
    public static void main(String[] args) {
        int[] list_of_numbers = {3, 45, 32, 12, 34, 5, 66, 7, 43, 67, 87, 5, 2};
        int max = 0;

        for (int i = 0; i < list_of_numbers.length; i++) {

            list_of_numbers[i] = max;

            for (int j = i+1; j < list_of_numbers.length; j++) {

                if (list_of_numbers[j] > max) {
                    max = list_of_numbers[j];
                }
            }
        }

        System.out.println("Largest number is: " + max);
    }
}
