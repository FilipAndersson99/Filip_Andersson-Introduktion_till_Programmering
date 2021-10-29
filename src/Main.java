import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        TextEater text = new TextEater();
        while (!text.stopTracker()) {
            Scanner txt = new Scanner(System.in);
            String myText = txt.nextLine();
            text.textAdder(myText);
        }
        System.out.println(text.characterCounter()+" "+ text.rowCounter());
    }
}