package com.exam;

public class FeedAction implements ActionStrategy{
    private boolean isAction = false;
    @Override
    public void doAction(Cat cat) {
        if (!isAction){
            System.out.println("Вы покормили кота!");
            isAction = !isAction;
            if (cat.getAge() <= 5){
                cat.changeSatietyLevel(7);
                cat.changeMoodLevel(7);
            } else if (cat.getAge() <= 10){
                cat.changeSatietyLevel(5);
                cat.changeMoodLevel(5);
            } else {
                cat.changeSatietyLevel(4);
                cat.changeMoodLevel(4);
            }
        } else {
            System.out.println("Вы сегодня уже кормили кота!");
        }

    }
}
