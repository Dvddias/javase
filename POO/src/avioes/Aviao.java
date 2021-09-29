package avioes;

import carros.Carro;

public class Aviao extends Carro {
	public double envergadura;
	public boolean trempouso;
/**
 * Aterrizar
 */
	public void aterrizar() {
		System.out.println("Aviao pousou___-__-______");
	}
/**
 * Acelerar
 */
	public void acelerar() {
		System.out.println("Aviao decolou zummmmmm...");
	}
}
