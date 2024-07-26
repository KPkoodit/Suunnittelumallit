
public class Main {

	public static void main(String[] args) {
		Pointer hourPointer = new Pointer(0);
        Pointer minutePointer = new Pointer(0);
        Pointer secondPointer = new Pointer(0);

        Clock clock = new Clock(hourPointer, minutePointer, secondPointer);
        System.out.println(clock);

        clock.tick();
        System.out.println(clock);

        try {
            Clock copiedClock = clock.clone();
            clock.minutePointer.move(5);
            clock.tick();
            System.out.println(clock);
            System.out.println(copiedClock);
            copiedClock.tick();
            copiedClock.tick();
            System.out.println(clock);
            System.out.println(copiedClock);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        try {
            Clock shallowCopiedClock = clock.clone();
            clock.secondPointer = new Pointer(59);
            System.out.println(clock);
            clock.tick();
            System.out.println(clock);
            System.out.println(shallowCopiedClock);
            shallowCopiedClock.tick();
            System.out.println(shallowCopiedClock);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
