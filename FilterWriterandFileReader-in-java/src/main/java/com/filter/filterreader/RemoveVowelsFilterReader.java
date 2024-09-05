package com.filter.filterreader;

import java.io.FilterReader;
import java.io.IOException;
import java.io.Reader;
import java.nio.CharBuffer;

// Custom class to filter out vowels from the input stream
public class RemoveVowelsFilterReader extends FilterReader {


    /**
     * Creates a new filtered reader.
     *
     * @param in a Reader object providing the underlying stream.
     * @throws NullPointerException if {@code in} is {@code null}
     */
    public RemoveVowelsFilterReader(Reader in) {
        super(in);
    }

    @Override
    public int read() throws IOException {
 int c;
 while ((c = super.read()) != -1){
     if ("aeiouAEIOU".indexOf(c) == -1){
         return c;
     }
 }
 return -1;
    }

    @Override
    public int read(char[] cbuf, int off, int len) throws IOException {
        int numberRead = super.read(cbuf, off, len);
        if (numberRead == -1){
            return -1;
        }
        // filter out vowels
        int validLength = 0;
        for (int i = off; i < off+validLength; i++) {
            if ("aeiouAEIOU".indexOf(cbuf[i]) == -1){
                cbuf[validLength++] = cbuf[i];
            }
        }
        return validLength;
    }

}
