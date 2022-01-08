package com.exam;

import java.util.ArrayList;

public class Cat {
    private String name;
    private int age;
    private int satietyLevel;
    private int moodLevel;
    private int healthLevel;
    private int average;
    private transient boolean isAction = false;
    private transient String ActionMessage;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
        satietyLevel = 20 + (int) (Math.random() * 61);
        moodLevel = 20 + (int) (Math.random() * 61);
        healthLevel = 20 + (int) (Math.random() * 61);
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", satietyLevel=" + satietyLevel +
                ", moodLevel=" + moodLevel +
                ", healthLevel=" + healthLevel +
                '}';
    }
    public static int sortByName(Cat cat, Cat cat1) {
        return cat.name.compareTo(cat1.name);
    }

    public static int sortByAge(Cat cat, Cat cat1) {
        return Integer.compare(cat.age, cat1.age);
    }

    public static int sortByHealth(Cat cat, Cat cat1) {
        return Integer.compare(cat.healthLevel, cat1.healthLevel);
    }

    public static int sortByMood(Cat cat, Cat cat1) {
        return Integer.compare(cat.moodLevel, cat1.moodLevel);
    }

    public static int sortBySatiety(Cat cat, Cat cat1) {
        return Integer.compare(cat.satietyLevel, cat1.satietyLevel);
    }

    public static int sortByAverage(Cat cat, Cat cat1) {
        return Integer.compare(cat.getAverage(), cat1.getAverage());
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
    public int getAverage() {
        return (healthLevel + moodLevel + satietyLevel) / 3;
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
        this.satietyLevel += satietyLevel;
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
