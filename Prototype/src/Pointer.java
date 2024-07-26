
public class Pointer implements Cloneable {
int position;
    
    Pointer(int position) {
        this.position = position;
    }
    
    void move(int timeunit) {
        position += timeunit;
        position %= 60;
    }
    
    @Override
    public Pointer clone() throws CloneNotSupportedException {
        return (Pointer) super.clone();
    }
}
