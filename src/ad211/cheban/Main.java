package ad211.cheban;

import java.util.Scanner; //використовуємо для зчитування інфорції, введеної користувачем
public class Main {
    static boolean ifEd(String input) {
        return input.endsWith("ed"); // перевіряє, чи закінчується строка вказаним закінченням
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть слово: ");
        String n = scanner.next();
        System.out.println(ifEd(n)); // виводимо результат роботи методу ifEd
    }
}