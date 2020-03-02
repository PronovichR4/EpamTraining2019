package by.epam.pronovich.training.lesson05.service.validator;

import by.epam.pronovich.training.lesson05.entity.enumproject.City;

import java.time.DayOfWeek;

public final class Validator {

    private Validator() {
    }

    public static boolean isCity(String city) {
        boolean result = false;
        City[] cities = City.values();
        for (City value : cities) {
            String string = value.toString();
            if (string.equals(city.toUpperCase())) {
                result = true;
                break;
            }
        }
        return result;
    }

    public static boolean isDay(String day) {
        boolean result=false;
        DayOfWeek[] days = DayOfWeek.values();
        for (DayOfWeek dayOfWeek : days) {
            String string = dayOfWeek.toString();
            if(string.equals(day.toUpperCase())){
                result=true;
                break;
            }
        }
        return result;
    }
}
