package com.exam;

public class Cat {
    private String name;
    private int age;
    private int satietyLevel;
    private int moodLevel;
    private int healthLevel;
    private boolean isAction = false;
    private String ActionMessage;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
        satietyLevel = 20 + (int) (Math.random() * 61);
        moodLevel = 20 + (int) (Math.random() * 61);
        healthLevel = 20 + (int) (Math.random() * 61);
    }

    public String getName() {
        return name;
    }

    public boolean isAction() {
        return isAction;
    }

    public void setAction(boolean action) {
        isAction = action;
    }

    public String getActionMessage() {
        return ActionMessage;
    }

    public void setActionMessage(String getActionMessage) {
        this.ActionMessage = getActionMessage;
    }

    public int getAge() {
        return age;


    }

    public int getHealthLevel() {
        return healthLevel;
    }

    public int getSatietyLevel() {
        return satietyLevel;
    }

    public int getMoodLevel() {
        return moodLevel;
    }

    public void changeMoodLevel(int moodLevel) {
        this.moodLevel += moodLevel;
        if (this.moodLevel < 0) {
            this.moodLevel = 0;
        }
        if (this.moodLevel > 100){
            this.moodLevel = 100;
        }
    }

    public void changeSatietyLevel(int satietyLevel) {
        this.satietyLevel = satietyLevel;
        if (this.satietyLevel < 0) {
            this.satietyLevel = 0;
        }
        if (this.satietyLevel > 100){
            this.satietyLevel = 100;
        }
    }

    public void changeHealthLevel(int healthLevel) {
        this.healthLevel += healthLevel;
        if (this.healthLevel < 0) {
            this.healthLevel = 0;
        }
        if (this.healthLevel > 100){
            this.healthLevel = 100;
        }
    }
}
