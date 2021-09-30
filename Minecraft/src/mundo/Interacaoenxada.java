package mundo;

public class Interacaoenxada extends Enxada {

	public static void main(String[] args) {
		System.out.println("----------------");
		Enxada enxada = new Enxada();
		enxada.resistencia = 3;
		enxada.textura = "madeira";
		System.out.println("Resistencia: " + enxada.resistencia);
		System.out.println("Textura: " + enxada.textura);
		enxada.conquista = true;
		if (enxada.conquista == true) {
			enxada.arar();
			System.out.println("Voce desbloqueou uma conquista:hora de plantar!");
		} else {
			System.out.println("Voce nao desbloqueou nada.");

		}

	}

}
