import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Калькулятор\n");
        System.out.println("1 - синус");
        System.out.println("2 - косинус");
        System.out.println("3 - тангенс");
        System.out.println("4 - котангенс");
        System.out.print("--Выберите вариант: ");
        if (!scanner.hasNextInt()) {
            System.out.println("Ошибка! Вы должны ввести число!");
            return;
        }
        int option = scanner.nextInt();
        switch (option) {
            case 1:
                try {
                    System.out.println("1 - синус");
                    System.out.println("2 - арксинус");
                    System.out.println("3 - гиперболический синус");
                    System.out.print("--Введите вариант: ");
                    int sinInputOption = scanner.nextInt();
                    switch (sinInputOption) {
                        case 1:
                            System.out.print("--Введите число для вычисления синуса: ");
                            double sinInput = scanner.nextInt();
                            double sinValue = Math.sin(Math.toRadians(sinInput));
                            System.out.println("Синус " + sinInput + " = " + sinValue);
                            break;

                        default:
                            break;
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Введите достоверные данные!");
                }
                break;

            default:
                break;
        }
    }
}
