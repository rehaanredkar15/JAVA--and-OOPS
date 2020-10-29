package networking_java;
import java.io.IOException;
import java.io.InputStream;
import java.net.*;

public class urlparsing {
    public static void main(String[] args) {

        try{
            URL ur = new URL("https://www.youtube.com/watch?v=Ps2q_purSrM&ab_channel=LearnWithReshu");

            URLConnection uc = ur.openConnection();

            InputStream stm = uc.getInputStream();

            int i;
            while ((i = stm.read())!=-1){

                System.out.println((char) i);

            }

            System.out.println("protocol is " + ur.getProtocol());
            System.out.println("Host Name is " + ur.getHost());
            System.out.println("Port Number is " + ur.getPort());
            System.out.println("File Name is " + ur.getFile());
            System.out.println("Default Port Number: "+ur.getDefaultPort());
            System.out.println("Query String: "+ur.getQuery());
            System.out.println("Path: "+ur.getPath());

          
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


}
