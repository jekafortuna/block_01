package ua.kpi;

/**
 * Created on 30. October. 16.
 *
 * @author Evgeniy
 */
public class Model {

    /**
     * min Barrier of secret number
     */
    private int minBarrier;

    /**
     * max Barrier of secret number
     */
    private int maxBarrier;

    /**
     * secret chosen number
     */
    private int secretValue;

    /**
     * constructor
     */
    public Model() {
        minBarrier = 0;
        maxBarrier = 100;
        secretValue = rand(0, 100);
    }

    /**
     * function of finding random secretValue
     * @return secretValue
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
    public int getSecretValue() {
        return secretValue;
    }

    public int getMinBarrier() {
        return minBarrier;
    }

    public void setMinBarrier(int minBarrier) {
        this.minBarrier = minBarrier;
    }

    public int getMaxBarrier() {
        return maxBarrier;
    }

    public void setMaxBarrier(int maxBarrier) {
        this.maxBarrier = maxBarrier;
    }
}