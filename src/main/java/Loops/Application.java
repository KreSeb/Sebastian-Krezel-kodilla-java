package Loops;
import java.util.Scanner;

public class Application {
    public static void main(String[] Args){
        int sum=0;

        Scanner scanner = new Scanner(System.in);
        System.out.print(" Please ener array lenght: ");
        int arrayLenght = scanner.nextInt();
        int[] values = new int[arrayLenght];
        System.out.println();
        System.out.println("Ok. Lets do it....");

        for (int i=0; i<arrayLenght; i++){
            int z=i+1;
            System.out.print("Value nr "+ z +" is:>");
            values[i] = scanner.nextInt();
        }
        System.out.println("Allready read all array values. These are: ");

        for( int i=0; i<arrayLenght; i++){
            sum=sum+values[i];
            System.out.print(values[i]+", ");
        }
        double average = sum/values.length;
        System.out.println("...and average of entered values is: "+ average);



        // Klasę skanowania - tworzona już
        // Podaj liczbę lementów
        // Zczytaj z klawiatury wpisywane wartości
        // Odczytuj czy program jest gotowy do przetwarzania czy też nie
        // Wykonaj pętle wyświetlającą w lini wszystkie argumenty tablicy i jednocześnie sumujący zawarte w nim
        // elementy.



    }
}
