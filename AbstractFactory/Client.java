package abstractFactory;

public class Client {

	private Farmarit farmarit;
	private Tpaita tpaita;
	private Lippis lippis;
	private Kengat kengat;
	
	public Client(AbstractFactory factory) {
		farmarit = factory.createFarmarit();
		tpaita = factory.createTpaita();
		lippis = factory.createLippis();
		kengat = factory.createKengat();
	}
	
	public void kuvaus() {
		farmarit.kuvaus();
		tpaita.kuvaus();
		lippis.kuvaus();
		kengat.kuvaus();
	}
}
