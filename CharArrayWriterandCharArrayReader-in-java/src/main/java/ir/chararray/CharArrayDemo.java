package ir.chararray;

import java.io.CharArrayReader;
import java.io.CharArrayWriter;
import java.io.IOException;

public class CharArrayDemo {


    public static void main(String[] args) throws IOException {
        CharArrayWriter charArrayWriter = new CharArrayWriter();
        String data = "This is an example of using CharArrayWriter and CharArrayReader.";
        charArrayWriter.write(data);
        char[] characterArray = charArrayWriter.toCharArray();

        System.out.println("The written character array :");
        System.out.println(characterArray);

        try (CharArrayReader charArrayReader = new CharArrayReader(characterArray)) {
            int index;
            while ((index = charArrayReader.read()) != -1) {

                System.out.println((char)  Character.toUpperCase(index));
            }
        }

    }
}
