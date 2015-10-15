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
        System.out.println(String.format("Created %s", animal));

        /*
        for (InventoryItem item : inventory){
            System.out.println(num + ". " + quantity + " " + item.name + " " + item.category);
            }//End of for loop
         */
    }//End of Main Method

    static Animal createAnimal(String animalName){
        //animalName = animalName.toLowerCase();
        Animal animal;
        switch (animalName){
            case "snake":
                animal =  new Snake();
                break;
            case "lion":
                animal = new Lion();
                break;
            case "condor":
                animal = new Condor();
                break;
            default:
                animal = new Animal();
        }//End of Switch statement
        /*
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
        */
        return animal;
    }//End of createAnimal Method

}//End of Zoo Class
