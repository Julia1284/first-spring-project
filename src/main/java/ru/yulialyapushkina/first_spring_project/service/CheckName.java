package ru.yulialyapushkina.first_spring_project.service;

public class CheckName {
    public static String checkWeekDay(String name) {
        switch (name) {
            case "Monday":
                name = "Понедельник";
                break;
            case "Tuesday":
                name = "Вторник";
                break;
            case "Wednesday":
                name = "Среда";
                break;
            case "Thursday":
                name = "Четверг";
                break;
            case "Friday":
                name = "Пятница";
                break;
            case "Saturday":
                name = "Суббота";
                break;
            case "Sunday":
                name = "Воскресенье";
                break;
        }
        return  name;
    }

}
