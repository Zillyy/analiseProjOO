package mediator;

/**
 *
 * @author Zilly
 */
public abstract class Colleague {
    
    protected Mediator mediator;
    
    public Colleague(Mediator m) {
        mediator = m;
    }

}
