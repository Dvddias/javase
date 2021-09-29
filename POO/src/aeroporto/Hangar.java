package aeroporto;

import avioes.Aviao;

public class Hangar {
	public static void main(String[] args) {
		Aviao boeing777 = new Aviao();
		boeing777.ano = 2016;
		boeing777.cor = "Branco";
		boeing777.envergadura = 64.8;
		boeing777.trempouso = false;
		System.out.println("Aviao: Boeing 777");
		System.out.println("Ano: " + boeing777.ano);
		System.out.println("Cor: " + boeing777.cor);
		System.out.println("Envergadura: " + boeing777.envergadura);
		boeing777.ligar();
		boeing777.acelerar();
		boeing777.aterrizar();

		System.out.println("__________________________________");

		Aviao bellx2 = new Aviao();
		bellx2.ano = 1952;
		bellx2.cor = "Cinza";
		bellx2.envergadura = 54.2;
		System.out.println("Aviao: Bell X-2");
		System.out.println("Ano: " + bellx2.ano);
		System.out.println("Cor: " + bellx2.cor);
		System.out.println("Envergadura: " + bellx2.envergadura);
		bellx2.ligar();
		bellx2.acelerar();

		if (boeing777.trempouso == true) {
			bellx2.aterrizar();
		} else {

			System.out.println("ARREMETER!");
		}

	}
}
