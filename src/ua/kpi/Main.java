package ua.kpi;

/**
 * Created on 30. October. 16.
 *
 * @author Evgeniy
 */
public class Main {
    public static void main(String[] args) {

        /**
         * Initialization
         */
        Model model = new Model();
        View view = new View();
        Controller controller = new Controller(model, view);

        /**
         * Run
         */
        controller.processUser();
    }
}
