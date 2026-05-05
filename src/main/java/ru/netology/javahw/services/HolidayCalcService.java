package ru.netology.javahw.services;

public class HolidayCalcService {
    public int calculate(int income, int expenses, int threshold) {
        int count = 0; // счётчик месяцев отдыха
        int money = 0; // количество денег на счету
        for (int month = 1; month <= 12; month++) {
            int moneyBeforeExpenses = money;
            if (money >= threshold) { // можем ли отдыхать?
                count++; // увеличиваем счётчик месяцев отдыха
                money = money - expenses;
                money = money / 3;
            } else {
                money = money + income - expenses;

                //System.out.println("Месяц " + month + ". Денег " + money + ". Придётся работать. Заработал +" + income + ", потратил -" + expenses);
            }
        }
        return count;
    }
}
