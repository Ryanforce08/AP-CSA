import java.awt.Color;

public class InflateableBalloon extends Balloon {
    public void inflate(int percentage){
        setRadius((int)Math.round(getRadius() * (1 + 0.01 * percentage)));
    }
}
