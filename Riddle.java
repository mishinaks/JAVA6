import java.util.Scanner;
public class Riddle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.printf("Сидит дед, во сто шуб одет, кто его раздевает, тот слезы проливает %nВведите ответ: ");
        String answer = in.nextLine();
        if (answer.equals("Заархивированный вирус")){
            System.out.printf("Правильно!");
            return;
        }
        else if(answer.equals("Подсказка")){
            System.out.printf("Любая подсказка =))!%nВведите ответ: ");
            String help = in.nextLine();
            if(help.equals("Заархивированный вирус")){
                System.out.printf("Правильно!");
                return;
            }
            else{
                System.out.printf("Обидно, приходи в другой раз");
                return;
            }
        }
        else{
            System.out.printf("Подумай еще!%nВведите ответ: ");
            String answertwo = in.nextLine();
            if(answertwo.equals("Заархивированный вирус")){
                System.out.printf("Правильно!");
                return;
            }
            else{
                System.out.printf("Подумай еще!%nВведите ответ: ");
                String answerthree = in.nextLine();
                if(answerthree.equals("Заархивированный вирус")){
                    System.out.printf("Правильно!");
                    return;
                }
                else{
                    System.out.printf("Обидно, приходи в другой раз");
                }
            }
        }
    }
}
