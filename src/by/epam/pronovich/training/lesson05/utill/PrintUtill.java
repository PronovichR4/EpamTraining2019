package by.epam.pronovich.training.lesson05.utill;

import by.epam.pronovich.training.lesson05.entity.Depo;
import by.epam.pronovich.training.lesson05.entity.PassangerTrain;
import by.epam.pronovich.training.lesson05.exception.TrainException;
import by.epam.pronovich.training.lesson05.logic.DepoLogic;
import by.epam.pronovich.training.lesson05.logic.PassangerTrainLogic;
import by.epam.pronovich.training.lesson05.sort.TimeTrainComparator;

import java.util.List;

public final class PrintUtill {

    private PrintUtill() {

    }

    public static void printTimetable(Depo depo) {
        List<PassangerTrain> trains = depo.getTrains();
        trains.sort(new TimeTrainComparator());
        for (PassangerTrain train : trains) {
            System.out.println(
                    "Поезд номер " + train.getNumber() +
                            " следующий в " + train.getDestination().getDescription() +
                            " отправляется по " + train.getDayOfWeek() + " в " + train.getTime()
            );
        }

    }

    public static void printAllPassInTrain(String number, Depo depo) {
        try {
            PassangerTrain trainByNumber = DepoLogic.getINSTANCE().findTrainByNumber(number, depo);
            int quantity = PassangerTrainLogic.getINSTANCE().calcAllPassangers(trainByNumber);
            System.out.println("Количество пассажиров в поезде №" + number + " равно " + quantity);
        } catch (TrainException e) {
            System.out.println(e.getMessage());
        }

    }

    public static void printPassInWagon(int number, PassangerTrain train) {
        try {
            int quantity = PassangerTrainLogic.getINSTANCE().calcPassangersInWagon(train, number);
            System.out.println("Количество пассажиров в вагоне №" + number + " поезда №" +
                    train.getNumber() + " равно " + quantity);
        } catch (TrainException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void printMaxCapacityTrain(PassangerTrain train) {
        int quantity = PassangerTrainLogic.getINSTANCE().calMaxQuantityPassangers(train);
        System.out.println("Максимальная вместимасть пассажиров " + " поезда №" +
                train.getNumber() + " равна " + quantity);
    }
}
