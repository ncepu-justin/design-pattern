package pattern.creational.prototype.abstractprototype;

/**
 * Created by justin
 */
public abstract class A implements Cloneable{
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
