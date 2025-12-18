package belajar.java.array.dan.string;

public class CountCharacterFrequencyApp {
    public static void main(String[] args) {
        System.out.println("String 1");
        countCharacterFrequency("Care");

        System.out.println("String 2");
        countCharacterFrequency("Banana");

        System.out.println("String 3");
        countCharacterFrequency("Sandy Dwi Handoko Trapsilo");
    }

    public static void countCharacterFrequency(String string) {
        int[] frequency = new int[26]; // huruf a-z
        string = string.toLowerCase();

        for (int character : string.toCharArray()) {
            if (character >= 'a' && character <= 'z') {
                frequency[character - 'a']++;
            }
        }

        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] > 0) {
                System.out.println((char) (i + 'a') + " = " + frequency[i]);
            }
        }
    }
}
