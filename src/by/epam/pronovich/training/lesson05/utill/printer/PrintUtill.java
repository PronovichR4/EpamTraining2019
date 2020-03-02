package by.epam.pronovich.training.lesson05.utill.printer;

import by.epam.pronovich.training.lesson05.entity.Depo;
import by.epam.pronovich.training.lesson05.entity.PassangerTrain;
import java.util.List;

public final class PrintUtill {

    private PrintUtill() {

    }

    public static String parsDepoToString(Depo depo) {
        StringBuilder concat = new StringBuilder();
        List<PassangerTrain> trains = depo.getTrains();
        for (PassangerTrain train : trains) {
            concat.append("Поезд номер ").append(train.getNumber()).append(" следующий по направлению ")
                    .append(train.getDeparturePoint().getDescription()).append(" - ").append(train.getDestination()
                    .getDescription()).append(" отправляется в ").append(train.getDeparureTime()).append(" прибытие в ")
                    .append(train.getArrivalTime()).append("\n");
        }
        return concat.toString();
    }
}