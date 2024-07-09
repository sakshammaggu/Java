abstract class animal {
    protected String animalSpecies="abc";
    protected void printAnimalSpecies() {
        System.out.println("animalSpecies: " + animalSpecies);
    }
}
class dog extends animal {
    protected String animalName="dog";
    protected void printAnimalName() {
        dog dogObj=new dog();
        dogObj.printAnimalSpecies();
        System.out.println("animalName: " + animalName);
    }
}
public class abstraction extends dog{
    public static void main(String[] args) {
        abstraction myObj=new abstraction();
        myObj.printAnimalName();
    }
}