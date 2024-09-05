package com.filter.filterwriter;


import java.io.FilterWriter;
import java.io.IOException;
import java.io.Writer;

// Custom class to replace periods with exclamation marks in the output stream
public class ReplaceDotFilterWriter extends FilterWriter {
    /**
     * Create a new filtered writer.
     *
     * @param out a Writer object to provide the underlying stream.
     * @throws NullPointerException if {@code out} is {@code null}
     */
    public ReplaceDotFilterWriter(Writer out) {
        super(out);
    }

    @Override
    public void write(int c) throws IOException {
        if (c == '.') {
            super.write('!');
        } else {
            super.write(c);
        }
    }

    @Override
    public void write(char[] cbuf, int off, int len) throws IOException {
        for (int i = 0; i < len; i++) {
            if (cbuf[i + off] == '.') {
                cbuf[i + off] = '!';
            }
        }
        super.write(cbuf, off, len);
    }

    @Override
    public void write(String str, int off, int len) throws IOException {
        super.write(str.replace('.', '!'), off, len);
    }


}
