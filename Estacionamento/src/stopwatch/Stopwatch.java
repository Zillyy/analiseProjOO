package stopwatch;

/**
 *
 * @author Zilly
 */
public class Stopwatch {
    private long initTime;
    private long stopTime;

    public Stopwatch(){
        initTime = 0;
        stopTime = 0;
    }
    
    public void start(){
        initTime = System.nanoTime();
    }
    
    public float stop(){
        stopTime = System.nanoTime();
        return (float) (stopTime - initTime) / 1000000000;
    }
}
