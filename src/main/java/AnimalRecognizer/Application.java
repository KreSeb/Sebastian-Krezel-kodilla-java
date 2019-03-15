package AnimalRecognizer;

public class Application {
    public static void main(String[] Args){
        AnimalRecognizer animalRecognizer =new AnimalRecognizer();
        System.out.println(animalRecognizer.recognize(new Mouse()));
    }
}
