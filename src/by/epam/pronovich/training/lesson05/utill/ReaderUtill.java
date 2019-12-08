package by.epam.pronovich.training.lesson05.utill;

import by.epam.pronovich.training.lesson05.entity.Locomotive;
import by.epam.pronovich.training.lesson05.entity.PassangerTrain;
import by.epam.pronovich.training.lesson05.type.EngineType;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public final class ReaderUtill {

    private ReaderUtill() {
    }

    public static List<PassangerTrain> getTrainsFromFile(Path path) {
        List<PassangerTrain> passangerTrains = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(path.toFile()))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] train = line.replaceAll(" ","").split(",");
                int i = 0;
                passangerTrains.add(new PassangerTrain(train[i], train[++i], train[++i],
                        new Locomotive(Integer.parseInt(train[++i]), EngineType.valueOf(train[++i]))));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return passangerTrains;
    }
}
