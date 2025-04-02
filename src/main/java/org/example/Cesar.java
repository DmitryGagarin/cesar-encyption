package org.example;

import java.util.Scanner;

public class Cesar {

    public static final String letters = "abcdefghijklmnopqrstuvwxyz";

    public static void main(String[] args) {
        // формлу En(x) = (x + n)%k (где x - смещение, n - индекс символа для замены, k - количество символов в алфавите)
        Scanner sc = new Scanner(System.in);
        String message = sc.nextLine();
        int change = sc.nextInt();
        System.out.println(cesar(message, change));
    }

    public static String cesar(String message, int change) {
        message = message.toLowerCase();
        StringBuilder newMessage = new StringBuilder();
        for (int i = 0; i < message.length(); i++) {
            int charPos = letters.indexOf(message.charAt(i));
            int keyVal = (change + charPos) % 26;
            char replaceVal = letters.charAt(keyVal);
            newMessage.append(replaceVal);
        }
        return newMessage.toString();
    }
}