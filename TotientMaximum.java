public class TotientMaximum
 {
   
    public static int phi(int n) {
    int result = n; 

    for (int p = 2; p <= n / p; p++) { 
        if (n % p == 0) { 
            while (n % p == 0) {  
                n /= p;
            }
            result -= result / p; 
        }
    }
    
    if (n > 1) {
        result -= result / n;
    }
    
    return result;
}

    
    public static void main(String[] args) {
        int limit = 1000000; 
        double maxRatio = 0;
        int newN = 0;
        
        for (int n = 2; n <= limit; n++) {
            int phiN = phi(n);
            double ratio = (double) n / phiN;
            if (ratio > maxRatio ) {
                maxRatio = ratio;
                newN = n;
            }
        }
        
        System.out.println("The value of n that maximizes n/phi(n) for n <= " + limit + " is: " + newN);
    }
}