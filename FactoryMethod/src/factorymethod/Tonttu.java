package factorymethod;

public class Tonttu extends AterioivaOtus {

    public Juoma createJuoma(){
        return new Taikajuoma();
    };

}
