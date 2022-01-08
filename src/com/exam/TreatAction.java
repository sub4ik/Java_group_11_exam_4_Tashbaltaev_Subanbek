package com.exam;

public class TreatAction implements ActionStrategy{
    private boolean isAction = false;
    @Override
    public void doAction(Cat cat) {
        if (!isAction){
            System.out.println("Вы полечили кота!");
            isAction = !isAction;
            if (cat.getAge() <= 5){
                cat.changeHealthLevel(7);
                cat.changeSatietyLevel(-3);
                cat.changeMoodLevel(-3);
            } else if (cat.getAge() <= 10){
                cat.changeHealthLevel(5);
                cat.changeSatietyLevel(-5);
                cat.changeMoodLevel(-5);
            } else {
                cat.changeHealthLevel(4);
                cat.changeSatietyLevel(-6);
                cat.changeMoodLevel(-6);
            }
        } else System.out.println("Вы сегодня уже лечили кота!");
    }
}
