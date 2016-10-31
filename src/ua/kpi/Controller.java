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

    // The Work method
    public void processUser(){
        Scanner scanner = new Scanner(System.in);
        int userNumber = -1;

        System.out.println(model.getSecretValue());

        while (userNumber != model.getSecretValue()){
            userNumber = inputIntValueWithScanner(scanner);

            if (userNumber < model.getSecretValue()){
                view.printMessage(view.LOWER_VALUE);
                model.setMinBarrier(userNumber + 1);
            }
            else if (userNumber > model.getSecretValue()){
                view.printMessage(view.BIGGER_VALUE);
                model.setMaxBarrier(userNumber - 1);
            }
        }
        view.printMessage(view.WIN_MESSAGE);
    }

    public int inputIntValueWithScanner(Scanner scanner){
        int number;
        view.printRequestMessage(model.getMinBarrier(), model.getMaxBarrier());

        while (!scanner.hasNextInt()){
            view.printMessage(view.WRONG_INPUT_NUMBER);
            view.printRequestMessage(model.getMinBarrier(), model.getMaxBarrier());
            scanner.next();
        }

        number = scanner.nextInt();

        if ((number < model.getMinBarrier()) || (number > model.getMaxBarrier())){
            view.printMessage(view.WRONG_INPUT_NUMBER);
            return inputIntValueWithScanner(scanner);
        }

        return number;
    }
}