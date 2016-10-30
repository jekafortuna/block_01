package ua.kpi;

/**
 * Created on 30. October. 16.
 *
 * @author Evgeniy
 */
public class View {

    /**
     * Text's constants
     */
    public static final String WRONG_INPUT_NUMBER = "Wrong input!";
    public static final String MESSAGE_FOR_REQUEST = "Please, enter a positive number between ";
    public static final String BIGGER_VALUE = "Your input value is bigger than selected! ";
    public static final String LOWER_VALUE = "Your input value is lower than selected! ";
    public static final String WIN_MESSAGE = "WIN! This number was selected! ";
    public static final String AND = " and ";

    public void printMessage(String message){
        System.out.println(message);
    }

    public void printRequestMessage(int lowerBorder, int upperBorder){
        System.out.println(MESSAGE_FOR_REQUEST + lowerBorder + AND + upperBorder);
    }
}
