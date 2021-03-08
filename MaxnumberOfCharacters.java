import java.util.Scanner;
public class MaxnumberOfCharacters {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Количество строк: ");
        int n = in.nextInt();
        in.nextLine();
        String [] str = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.printf("Строка %d: ", i+1);
            str[i] = in.nextLine();
        }
        int [] difsim = new int[n];
        for (int i = 0; i < n; i++) {
            int sizest = str[i].length();
            int counter = 0;
            for (int a = 0; a < sizest; a++) {
                char sim;
                sim = str[i].charAt(a);
                int resind = str[i].indexOf(sim);
                int reslast = str[i].lastIndexOf(sim);
                if (reslast == resind) {
                    counter++;
                }
            }
            difsim[i] = counter;
        }
        int max = 0;
        for (int i = 0; i < n; i++) {
            max = Math.max(difsim[i], max);
        }
        for (int i = 0; i < n; i++) {
            if ( difsim[i] == max) {
                System.out.println("Ответ: " + str[i]);
                return;
            }
        }
    }
}
