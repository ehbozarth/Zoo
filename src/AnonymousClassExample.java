/**
 * Created by earlbozarth on 10/26/15.
 */
public class AnonymousClassExample {

    public static void main(String[] args) {
        //Create alligator from seperate class
        Alligator al = new Alligator();
        System.out.println(al);

        //Create alligator from anonymous class
        Reptile a2 = new Reptile(){
            @Override
            public String toString(){
                return "Alligator";
            }//End of Override toString

        };//End of newReptile

        System.out.println(a2);

    }//End of Main Method

}//End of AnonymousClassExample Class

class Alligator extends Reptile{
    @Override
    public String toString(){
        return "Alligator";
    }//End of toString
}//End of Alligator Class
