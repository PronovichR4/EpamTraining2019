package by.epam.pronovich.training.lesson05.sort;

import by.epam.pronovich.training.lesson05.entity.PassangerTrain;

import java.util.Comparator;

public class TimeTrainComparator implements Comparator<PassangerTrain> {

    @Override
    public int compare(PassangerTrain o1, PassangerTrain o2) {
        int compareResult = o1.getDayOfWeek().compareTo(o2.getDayOfWeek());
        return compareResult == 0 ? o1.getTime().compareTo(o2.getTime()) : compareResult;
    }
}
