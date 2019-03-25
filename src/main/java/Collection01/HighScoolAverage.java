package Collection01;
import java.util.*;


public class HighScoolAverage {
    public static void main(String[] args) {
        ArrayList<Integer> grades = new ArrayList<Integer>();
        grades.add(3);
        grades.add(5);
        grades.add(1);
        grades.add(2);
        grades.add(3);
        grades.add(4);
        grades.add(2);
        grades.add(5);
        grades.add(6);
        grades.add(3);
        grades.add(5);
        grades.add(4);

        double sum = 0;

        double bigest=grades.get(0);
        double smallest=grades.get(0);


        for (int i=0; i< grades.size(); i++) {
            if (smallest>grades.get(i)){
                smallest = grades.get(i);
            }
            if(bigest<grades.get(i)){
                bigest=grades.get(i);
            }
            sum = sum + grades.get(i);
        }
        Double modyfiSum = sum - smallest - bigest;
        Double average = modyfiSum / (grades.size()-2);

        System.out.println("Najniższa ocena w śród " + grades.size()+" ocen to: "+smallest);
        System.out.println("Najwyższa ocena w śród " + grades.size()+ " ocen to: "+bigest);
        System.out.println("Suma ocen to:" + sum);
        System.out.println("Zmodyfikowana suma to: "+ modyfiSum);
        System.out.println("Srednia bez jednej najniższej i jednej najwyższej ocenty wynosi: " + average);
    }
}