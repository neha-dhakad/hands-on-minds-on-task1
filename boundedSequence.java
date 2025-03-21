
    import java.util.HashMap;
import java.util.Map;

public class boundedSequence  {
    static final int MOD = 1_000_000_000;
    static Map<Long, Long> memo = new HashMap<>();
    
    public static long countSequences(long n) {
        if (n == 1) return 1;
        if (memo.containsKey(n)) return memo.get(n);
        
        long count = 1;
        for (long x = 2; x <= n; x++) {
            long quotient = n / x;
            if (quotient == 0) break;
            count = (count + countSequences(quotient)) % MOD;
        }
        
        memo.put(n, count);
        return count;
    }
    
    public static void main(String[] args) {
        long n = 10_000_000_000L; 
        System.out.println(countSequences(n));
    }
}


