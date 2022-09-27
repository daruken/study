package org.example.study.string;

public class CharAt {
    public char charAtPoint(String str, int i) {
        if (i > str.length()) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size: " + str.length());
        }

        return str.charAt(i);
    }
}
