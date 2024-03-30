import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String ANSI_RED = "\u001B[31m";
        String ANSI_RESET = "\u001B[0m";
        String ANSI_WHITE_BACKGROUND = "\u001B[47m";
        String ANSI_RED_BACKGROUND = "\u001B[41m";
        String wordColor = "Ошибка! Вы должны ввести число!";
        String coloredWord = ANSI_RED + wordColor + ANSI_RESET;
        System.out.println("Калькулятор\n");
        int option = 0;
        do {
            System.out.println("1 - синус");
            System.out.println("2 - косинус");
            System.out.println("3 - тангенс");
            System.out.println("4 - котангенс");
            System.out.print("--Выберите вариант: ");
            if (!scanner.hasNextInt()) {
                System.out.println(ANSI_WHITE_BACKGROUND + coloredWord + ANSI_RESET);
                scanner.next();
                continue;
            }
            option = scanner.nextInt();
            if (option > 3) {
                System.out.println("Введите число от 1 до 3!");
                continue;
            }
        } while (option < 1 || option > 4);
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
                        case 2:
                            System.out.print("--Введите число для вычисления синуса: ");
                            double arcSinInput = scanner.nextInt();
                            double arcSinValue = Math.asin(Math.toRadians(arcSinInput));
                            System.out.println("Арксинус " + arcSinInput + " = " + arcSinValue);
                            break;
                        case 3:
                            System.out.print("--Введите число для вычисления синуса: ");
                            double hyperSinInput = scanner.nextInt();
                            double hyperSinValue = Math.sinh(Math.toRadians(hyperSinInput));
                            System.out.println("Гиперболический синус " + hyperSinInput + " = " + hyperSinValue);
                            break;
                        default:
                            System.out.println("Вы ввели неверный вариант!");
                            break;
                    }
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("Введите достоверные данные!");
                }
                break;
            case 2:
                try {
                    System.out.println("1 - косинус");
                    System.out.println("2 - арккосинус");
                    System.out.println("3 - гиперболический косинус");
                    System.out.print("--Введите вариант: ");
                    int cosInputOption = scanner.nextInt();
                    switch (cosInputOption) {
                        case 1:
                            System.out.print("--Введите число для вычисления косинуса: ");
                            double cosInput = scanner.nextInt();
                            double cosValue = Math.cos(Math.toRadians(cosInput));
                            System.out.println("Косинус " + cosInput + " = " + cosValue);
                            break;
                        case 2:
                            System.out.print("--Введите число для вычисления арккосинуса: ");
                            double arcCosInput = scanner.nextInt();
                            double arcCosValue = Math.acos(Math.toRadians(arcCosInput));
                            System.out.println("Арккосинус " + arcCosInput + " = " + arcCosValue);
                            break;
                        case 3:
                            System.out.print("--Введите число для вычисления гиперболического косинуса: ");
                            double hyperSinInput = scanner.nextInt();
                            double hyperSinValue = Math.cosh(Math.toRadians(hyperSinInput));
                            System.out.println("Гиперболический косинус " + hyperSinInput + " = " + hyperSinValue);
                            break;
                        default:
                            System.out.println("Вы ввели неверный вариант!");
                            break;
                    }
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("Введите достоверные данные!");
                }
            default:
                System.out.println("Вы ввели неверный вариант!");
                break;
        }
    }
}
