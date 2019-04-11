package edu.wpi.cs3733.entity;

import java.util.HashMap;


class CipherConversions {
    private HashMap<Character, Character> CaeserCipher = new HashMap<>();


    CipherConversions() {
        setCaeserCipher();
    }

    /*
    A substitution cipher that swaps each of the following pair of characters with one another:
            a.	a and h
            b.	e and r
            c.	i and s
            d.	o and n
            e.	u and t
     */
    private void setCaeserCipher() {
        CaeserCipher.put('a', 'h');
        CaeserCipher.put('e', 'r');
        CaeserCipher.put('i', 's');
        CaeserCipher.put('o', 'n');
        CaeserCipher.put('u', 't');
        CaeserCipher.put('h', 'a');
        CaeserCipher.put('r', 'e');
        CaeserCipher.put('s', 'i');
        CaeserCipher.put('n', 'o');
        CaeserCipher.put('t', 'u');
    }

    int getElbonianConversion(char c) throws IllegalArgumentException {
        switch (Character.toUpperCase(c)) {
            case 'A':
            case 'B':
            case 'C':
                return 2;
            case 'D':
            case 'E':
            case 'F':
                return 3;
            case 'G':
            case 'H':
            case 'I':
                return 4;
            case 'J':
            case 'K':
            case 'L':
                return 5;
            case 'M':
            case 'N':
            case 'O':
                return 6;
            case 'P':
            case 'Q':
            case 'R':
            case 'S':
                return 7;
            case 'T':
            case 'U':
            case 'V':
                return 8;
            case 'W':
            case 'X':
            case 'Y':
            case 'Z':
                return 9;
            case ' ':
                return 0;
            default:
                throw new IllegalArgumentException("Invalid Character Used");
        }
    }

    boolean isCaeserConversionChar(char c) {
        return (CaeserCipher.containsKey(Character.toLowerCase(c)));
    }

    char getCaeserConversion(boolean isUpperCase, char c) {
        return isUpperCase ? (Character.toUpperCase(CaeserCipher.get(Character.toLowerCase(c)))) : (CaeserCipher.get(Character.toLowerCase(c)));
    }
}

