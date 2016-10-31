package ua.kpi;

/**
 * Created on 30. October. 16.
 *
 * @author Evgeniy
 */
public class View {

    // Text's constants
    public static final String WRONG_INPUT_NUMBER = "Wrong input!";
    public static final String MESSAGE_FOR_REQUEST = "Please, enter a positive number between ";
    public static final String BIGGER_VALUE = "Your input value is bigger than selected! ";
    public static final String LOWER_VALUE = "Your input value is lower than selected! ";
    public static final String WIN_MESSAGE = "WIN! This number was selected! ";
    public static final String AND = " and ";

    /**
     * Prints output message to the screen
     * @param message
     */
    public void printMessage(String message){
        System.out.println(message);
    }

    /**
     * Prints output message to the screen with barriers
     * @param minBarrier
     * @param maxBarrier
     */
    public void printRequestMessage(int minBarrier, int maxBarrier){
        System.out.println(MESSAGE_FOR_REQUEST + minBarrier + AND + maxBarrier);
    }
}
