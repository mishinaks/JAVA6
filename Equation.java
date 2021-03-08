import java.util.Scanner;
public class Equation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.printf("Уравнение: ");
        String urav = in.nextLine();
        String[] arraystr = urav.split("");
        if (arraystr.length != 5 || !arraystr[3].equals("=")){
            System.out.println("ОШИБКА! НЕВЕРНЫЙ ФОРМАТ УРАВНЕНИЯ");
            return;
        }
        int res = 0;
        if (arraystr[1].equals("+") && arraystr[0].equals("x") || arraystr[2].equals("x") && arraystr[1].equals("+")){
            int a = Integer.parseInt((arraystr[0].equals("x")) ? arraystr[2] : arraystr[0]);
            int b = Integer.parseInt(arraystr[4]);
            res = b - a;
        }
        else if(arraystr[1].equals("+") && arraystr[4].equals("x") || arraystr[0].equals("x") && arraystr[1].equals("-")){
            int a = Integer.parseInt((arraystr[0].equals("x")) ? arraystr[4] : arraystr[0]);
            int b = Integer.parseInt(arraystr[2]);
            res = b + a;
        }
        else if(arraystr[1].equals("-") && arraystr[4].equals("x") || arraystr[2].equals("x") && arraystr[1].equals("-")){
            int a = Integer.parseInt((arraystr[2].equals("x")) ? arraystr[4] : arraystr[2]);
            int b = Integer.parseInt(arraystr[0]);
            res = b - a;
        }
        else{
            System.out.println("ОШИБКА! НЕВЕРНЫЙ ФОРМАТ УРАВНЕНИЯ");
            return;
        }
        System.out.printf("Решение: x = %d", res);
    }
}
