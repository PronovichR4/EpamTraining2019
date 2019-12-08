package by.epam.pronovich.training.lesson05.sort;

import by.epam.pronovich.training.lesson05.entity.PassangerTrain;

import java.util.Comparator;

public class DestinationComparator implements Comparator<PassangerTrain> {

    @Override
    public int compare(PassangerTrain o1, PassangerTrain o2) {
        int compareResult = o1.getDestination().compareTo(o2.getDestination());
        compareResult = compareResult == 0 ? o1.getDepartureTime().compareTo(o2.getDepartureTime()) : compareResult;
        return compareResult;
    }
}
