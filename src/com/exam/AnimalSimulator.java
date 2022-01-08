package com.exam;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AnimalSimulator {
    public void init(){
        Cat cat = new Cat("Peach", 12);
        Cat cat2 = new Cat("Jasper", 9);
        Cat cat3 = new Cat("Popper", 2);

        List<Cat> cats = new ArrayList<>();
        cats.add(cat);
        cats.add(cat2);
        cats.add(cat3);

        cats.sort(Cat::sortByHealth);
        Printer.print(cats);

        while (true) {
            System.out.println("[A] - завести нового питомца");
            System.out.println("[1] - Кормить кота");
            var scanner = new Scanner(System.in);
            var command = scanner.next();
            if (command.equals("A")) {
                System.out.println("Введите имя кота: ");
                var catName = scanner.next();
                System.out.println("Введите возраст кота: ");
                var catAge = scanner.nextInt();
                if (catName.isEmpty() || catAge <= 0 || catAge > 18) {
                    System.out.println("Вы ввели неверные данныеФ");
                } else {
                    cats.add(new Cat(catName, catAge));
                }
            } else if (command.equals("1")) {

            }
            Printer.print(cats);
        }
    }
}
