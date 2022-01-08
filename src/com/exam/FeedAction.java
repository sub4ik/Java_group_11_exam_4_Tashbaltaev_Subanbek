package com.exam;

public class FeedAction implements ActionStrategy{
    @Override
    public void doAction(Cat cat) {
        if (!cat.isAction()){
            System.out.println("Вы покормили кота!");
            cat.setActionMessage("Вы сегодня уже кормили кота - " + cat.getName() + ", с возрастом - " + cat.getAge());
            cat.setAction(true);
            if ((int) (Math.random() * 100) > 95){ //4% шанс отравиться
                System.out.println("Кот отравился! Его жизнь на твоей совести (-_-)");
                cat.setActionMessage("Ты уже отравил своего кота - " + cat.getName() + ", с возрастом - " + cat.getAge());
                cat.changeMoodLevel(-25);
                cat.changeHealthLevel(-29);
            } else if (cat.getAge() <= 5){
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
            System.out.println(cat.getActionMessage());
        }

    }
}
