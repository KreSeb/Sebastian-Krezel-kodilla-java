package Loops;
import java.util.Scanner;

public class Application {
    public static void main(String[] Args){

        SetTable table = new SetTable(2);
        table.tableMaker();

        table.displayArray(table.returnArray());
    }
}
