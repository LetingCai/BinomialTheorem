public class BinomialTheorem {
    //Instance Variables
    private int n, r;
    private String str;

    //Constructors
    public BinomialTheorem(int totalNumberOfObjects, int numberOfObjectsSelected){
        n = totalNumberOfObjects;
        r = numberOfObjectsSelected;
    }
    public BinomialTheorem(){
         n = 1;
         r = 1;
    }

    //Methods
    public int nFactorial(){
        int ans=1;
        for (int nF=n; nF>0; nF--){
            ans*=nF;
        }
        return ans;
    }
    public int nFactorial(int n){
        int ans=1;
        for (int nF=n; nF>0; nF--){
            ans*=nF;
        }
        return ans;
    }

    public int rFactorial(){
        int ans=1;
        for (int rF=r; rF>0; rF--){
            ans*=rF;
        }
        return ans;
    }
    public int rFactorial(int r){
        int ans=1;
        for (int rF=r; rF>0; rF--){
            ans*=rF;
        }
        return ans;
    }

    public int nMinusRFactorial(){
        int ans=1;
        for (int nrF=(n-r); nrF>0; nrF--){
            ans*=nrF;
        }
        return ans;
    }
    public int nMinusRFactorial(int n, int r){
        int ans=1;
        for (int nrF=(n-r); nrF>0; nrF--){
            ans*=nrF;
        }
        return ans;
    }

    public int combination(){
        return permutation()/rFactorial();
    }
    public int combination(int n, int r){return permutation(n, r)/rFactorial(r);}

    public int permutation(){
        return nFactorial()/nMinusRFactorial();
    }
    public int permutation(int n, int r){return nFactorial(n)/nMinusRFactorial(n,r);}



    public String pascalsTriangle() {
        int a = n-1;
        StringBuilder returnString = new StringBuilder();
        for (int i = 0; i<=n; i++ ){
            returnString.append(" ".repeat(a + 1));
            for (int e = 0; e <=i;e++){
                returnString.append(combination(i, e)).append(" ");
            }
            a--;
            returnString.append("\n");
        }
        return returnString.toString();
    }


}
