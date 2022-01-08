package com.exam;

import java.util.List;

public final class Printer {
    private static void printHeader() {
        System.out.format("+----+------------+---------+----------+-------------+----------+-----------------+%n");
        System.out.format("| #  | Имя        | Возраст | Здоровье | Настроение  | Сытоость | Средний уровень |%n");
        System.out.format("+----+------------+---------+----------+-------------+----------+-----------------+%n");
    }

    public static void print(List<Cat> cats) {
        printHeader();

        for (int i = 0; i < cats.size(); i++) {
            String leftAlignFormat = "| %-2d | %-10s | %-7d | %-8d | %-11d | %-8d | %-15d |%n";
            System.out.format(leftAlignFormat, i + 1, cats.get(i).getName(), cats.get(i).getAge(), cats.get(i).getHealthLevel(), cats.get(i).getMoodLevel(), cats.get(i).getSatietyLevel(), cats.get(i).getAverage());
            System.out.format("+----+------------+---------+----------+-------------+----------+-----------------+%n");
        }
        System.out.println();
    }
}