package seguros;

import contas.Conta;

public class SeguroPessoaFisica extends Conta {

	public static void main(String[] args) {
		SeguroPessoaFisica cc3 = new SeguroPessoaFisica();
		cc3.setCliente("Eduardo Pereira Rodrigues");
		cc3.setSaldo(900000);
		System.out.println("Cliente: " + cc3.getCliente());
		cc3.exibirSaldo();

	}

}
