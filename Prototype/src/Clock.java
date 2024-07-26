
public class Clock implements Cloneable {
	Pointer hourPointer;
    Pointer minutePointer;
    Pointer secondPointer;
    
    public Clock(Pointer hourPointer, Pointer minutePointer, Pointer secondPointer) {
        this.hourPointer = hourPointer;
        this.minutePointer = minutePointer;
        this.secondPointer = secondPointer;
    }
    
    public void tick() {
        secondPointer.move(1);
        if (secondPointer.position == 0) {
            minutePointer.move(1);
            if (minutePointer.position == 0) {
                hourPointer.move(1);
            }
        }
    }
    
    @Override
    public Clock clone() throws CloneNotSupportedException {
        Clock clock = (Clock) super.clone();
        clock.hourPointer = hourPointer.clone();
        clock.minutePointer = minutePointer.clone();
        clock.secondPointer = secondPointer.clone();
        return clock;
    }
    
    @Override
    public String toString() {
        return hourPointer.position + " : " + minutePointer.position + " : " + secondPointer.position;
    }
}
