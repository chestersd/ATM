package main.java;

import java.util.List;
import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        while (true) {
            List<Account> accounts = FileReader.readCard();
            System.out.println("Введите номер вашей карты в формате ХХХХ-ХХХХ-ХХХХ-ХХХХ");
            Scanner scanner = new Scanner(System.in);
            String enteredCardNumber = scanner.nextLine();
            System.out.println("Введите Ваш пин-код");
            String enteredPinCode = scanner.nextLine();


//            for (String cNumber : accounts.toString()) {
//                if (lang.startsWith("Java")) {
//                    System.out.println(enteredCardNumber);
//                }
//
                System.out.println(enteredCardNumber);
                System.out.println(enteredPinCode);

            }

        }





}
