package by.epam.pronovich.training.lesson05.view;

import by.epam.pronovich.training.lesson05.controller.Controller;

import java.util.Scanner;

public class View {

    private final String EXIT = "EXIT";
    private Controller controller = new Controller();

    public View() {
    }

    public void launch() {
        System.out.println(welcomeMessage());
        Scanner scanner = new Scanner(System.in);
        String request = null;
        while (true) {
            if (scanner.hasNextLine()) {
                request = scanner.nextLine();
            }
            if (EXIT.equals(request.toUpperCase())) {
                break;
            }
            String response = controller.doAction(request);
            System.out.println(response);
        }
    }

    private String welcomeMessage() {
        return "Вас приветствует сервис расписания движения поездов. Для отображения расписания введите соответствующую " +
                "команду: \n" +
                "- \"show_timetable\" \"город отправления\" \"день недели\" или \n" +
                "- \"show_route_timetable\" \"город отправления\" \"город прибытия\" \"день недели\"\n" +
                "для выходы из программы введите \"EXIT\".";
    }
}