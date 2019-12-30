package by.epam.pronovich.training.lesson05.main;

import by.epam.pronovich.training.lesson05.controller.Controller;
import by.epam.pronovich.training.lesson05.entity.Depo;
import by.epam.pronovich.training.lesson05.entity.PassangerTrain;
import by.epam.pronovich.training.lesson05.entity.PassangerWagon;
import by.epam.pronovich.training.lesson05.logic.DepoLogic;
import by.epam.pronovich.training.lesson05.logic.PassangerTrainLogic;
import by.epam.pronovich.training.lesson05.utill.PrintUtill;

import static by.epam.pronovich.training.lesson05.entity.enumproject.ComfortType.BUSINESS;
import static by.epam.pronovich.training.lesson05.entity.enumproject.ComfortType.COUPE;
import static by.epam.pronovich.training.lesson05.entity.enumproject.ComfortType.ECONOM;

public class Main {

    public static void main(String[] args) {
        DepoLogic depoLogic = DepoLogic.getINSTANCE();
        PassangerTrainLogic trainLogic = PassangerTrainLogic.getINSTANCE();

        Controller controller = new Controller();
        Depo depo = controller.getDepo();
        PrintUtill.printTimetable(depo);
        PrintUtill.printAllPassInTrain("651б", depo);
        PassangerTrain train651 = depoLogic.findTrainByNumber("651б", depo);
        train651.addWagon(new PassangerWagon(ECONOM));
        train651.addWagon(new PassangerWagon(BUSINESS));
        train651.addWagon(new PassangerWagon(COUPE));
        trainLogic.addPassanger(train651, 1, 15);
        trainLogic.addPassanger(train651, 2, 10);
        trainLogic.addPassanger(train651, 3, 9);
        trainLogic.addPassanger(train651, 2, 11);
        PrintUtill.printAllPassInTrain("651б", depo);
        PrintUtill.printPassInWagon(2, train651);
        PrintUtill.printMaxCapacityTrain(train651);


    }
}
