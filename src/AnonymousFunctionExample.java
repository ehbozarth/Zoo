/**
 * Created by earlbozarth on 10/26/15.
 */
public class AnonymousFunctionExample {
    public static void main(String[] args) {
        sayHello();

        //run code from anonymous class
        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello from anonymous class!");
            }
        };

        r1.run();

        //Run code from Anonymous Function
        Runnable r2 = () -> {
            System.out.println("Hello from anonymous function!");
        };

        r2.run();

    }//End of Main Method

    static void sayHello(){
        System.out.println("Hello from a separate method!");
    }//End of sayHello Method

}//End of AnonymousFunctionExample
