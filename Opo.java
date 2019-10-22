package factorymethod;

public class Opo extends AterioivaOtus {
	
	public Juoma createJuoma(){
        return new Mehu();
    }
	
}
