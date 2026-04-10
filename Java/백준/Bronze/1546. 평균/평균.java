import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] numList = new int[n];

        for (int i = 0; i < n; i++) {
            numList[i] = sc.nextInt();
        }

        int maxNum = 0;
        int sumNum = 0;

        for (int i = 0; i < n; i++) {
            if (numList[i] > maxNum) {
                maxNum = numList[i];
            }
            sumNum += numList[i];
        }

        double result = (double) sumNum / maxNum / n * 100;
        System.out.println(result);
    }
}