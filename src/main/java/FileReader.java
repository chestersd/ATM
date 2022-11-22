package main.java;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileReader {
    public static List<Account> readCard(){
        File file = new File("src/main/java/listOfCards.txt");

        try {
            Scanner scanner = new Scanner(file);
            List<Account> accounts = new ArrayList<>();

            while (scanner.hasNextLine()){
                String line = scanner.nextLine();
                String[] card = line.split(" ");

                Account currentAccount = new Account(card[0], Double.parseDouble(card[1]), card[2], Boolean.parseBoolean(card[3]));
                accounts.add(currentAccount);

            }
            scanner.close();
            System.out.println(accounts);
            return accounts;


        } catch (FileNotFoundException e) {
            System.out.println("ОШИБКА! Не найден список карт");
        }
        return null;
    }
}
