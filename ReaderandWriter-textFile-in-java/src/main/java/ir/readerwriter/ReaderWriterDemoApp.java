package ir.readerwriter;

import java.io.*;

public class ReaderWriterDemoApp {


    public static void main(String[] args) {
String filePath = "C:\\Users\\Parse\\Desktop\\MiladTask\\JavaCoreTask\\ReaderAndWriter-in-java\\ReaderandWriter-textFile-in-java\\src\\main\\resources\\file.txt";
try(BufferedReader bf = new BufferedReader(new FileReader(filePath))){

    String line ;
    System.out.println("the file path of :");
    while ((line = bf.readLine()) != null){
        System.out.println(line);
    }
} catch (FileNotFoundException e) {
    throw new RuntimeException(e);
} catch (IOException e) {
    throw new RuntimeException(e);
}

String message = " \n my name is milad rostami";
try(BufferedWriter bw = new BufferedWriter(new FileWriter( filePath,true))){
    bw.write(message);
    System.out.println("the new message added to file path successfully!!!!");
} catch (IOException e) {
    throw new RuntimeException(e);
}


    }
}
