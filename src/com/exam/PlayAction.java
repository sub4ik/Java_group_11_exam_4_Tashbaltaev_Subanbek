package com.exam;

public class PlayAction implements ActionStrategy{
    @Override
    public void doAction(Cat cat) {
        if (!cat.isAction()){
            System.out.println("Вы поиграли с котом!");
            cat.setActionMessage("Вы сегодня уже поиграли с котом - " + cat.getName() + ", с возрастом - " + cat.getAge());
            cat.setAction(true);
            if (cat.getAge() <= 5){
                cat.changeHealthLevel(7);
                cat.changeSatietyLevel(-3);
                cat.changeMoodLevel(7);
            } else if (cat.getAge() <= 10){
                cat.changeHealthLevel(5);
                cat.changeSatietyLevel(-5);
                cat.changeMoodLevel(5);
            } else {
                cat.changeHealthLevel(4);
                cat.changeSatietyLevel(-6);
                cat.changeMoodLevel(4);
            }
        } else System.out.println(cat.getActionMessage());
    }
}
