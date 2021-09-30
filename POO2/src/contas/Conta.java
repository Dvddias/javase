/**
 * POO2 - Encapsulamento
 * @author Daniel dias
 */

package contas;

public class Conta {

	// encapsulamento
	private double saldo;
	private String cliente;

	/**
	 * obter o saldo
	 * 
	 * @return
	 */
	public double getSaldo() {
		return saldo;
	}

	/**
	 * atribuir um valor a varialvel saldo
	 * 
	 * @param saldo
	 */
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	/**
	 * Obter o nome do cliente
	 * 
	 * @return
	 */
	public String getCliente() {
		return cliente;
	}

	/**
	 * Atribuir um valor a varialvel cliente
	 * 
	 * @param cliente
	 */
	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public Conta() {
		System.out.println("Agencia 0261");

	}

	/**
	 * exibir o saldo da conta
	 */
	protected void exibirSaldo() {
		System.out.println("Saldo: $" + saldo);
	}

	/**
	 * Debitar um valor da conta
	 * 
	 * @param valor
	 */
	protected void sacar(double valor) {
		saldo -= valor;
		System.out.println("Debito: $ " + valor);
	}
	/**
	 * Depositar um valor
	 * @param valor
	 */
	protected void depositar(double valor) {
		saldo += valor;
		System.out.println("Deposito de $" + valor);
	}
	/**
	 * Transferir
	 * @param destino
	 * @param valor
	 */
	protected void transferir(Conta destino, double valor) {
		this.sacar(valor);
		destino.depositar(valor);
		System.out.println("Transferencia: $" + valor);
	}
}