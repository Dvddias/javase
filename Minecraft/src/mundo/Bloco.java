/**
 * POO - Minecraft
 * @author Daniel dias
 * 
 */
package mundo;

public class Bloco {
	public Bloco() {
		String boasvindas = new String("Bem-vindo ao seu mundo");
		System.out.println("Seja bem vindo!");
	}

	
	public int resistencia;
	public String textura;

	
	public void construir() {
		System.out.println("Construindo .....");
	}

	public void minerar() {
		System.out.println("Minerando pipipi");

	}

	public void craftar() {
		System.out.println("Craftando ....");
	}

}
