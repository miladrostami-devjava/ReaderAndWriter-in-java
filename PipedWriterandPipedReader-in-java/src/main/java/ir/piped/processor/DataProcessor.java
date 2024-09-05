package ir.piped.processor;


import java.io.FilterReader;
import java.io.IOException;
import java.io.PipedReader;

// Data processor class
public class DataProcessor extends Thread {
    private final PipedReader pipedReader;


    public DataProcessor(PipedReader pipedReader) {
        this.pipedReader = pipedReader;
    }


    @Override
    public void run() {

        int c;
        StringBuilder message = new StringBuilder();
        while (true){
            try {
                if ((c = pipedReader.read()) == -1){
                }else {
                    if (c == '\n'){
                        System.out.println("Processed!" + message.toString());
                        // Clear the StringBuilder for the next message
                        message.setLength(0);
                    }else {
                        message.append((char) c);
                    }
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            } finally {
                try {
                    // Close the PipedReader after finishing reading all the data
                    pipedReader.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }

        }



    }

