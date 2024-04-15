import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int Q = scanner.nextInt(); 
        int[] color = new int[2 * Q]; 
        int[] leftChild = new int[2 * Q];
        int[] rightChild = new int[2 * Q];

    
        for (int i = 1; i < 2 * Q; i++) {
            leftChild[i] = 2 * i;
            rightChild[i] = 2 * i + 1;
        }

        
        for (int q = 0; q < Q; q++) {
            int type = scanner.nextInt();
            if (type == 1) {
                
                for (int i = 1; i < 2 * Q; i++) {
                    color[i] = 1 - color[i]; 
                }
            } else {
                int x = scanner.nextInt();
                int y = scanner.nextInt();
                int result = 0;
                while (x <= y) {
                    if (type == 2) {
                        
                        result += color[x] == 0 ? 1 : 0;
                    } else {
                        
                        result += color[x] == 1 ? 1 : 0;
                    }
                    x = (x % 2 == 0) ? x / 2 : (x - 1) / 2;
                    y = (y % 2 == 0) ? y / 2 : (y - 1) / 2;
                }
                System.out.println(result);
            }
        }
    }
}
