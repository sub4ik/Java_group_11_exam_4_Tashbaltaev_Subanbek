package com.exam;

public class TreatAction implements ActionStrategy{
    @Override
    public void doAction(Cat cat) {
        if (!cat.isAction()){
            System.out.println("Вы полечили кота!");
            cat.setActionMessage("Вы сегодня уже поиграли с котом - " + cat.getName() + ", с возрастом - " + cat.getAge());
            cat.setAction(true);
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
        } else System.out.println(cat.getActionMessage());
    }
}
