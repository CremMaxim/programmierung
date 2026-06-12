package de.fhdw.set.bfwd425abfax425a.prg2.demos.demos20260528;

import java.io.IOException;

public class DemoExceptions6 {

    public static void main(String[] args) throws IOException {
        a();
        b();
    }

    private static void a() {
        try {
            throw new IOException();
        }
        catch (IOException ioe) {

        }
    }

    private static void b() throws IOException {
        throw new IOException();
    }

}
