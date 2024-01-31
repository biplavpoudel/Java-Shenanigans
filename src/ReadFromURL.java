import java.io.*;
import java.net.*;
public class ReadFromURL {
    public static void main(String[] args) throws Exception {
        URI uri = new URI("https://en.m.wikipedia.org/wiki/Barkhad_Abdi");
        URL oracle = uri.toURL();
        BufferedReader in = new BufferedReader(
                new InputStreamReader(oracle.openStream()));
        String inputLine;
        while ((inputLine = in.readLine()) != null)
            System.out.println(inputLine);
        in.close();
    }
}
