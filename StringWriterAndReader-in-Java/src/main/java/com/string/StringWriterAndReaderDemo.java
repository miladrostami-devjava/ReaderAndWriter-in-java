package com.string;

import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;

public class StringWriterAndReaderDemo {


    public static void main(String[] args) {
        // Step 1: Write data to StringWriter
        StringWriter writer = new StringWriter();
        writer.write("Message 1: Hello World\n");
        writer.write("Message 2: Java is fun!\n");
        writer.write("Message 3: StringWriter and StringReader are useful!\n");

        // Step 2: Convert StringWriter data to String
        String writtenData = writer.toString();
        System.out.println("Data written to StringWriter:\n" + writtenData);

        // Step 3: Read data using StringReader and process it
        StringReader reader = new StringReader(writtenData);
        int character;
        StringBuilder processedMessage = new StringBuilder();

        try {
            while ((character = reader.read()) != -1) {
                // For simplicity, let's just convert all characters to uppercase
                processedMessage.append(Character.toUpperCase((char) character));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Step 4: Output the processed message
        System.out.println("Processed Message:\n" + processedMessage.toString());
    }
}
