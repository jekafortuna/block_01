package ua.kpi;

import java.util.Scanner;

/**
 * Created on 30. October. 16.
 *
 * @author Evgeniy
 */
public class Controller {

    Model model;
    View view;

    /**
     * constructor of controller
     * @param model
     * @param view
     */
    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void processUser(){
        Scanner scanner = new Scanner(System.in);
        int userNumber = -1;

        while (userNumber != model.getNumber()){
            userNumber = inputIntValueWithScanner(scanner);

            if (userNumber < model.getNumber()){
                view.printMessage(view.LOWER_VALUE);
                model.setLowerBorder(userNumber + 1);
            }
            else if (userNumber > model.getNumber()){
                view.printMessage(view.BIGGER_VALUE);
                model.setUpperBorder(userNumber - 1);
            }
        }
        view.printMessage(view.WIN_MESSAGE);
    }

    public int inputIntValueWithScanner(Scanner scanner){
        int number;
        view.printRequestMessage(model.getLowerBorder(), model.getUpperBorder());

        while (!scanner.hasNextInt()){
            view.printMessage(view.WRONG_INPUT_NUMBER);
            view.printRequestMessage(model.getLowerBorder(), model.getUpperBorder());
            scanner.next();
        }

        number = scanner.nextInt();

        if ((number < model.getLowerBorder()) || (number > model.getUpperBorder())){
            view.printMessage(view.WRONG_INPUT_NUMBER);
            return inputIntValueWithScanner(scanner);
        }

        return number;
    }
}