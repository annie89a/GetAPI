package com.example.GetAPI;

public class MeowFact {
    String fact;
    int length;

    public MeowFact()
    {

    }

    public String getFact() {
        return fact;
    }

    public void setFact(String fact) {
        this.fact = fact;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "MeowFact{" +
                "fact='" + fact + '\'' +
                ", length=" + length +
                '}';
    }
}
