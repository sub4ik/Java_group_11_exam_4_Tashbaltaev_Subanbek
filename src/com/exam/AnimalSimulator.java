package com.exam;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AnimalSimulator {


    public void init() throws IOException {
        JsonSerializer jsonSerializer = new JsonSerializer("cats.json");

        /*Cat cat = new Cat("Peach", 12);
        Cat cat2 = new Cat("Jasper", 9);
        Cat cat3 = new Cat("Popper", 2);

        List<Cat> cats = new ArrayList<>();
        cats.add(cat);
        cats.add(cat2);
        cats.add(cat3);*/
        ArrayList<Cat> cats = jsonSerializer.getCats();

        cats.sort(Cat::sortByHealth);
        Printer.print(cats);
        ActionStrategy strategy;

        while (true) {
            System.out.println("[A] - завести нового питомца");
            System.out.println("[q] - end");
            System.out.println("[1] - Кормить кота");
            System.out.println("[2] - Играть с котом");
            System.out.println("[3] - Лечить кота");
            System.out.println("[4] - Следуюший день");
            var scanner = new Scanner(System.in);
            var command = scanner.next();
            if (command.equals("A")) {
                System.out.println("Введите имя кота: ");
                var catName = scanner.next();
                System.out.println("Введите возраст кота: ");
                var catAge = scanner.nextInt();
                if (catName.isEmpty() || catAge <= 1 || catAge > 18) {
                    System.out.println("Вы ввели неверные данныеФ");
                } else {
                    cats.add(new Cat(catName, catAge));
                }
            } else if (command.equals("1")) {
                System.out.println("Выберите кота: ");
                var catIndx = scanner.nextInt() - 1;
                strategy = new FeedAction();
                strategy.doAction(cats.get(catIndx));
            } else if (command.equals("2")) {
                System.out.println("Выберите кота: ");
                var catIndx = scanner.nextInt() - 1;
                strategy = new PlayAction();
                strategy.doAction(cats.get(catIndx));
            } else if (command.equals("3")) {
                System.out.println("Выберите кота: ");
                var catIndx = scanner.nextInt() - 1;
                strategy = new TreatAction();
                strategy.doAction(cats.get(catIndx));
            } else if (command.equals("4")) {
                strategy = new NextDayAction();
                for (Cat c: cats) {
                    strategy.doAction(c);
                }
            } else if (command.equals("q")) {
                break;
            }
            Printer.print(cats);
            jsonSerializer.writeCats(cats);
        }
    }
}
