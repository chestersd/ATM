//package main.java.startmenu;
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.util.ArrayList;
//import java.util.List;
//
//public class Menu {
//    private List entries = new ArrayList();
//    private boolean isExit = false;
//
//    public Menu() {
//        // Добавляем пункт меню Exit
//        entries.add(new MenuEntry("Exit") {
//            @Override
//            public void run() {
//                isExit = true;
//            }
//        });
//    }
//
//    public void run() {
//        // Бесконечный цикл, пока не нажали кнопку выход
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        while (!isExit) {
//            printMenu();
//            try {
//                String line = reader.readLine();
//                int choice = Integer.parseInt(line);
//                // Выбираем нажатый пункт меню и выполняем его код
//                MenuEntry entry = entries.get(choice - 1);
//                entry.run();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }
//    }
//}