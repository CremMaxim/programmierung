package de.fhdw.set.bfwd425abfax425a.prg2.exercises.exercise089;

public enum Day {
    MONDAY("MO", false),
    TUESDAY("TU", false),
    WEDNESDAY("WE", false),
    THURSDAY("TH", false),
    FRIDAY("FR", false),
    SATURDAY("SA", true),
    SUNDAY("SU", true);

    private String mAbbr;
    private boolean mIsWeekendDay;

    Day(String abbr, boolean isWeekendDay) {
        mAbbr = abbr;
        mIsWeekendDay = isWeekendDay;
    }

    public String getAbbr() {
        return mAbbr;
    }

    public boolean isWeekendDay() {
        return mIsWeekendDay;
    }

}
