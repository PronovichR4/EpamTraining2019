package by.epam.pronovich.training.lesson05.utill.sort;

import by.epam.pronovich.training.lesson05.entity.PassangerTrain;

import java.util.Comparator;

public class MaxSpeedComparator implements Comparator<PassangerTrain> {

    @Override
    public int compare(PassangerTrain o1, PassangerTrain o2) {
        return Integer.compare(o1.getLocomotive().getMaxSpeed(), o2.getLocomotive().getMaxSpeed());
    }
}
