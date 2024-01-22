import java.io.*;
public class StringStream {
    static int i = -1;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = new String[100];
        System.out.println("Enter lines of text: ");
        System.out.println("[Enter stop to stop!]");
        do{
            i++;
            str[i] = br.readLine();
        }while (!str[i].equals("stop"));
        System.out.println("\nHere is your file:");
        for(i=0; i<100; i++){
            if (str[i].equals("stop")) break;
            System.out.println(str[i]);
        }
    }
}
