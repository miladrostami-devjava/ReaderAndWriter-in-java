package ir.piped;

import ir.piped.processor.DataProcessor;
import ir.piped.producer.DataProducer;

import java.io.IOException;
import java.io.PipedReader;
import java.io.PipedWriter;

public class PipedDemo {


    public static void main(String[] args) throws InterruptedException, IOException {


        PipedWriter pipedWriter = new PipedWriter();
        PipedReader pipedReader = new PipedReader(pipedWriter);

        DataProducer producer = new DataProducer(pipedWriter);
        DataProcessor processor = new DataProcessor(pipedReader);

        producer.start();
        processor.start();

        producer.join();
        processor.join();
pipedWriter.close();
pipedReader.close();

    }


}
