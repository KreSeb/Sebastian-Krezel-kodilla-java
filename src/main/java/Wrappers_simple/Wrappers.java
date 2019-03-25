package Wrappers_simple;

public class Wrappers {
    public static void main(String[] args) {
        int inte = 5;
        double doub = 3.141516775556;
        char chary = 'S';

        Integer integer = 3;
        Double soup = doub;
        Character c = chary;

        System.out.println(integer + "; " + soup + "; " + c);
        if (inte == integer) {
            System.out.println("Wrapper i typ prosty dla liczby całkowitej są takie same !");
        } else {
            System.out.println("A to ci niezpodziewajka !!!!");

        }
    }
}