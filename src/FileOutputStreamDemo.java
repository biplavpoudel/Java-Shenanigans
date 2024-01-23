import java.io.*;
public class FileOutputStreamDemo {
    public static void main(String[] args) throws Exception{
        String src="Hell Yeah!! I am readyyyy.\n"
                +"Don't get in my way donkey.";
        byte[] buffer = src.getBytes();

        //file1.txt contains every other byte from the sample.
        OutputStream f0 = new FileOutputStream("file1.txt");
        for(int i=0; i< buffer.length; i = i+2){
            f0.write(buffer[i]);
        }
        f0.close();

        //file2.txt contains the entire set of bytes
        OutputStream f1 = new FileOutputStream("file2.txt");
        f1.write(buffer);
        f1.close();

        //file3.txt contains only the last quarter.
        OutputStream f3 = new FileOutputStream("file3.txt");
        f3.write(buffer, buffer.length-buffer.length/4,buffer.length/4);
        f3.close();

    }
}
