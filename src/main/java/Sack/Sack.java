package Sack;

import java.util.Arrays;

public class Sack {
    private int[] sack;

    public Sack() {
        sack = new int[0];
    }

    public void add(int a) {
        int[] sackWithA = Arrays.copyOf(sack, sack.length + 1);
        sackWithA[sack.length] = a;
        sack = sackWithA;
    }

    public int get(int index) {
        return sack[index];
    }

    public int size() {
        return sack.length;
    }

    public void removeLast() {
        sack = Arrays.copyOf(sack, sack.length - 1);
    }

    public void removeByIndex(int index) {

        int[] newSack = new int[sack.length - 1];
        for(int j = 0, j< newSack.length; j++) {
        for (int i = 0; i < sack.length; i++) {
            while(i<index) {
               newSack[i] = sack[i]
            }
        }}
    }
}
