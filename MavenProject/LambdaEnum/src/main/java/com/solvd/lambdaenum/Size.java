package com.solvd.lambdaenum;

public enum Size {
    SMALL("S"), MEDIUM("M"), LARGE("L");

    private final String abbreviation;

    Size(String abbreviation) {
        this.abbreviation = abbreviation;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public void displaySize() {
        System.out.println("Size: " + this.name() + ", Abbreviation: " + abbreviation);
    }
}
