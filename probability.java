public class probability {
    public static void main(String[] args) {
        int N = 5; 

        
        double prob1 = computeExitBasedProbability(N);

        
        double prob2 = computeFixed50Probability(N);

        
        double finalProbability = (prob1 + prob2) / 2;

        
        System.out.printf("%.12f%n", finalProbability);
    }

   
    public static double computeExitBasedProbability(int N) {
        double totalProbability = 0;

        for (int i = 0; i < N; i++) { 
            for (int j = 0; j < N; j++) { 
                int exits = 4; 
                if (i == 0 || i == N - 1) exits--; 
                if (j == 0 || j == N - 1) exits--;

                totalProbability += 1.0 / (exits + 1);
            }
        }
        return totalProbability / (N * N);
    }

   
    
    public static double computeFixed50Probability(int N) {
        double totalProbability = 0;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) { 
                int exits = 4;
                if (i == 0 || i == N - 1) exits--; 
                if (j == 0 || j == N - 1) exits--; 

                totalProbability += 0.5 + (0.5 / exits);
            }
        }
        return totalProbability / (N * N);
    }
}
