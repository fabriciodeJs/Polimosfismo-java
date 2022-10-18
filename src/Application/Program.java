package Application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Empregado;
import entities.EmpregadoTerceirizado;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		List<Empregado> list = new ArrayList<>();

		System.out.printf("Qual o numero de trabalhadores: ");
		int loop = sc.nextInt();

		for (int i = 1; i <= loop; i++) {

			System.out.println("#" + i + " Trabalhador:");
			System.out.printf("Você é terceirizado ? (N/S): ");
			char terceirizado = sc.next().charAt(0);

			System.out.printf("Nome do Trabalhador: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.printf("Horas trabalhadas: ");
			int horas = sc.nextInt();
			System.out.printf("Valor por Hora: ");
			Double valorPorHora = sc.nextDouble();

			if (terceirizado == 's') {
				System.out.printf("Valor adicional: ");
				Double adicional = sc.nextDouble();
				
				list.add(new EmpregadoTerceirizado(nome, horas, valorPorHora, adicional));
			} else {
				list.add(new Empregado(nome, horas, valorPorHora));
			}
			
			System.out.println();
			System.out.println("PAGAMENTOS:");
			for(Empregado emp : list) {
				System.out.println(emp.getNome() + " - $ " + String.format("%.2f", emp.pagamento()));
			}
			

		}

		sc.close();
	}

}
