package by.epam.pronovich.training.lesson05.sort;

import by.epam.pronovich.training.lesson05.entity.PassangerTrain;
import by.epam.pronovich.training.lesson05.logic.PassangerTrainLogic;

import java.util.Comparator;

public class LuggageComparator implements Comparator<PassangerTrain> {

    PassangerTrainLogic trainLogic = new PassangerTrainLogic();

    @Override
    public int compare(PassangerTrain o1, PassangerTrain o2) {
        return Integer.compare(trainLogic.calculateAllWeightLuggage(o1), trainLogic.calculateAllWeightLuggage(o2));
    }
}