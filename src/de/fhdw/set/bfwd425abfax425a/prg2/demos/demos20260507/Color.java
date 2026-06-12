package de.fhdw.set.bfwd425abfax425a.prg2.demos.demos20260507;

public enum Color {
    RED('R'), GREEN('G'), BLUE('B');

    private char mAbbr;

    Color(char c) {
        mAbbr = c;
    }

    char getAbbr() {
        return mAbbr;
    }
}
