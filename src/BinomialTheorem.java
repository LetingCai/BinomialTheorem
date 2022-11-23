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
        int n = 1;
        int r = 1;
    }

    //Methods
    public int nFactorial(){
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

    public int nMinusRFactorial(){
        int ans=1;
        for (int nrF=(n-r); nrF>0; nrF--){
            ans*=nrF;
        }
        return ans;
    }

    public int combination(){
        return permutation()/rFactorial();
    }

    public int permutation(){
        return nFactorial()/nMinusRFactorial();
    }



}
