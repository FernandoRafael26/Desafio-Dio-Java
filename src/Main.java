
public class Main {

	public static void main(String[] args) {
		
		Cliente fernando = new Cliente();
		fernando.setNome("Fernando");
		
		Conta cc = new ContaCorrente(fernando);
		cc.depositar(100);
		
		Conta cp = new ContaPoupanca(fernando);
		
		cc.transferir(50, cp);
		
		cc.imprimirExtrato();
		cp.imprimirExtrato();
		

	}

}
