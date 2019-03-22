package Loops;

import java.util.Scanner;

public class SetTable {
    int quantity;
    int[] array;

    int sum=0;

    public SetTable(int quantity) {
        this.quantity = quantity;

    }

    public int[] tableMaker() {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" Please ener array lenght: ");
        System.out.println();
        System.out.println("Ok. Lets do it....");
        int[] array = new int[this.quantity];
        for (int i = 0; i < this.quantity; i++) {
            int z = i + 1;
            System.out.print("Value nr " + z + " is:>");
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public int [] returnArray(){
        return array;
    }

    public void displayArray(int[] array){
        System.out.println("Allready read all array values. These are: ");

        for( int i=0; i<array.length; i++){
            sum=sum+array[i];
            System.out.print(array[i]+", ");
        }
//        double average = sum/(array.length);
//        System.out.println("...and average of entered values is: "+ average);
    }

}
