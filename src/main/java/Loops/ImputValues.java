package Loops;

import java.util.Scanner;

public class ImputValues {
    int quantity;
    int sum = 0;

    public ImputValues(int quantity) {
        this.quantity = quantity;
    }

    public int[] scaning() {

        Scanner scanner = new Scanner(System.in);
        System.out.print(" Please ener array lenght: ");

        int[] values = new int[this.quantity];
        System.out.println();
        System.out.println("Ok. Lets do it....");

        for (int i = 0; i < this.quantity; i++) {
            int z = i + 1;
            System.out.print("Value nr " + z + " is:>");
            values[i] = scanner.nextInt();
        }
        System.out.println();
        System.out.println("Entering DATA is compete!");
        return values;
    }

    public void averageCaclulate(int[] values) {
        int lastArg = values.length-1;

        System.out.println();
        System.out.println("Allready read all array values. These are: ");

        for (int i = 0; i < lastArg; i++) {
            sum = sum + values[i];
            System.out.print(values[i] + ", ");
        }
        sum = sum + values[lastArg];
        System.out.println(values[lastArg]);

        double average = (double)sum / (double)values.length;
        System.out.println();
        System.out.println("...and average of entered values is: " + average);
    }
}



