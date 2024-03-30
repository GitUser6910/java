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
                System.out.println("Введите цифру от 1 до 3!");
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
                            System.out.println("Введите цифру от 1 до 3!");
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
            case 3:
                try {
                    System.out.println("1 - тангенс");
                    System.out.println("2 - арктангенс");
                    System.out.println("3 - гиперболический тангенс");
                    System.out.print("--Введите вариант: ");
                    int tanInputOption = scanner.nextInt();
                    switch (tanInputOption) {
                        case 1:
                            System.out.print("--Введите число для вычисления тангенса: ");
                            double tanInput = scanner.nextInt();
                            double tanValue = Math.tan(Math.toRadians(tanInput));
                            System.out.println("Косинус " + tanInput + " = " + tanValue);
                            break;
                        case 2:
                            System.out.print("--Введите число для вычисления арктангенса: ");
                            double arcTanInput = scanner.nextInt();
                            double arcTanValue = Math.atan(Math.toRadians(arcTanInput));
                            System.out.println("Косинус " + arcTanInput + " = " + arcTanValue);
                            break;
                        case 3:
                            System.out.print("--Введите число для вычисления гипкрболического тангенса: ");
                            double hyperTanInput = scanner.nextInt();
                            double hyperTanValue = Math.tanh(Math.toRadians(hyperTanInput));
                            System.out.println("Косинус " + hyperTanInput + " = " + hyperTanValue);
                            break;
                        default:
                            System.out.println("Вы ввели неверный вариант!");
                            break;
                    }
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("Введите достоверные данные!");
                }
            case 4:
                try {
                    System.out.println("1 - котангенс");
                    System.out.println("2 - арккотангенс");
                    System.out.println("3 - гиперболический котангенс");
                    System.out.print("--Введите вариант: ");
                    int cotanInputOption = scanner.nextInt();
                    switch (cotanInputOption) {
                        case 1:
                            System.out.print("--Введите число для вычисления котангенса: ");
                            double cotanInput = scanner.nextInt();
                            double tanValue = Math.tan(Math.toRadians(cotanInput));
                            double cotanValue = 1 / tanValue;
                            System.out.println("Котангенс " + cotanInput + " = " + cotanValue);
                            break;
                        case 2:
                            System.out.print("--Введите число для вычисления арккотангенса: ");
                            double arcCotanInput = scanner.nextInt();
                            double arcTanValue = Math.atan(Math.toRadians(arcCotanInput));
                            double arcCotanValue = 1 / arcTanValue;
                            System.out.println("Арккотангенс " + arcCotanInput + " = " + arcCotanValue);
                            break;
                        case 3:
                            System.out.print("--Введите число для вычисления гиперболического котангенса: ");
                            double hyperCotanInput = scanner.nextInt();
                            double hyperTanValue = Math.tanh(Math.toRadians(hyperCotanInput));
                            double hyperCotanValue = 1 / hyperTanValue;
                            System.out
                                    .println("Гиперболический котангенс " + hyperCotanInput + " = " + hyperCotanValue);
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
