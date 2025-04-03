package com.example;

import java.util.List;

public class Lion {

    boolean hasMane;
    private Feline feline;

    public Lion(String sex) throws Exception {
        if ("Самец".equals(sex)) {
            hasMane = true;
        } else if ("Самка".equals(sex)) {
            hasMane = false;
        } else {
            throw new Exception("Используйте допустимые значения пола животного - самец или самка");
        }
    }

    public void setFeline(Feline feline){
        this.feline = feline;
    }

    public int getKittens() {
        try {
            return feline.getKittens();
        } catch (NullPointerException e) {
            throw new RuntimeException("У этого животного не задано семейство кошачьих" + e);
        }
    }

    public boolean doesHaveMane() {
        return hasMane;
    }

    public List<String> getFood() throws Exception {
        try {
            return feline.getFood("Хищник");
        } catch (NullPointerException e) {
            throw new RuntimeException("У этого животного не задано семейство кошачьих" + e);
        }
    }
}
