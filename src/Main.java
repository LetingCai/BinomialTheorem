import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        BinomialTheorem calc = new BinomialTheorem();
        boolean condition = true;
        String str;
        int x;
        System.out.print("Welcome to Combination and Permutation Calculator!\nEnter nCr for combination (fill in variable n and r)\nEnter nPr for permutation (fill in variable n and r)\nEnter 1 for Pascal's triangle\nEnter 2 for Binomial probability\n Enter -1 to quit");
        str = scan.nextLine();
        try{
            x = Integer.parseInt(str);
        } catch(Exception e){
            if((str.charAt(1) == 'C' || str.charAt(1) == 'D')){

            }
        }
    }
}
