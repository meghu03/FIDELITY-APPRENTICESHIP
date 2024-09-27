import java.util.Scanner;
public class ReverseSentence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String inputSentence = sc.nextLine();
        String reversedSentence = reverseWords(inputSentence);
        System.out.println("Reversed sentence: " + reversedSentence);
    }
    private static String reverseWords(String sentence) {
        String[] words = sentence.split(" ");
        StringBuilder reversedSentence = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            reversedSentence.append(words[i]).append(" ");
        }
        return reversedSentence.toString().trim();
    }
}