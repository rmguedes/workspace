package oo.conta;

public class ProgramPrincipal {

	public static void main(String[] args) {

		
		ContaBancaria conta = new ContaBancaria(1, "Ricardo Guedes");
		
		conta.extrato();
		
		conta.deposito(15000);
		
		conta.extrato();
		
		conta.saque(15001);
		
		conta.extrato();
		
		conta.saque(5000);
		
		conta.extrato();
		
		
		
	}

}
