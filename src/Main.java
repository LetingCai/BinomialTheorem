import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str;
        int x;
        BinomialTheorem calc = new BinomialTheorem();


        System.out.println("Welcome to Combination and Permutation Calculator!\n\nTotal number of objects?");
        calc.changeN(scan.nextInt());
        System.out.println("Number of objects selected?");
        calc.changeR(scan.nextInt());
        System.out.println(calc);


        System.out.println("\nDo you want to explore more functionalities? (Yes or No)");
        if (scan.next().equalsIgnoreCase("Yes")){
        System.out.println("\nEnter nCr for combination (fill in variable n and r)\nEnter nPr for permutation (fill in variable n and r)\nEnter 1 for Pascal's triangle\nEnter 2 for Binomial probability");
        str = scan.next();
        try{
            x = Integer.parseInt(str);
            if (x==1){
                System.out.println("How many rows? ");
                System.out.println(BinomialTheorem.pascalsTriangle(scan.nextInt()));
            } else if(x==2){
                System.out.println("What is the probability of success? (in in decimal form)");
                double p = scan.nextDouble();
                System.out.println("Number of success?");
                int n1 = scan.nextInt();
                System.out.println("Number of failures?");
                int n2 = scan.nextInt();
                System.out.println("Probability: "+BinomialTheorem.probability(n1, n2,p));
            }
        } catch(Exception e) {
            if (str.contains("C")) {
                System.out.println(BinomialTheorem.combination(Integer.parseInt(str.substring(0, str.indexOf("C"))), Integer.parseInt(str.substring(str.indexOf("C")+1))));
            } else if (str.contains("P")) {
                System.out.println(BinomialTheorem.permutation(Integer.parseInt(str.substring(0, str.indexOf("P"))), Integer.parseInt(str.substring(str.indexOf("P")+110))));
            }
        }
        }
    }
}
