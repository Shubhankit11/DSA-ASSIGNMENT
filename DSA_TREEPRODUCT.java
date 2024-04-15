import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int H = scanner.nextInt();
            if (H == 0) {
                break; 
            }

            int numNodes = (1 << H) - 1; 
            long[] values = new long[numNodes];
            for (int i = 0; i < numNodes; i++) {
                values[i] = scanner.nextLong();
            }

          
            long[] P = new long[numNodes];
            for (int i = numNodes - 1; i >= 0; i--) {
                if (2 * i + 1 >= numNodes) {
                    // Leaf node
                    P[i] = values[i];
                } else {
                    // Internal node
                    P[i] = Math.max(values[i] * P[2 * i + 1], values[i] * P[2 * i + 2]);
                }
            }

            System.out.println(P[0] % 1_000_000_007);
        }
    }
}
