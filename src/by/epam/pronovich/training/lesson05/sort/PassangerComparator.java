package by.epam.pronovich.training.lesson05.sort;

import by.epam.pronovich.training.lesson05.entity.PassangerTrain;
import by.epam.pronovich.training.lesson05.logic.PassangerTrainLogic;

import java.util.Comparator;

public class PassangerComparator implements Comparator<PassangerTrain> {

    PassangerTrainLogic trainLogic = PassangerTrainLogic.getINSTANCE();

    @Override
    public int compare(PassangerTrain o1, PassangerTrain o2) {
        return Integer.compare(trainLogic.calcAllPassangers(o1), trainLogic.calcAllPassangers(o2));
    }
}
