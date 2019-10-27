package abstractFactory;

public class BossFactory implements AbstractFactory {
	
	@Override
	public Farmarit createFarmarit() {
		return new BossFarmarit();
	}
	
	@Override
	public Tpaita createTpaita() {
		return new BossTpaita();
	}
	
	@Override
	public Lippis createLippis() {
		return new BossLippis();
	}
	
	@Override
	public Kengat createKengat() {
		return new BossKengat();
	}
}
