import java.util.Random;
public class HandleError {
    public static void main(String[] args){
        Random rand = new Random();
        int a = rand.nextInt();
        try{
            int b = a / 0;
        }
        catch(Exception e){
            System.out.println("The exception is:"+ e.getMessage());
        }
        System.out.println("Event Handled");

    }
}
