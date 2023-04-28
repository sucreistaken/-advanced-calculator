import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Fırst Input");
        int firstinput = getIntScanner(scanner);
        System.out.println("Second Input");
        int secondinput = getIntScanner(scanner);
        ArithmeticOperation arithmeticOperation = new ArithmeticOperation(firstinput, secondinput);

        System.out.println("What action do you want to have \n 1: Addition➕ \n 2: Substraction➖ \n 3: Multiply✖️ \n 4: Divison➗ \n 5: For Quit 🏃‍♂️💨      ");

        boolean quit = false;


        while (!quit) {

            int whataction = scanner.nextInt();
            switch (whataction) {
                case 1:
                    System.out.println(arithmeticOperation.add());
                    break;
                case 2:
                    System.out.println(arithmeticOperation.substract());
                    break;
                case 3:
                    System.out.println(arithmeticOperation.multiply());
                    break;
                case 4:
                    System.out.println(arithmeticOperation.divide());
                    break;
                case 5:
                    quit = true;
                    break;
                default:
                    System.out.println("Invalid Choose");

            }
        }
    }

    private static int getIntScanner(Scanner scanner) {
        int input = 0;
        while (true) {
            try {
                input = Integer.parseInt(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input please enter Integer value");
            }
        }
        return input;
    }
}