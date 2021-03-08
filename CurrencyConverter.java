import java.util.Scanner;
public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.printf("Курс доллара: ");
        double kurs = in.nextDouble();
        System.out.printf("Количество рублей: ");
        double rub = in.nextDouble();
        System.out.printf("Итого: %.2f $%n", rub / kurs );
    }
}
