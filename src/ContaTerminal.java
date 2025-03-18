import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int numero;
		String agencia;
		String nomeCliente;
		float saldo = 2000F;
		
		System.out.print("Seja bem vindo, qual o seu nome? ");
		nomeCliente = sc.next();
		
		System.out.print("Por favor, digite o número da Agência: ");
		agencia = sc.next();
		
		System.out.print("Digite o número da conta: ");
		numero = sc.nextInt();
		
		System.out.print("Quanto gostaria de depositar? ");
		saldo = sc.nextFloat();
			
		
		System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", o número de sua conta " + numero + " ,seu saldo é " + saldo + " e já está disponível para saque.");
	}
}
