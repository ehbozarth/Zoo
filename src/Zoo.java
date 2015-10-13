import java.util.Scanner;

/**
 * Created by earlbozarth on 10/13/15.
 */
public class Zoo {

    public static void main (String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type the name of an animal");
        String animalName = scanner.nextLine();
        Animal animal = createAnimal(animalName);
        System.out.println(String.format("%s", animal));
    }//End of Main Method

    static Animal createAnimal(String animalName){
        animalName = animalName.toLowerCase();
        if (animalName.equals("snake")){
            return new Snake();
        }
        else if(animalName.equals("lion")){
            return new Lion();
        }
        else if(animalName.equals("condor")){
            return new Condor();
        }
        else{
            return new Animal();
        }
    }//End of createAnimal Method

}//End of Zoo Class
