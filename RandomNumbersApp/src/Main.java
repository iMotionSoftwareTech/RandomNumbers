//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int num1 = 1;
        int num2 = 10;
        int min = Math.min(num1, num2);
        int max = Math.max(num1, num2);
        int random = (int) (Math.random() * num1);
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Average: " + random + " " + "Minimum: " + min + " " + "Maximum: " + max);
    }
}