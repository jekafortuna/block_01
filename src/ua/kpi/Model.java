package ua.kpi;

/**
 * Created on 30. October. 16.
 *
 * @author Evgeniy
 */
public class Model {

    /**
     * parameters
     */
    private int lowerBorder;
    private int upperBorder;
    private int number;

    /**
     * constructor
     */
    public Model() {
        lowerBorder = 0;
        upperBorder = 100;
        number = rand(0, 100);
    }

    /**
     * function of finding random number
     * @return number
     */
    private int rand(){
        return (int)(Math.random() * Integer.MAX_VALUE);
    }

    private int rand(int min, int max){
        return min + (int)(Math.random() * (max - min));
    }

    /**
     * getters and setters
     */
    public int getNumber() {
        return number;
    }

    public int getLowerBorder() {
        return lowerBorder;
    }

    public void setLowerBorder(int lowerBorder) {
        this.lowerBorder = lowerBorder;
    }

    public int getUpperBorder() {
        return upperBorder;
    }

    public void setUpperBorder(int upperBorder) {
        this.upperBorder = upperBorder;
    }
}