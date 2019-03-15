package AnimalRecognizer;

public class AnimalRecognizer {
    public String recognize (Animal animal){
        return "Looking animal is "+animal.name()+" and sounds like: "+ animal.voice();
    }
}
