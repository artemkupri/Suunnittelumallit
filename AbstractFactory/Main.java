package abstractFactory;

public class Main {

	private static Client configureClientAdidas() {

		Client client;
		AbstractFactory factory;
		factory = new AdidasFactory();
		client = new Client(factory);
		return client;
	}

	private static Client configureClientBoss() {

		Client client;
		AbstractFactory factory;
		factory = new BossFactory();
		client = new Client(factory);
		return client;
	}

	public static void main(String[] args) {

		System.out.println("Opiskelijana minulla on:");
		System.out.println();
		Client clientAdidas = configureClientAdidas();
		clientAdidas.kuvaus();
		
		System.out.println();
		
		System.out.println("Isinöörinä minulla on:");
		System.out.println();
		Client clientBoss = configureClientBoss();
		clientBoss.kuvaus();

	}

}
