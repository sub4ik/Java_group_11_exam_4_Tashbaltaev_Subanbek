package com.exam;

public class NextDayAction implements ActionStrategy{
    @Override
    public void doAction(Cat cat) {
        System.out.println("Прошел день!");
        cat.changeHealthLevel(-3 + (int) (Math.random() * 7));
        cat.changeSatietyLevel(-(1 + (int) (Math.random() * 5)));
        cat.changeMoodLevel(-3 + (int) (Math.random() * 7));
        cat.setAction(false);
    }
}
