package contas;

public class PessoaFisica {

	public static void main(String[] args) {
		Conta cc1 = new Conta();
		cc1.setCliente("Leandro Ramos");
		cc1.setSaldo(10000);
		System.out.println("CLiente: " + cc1.getCliente());
		cc1.exibirSaldo();
		cc1.sacar(1000);
		cc1.exibirSaldo();
		cc1.depositar(100);
		cc1.exibirSaldo();
		System.out.println("-=-=-=-=-=-=-=-=-=-=-=-");

		Conta cc2 = new Conta();
		cc2.setCliente("Lionel Messi");
		cc2.setSaldo(100);
		System.out.println("Cliente: " + cc2.getCliente());
		cc2.exibirSaldo();
		cc2.sacar(50);
		cc2.exibirSaldo();
		cc2.depositar(100);
		cc2.exibirSaldo();
		System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-");
		System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-");
		System.out.println("Transferencia.");
		System.out.println("");
		cc1.transferir(cc2, 2000);
		System.out.println("Cliente: " + cc1.getCliente());
		cc1.exibirSaldo();
		System.out.println("Favorecido: " + cc2.getCliente());
		cc2.exibirSaldo();
		System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-");

	}

}
