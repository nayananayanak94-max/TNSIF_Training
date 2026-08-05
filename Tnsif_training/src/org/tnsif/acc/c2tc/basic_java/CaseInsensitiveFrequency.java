package org.tnsif.acc.c2tc.basic_java;

public class CaseInsensitiveFrequency {

	public static void main(String[] args) {
        String str = "Java Programming";
        str = str.toLowerCase();

        int freq[] = new int[256];

        for (int i = 0; i < str.length(); i++) {
            freq[str.charAt(i)]++;
        }

        for (int i = 0; i < 256; i++) {
            if (freq[i] > 0 && i != ' ') {
                System.out.println((char) i + " = " + freq[i]);
            }
        }
    }
}