package ir.piped.producer;


import java.io.IOException;
import java.io.PipedWriter;

// Data generator class
public class DataProducer extends Thread {

    private final PipedWriter pipedWriter;


    public DataProducer(PipedWriter pipedWriter) {
        this.pipedWriter = pipedWriter;
    }

    @Override
    public void run() {

        for (int i = 0; i < 10; i++) {
            String message = "Hello Java Developer" + i;
            try {
                pipedWriter.write(message);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            try {
                pipedWriter.write("\n");
                Thread.sleep(300);
            } catch (IOException | InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
