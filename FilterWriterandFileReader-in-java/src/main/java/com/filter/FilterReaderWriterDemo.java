package com.filter;

import com.filter.filterreader.RemoveVowelsFilterReader;
import com.filter.filterwriter.ReplaceDotFilterWriter;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FilterReaderWriterDemo {

    final static String inputFilePath = "C:\\Users\\Parse\\Desktop\\MiladTask\\JavaCoreTask\\ReaderAndWriter-in-java\\FilterWriterandFileReader-in-java\\src\\main\\resources\\inputFile.txt";
    final static String outputFilePath = "C:\\Users\\Parse\\Desktop\\MiladTask\\JavaCoreTask\\ReaderAndWriter-in-java\\FilterWriterandFileReader-in-java\\src\\main\\resources\\inputFile.txt";


    public static void main(String[] args) {

        try (
                FileReader fileReader = new FileReader(inputFilePath);
                RemoveVowelsFilterReader filterReader = new RemoveVowelsFilterReader(fileReader);
                FileWriter fileWriter = new FileWriter(outputFilePath);
                ReplaceDotFilterWriter filterWriter = new ReplaceDotFilterWriter(fileWriter);
        ) {

            System.out.println("Content of the file after filtering vowels and replacing periods:");
            int myChar ;
            while ((myChar = fileReader.read()) !=-1){
                filterWriter.write(myChar);
                System.out.println((char) myChar);
            }
            System.out.println("\nWriting data to a new file with applied filters is complete.");


        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }


}
