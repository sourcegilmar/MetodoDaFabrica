package aplicacao;

import java.util.Scanner;

import entidades.Moto;
import fabrica.MotoFactory;

public class DemoFabrica {
	static Scanner sc;
	public static void main(String[] args) {
		try {
			while (true) {
				sc = new Scanner(System.in);
				String varNome = "";
				System.out.println("Informe o nome da moto:\n");
				varNome = sc.next();
				Moto moto = MotoFactory.getMoto(varNome);
				if (moto != null) {
					System.out.println("Nome da moto: " + moto.getNome());
					System.out.println("Cilindrada: " + moto.getCilindrada());
					System.out.println("Cor: " + moto.getCor()+"\n");
				} else {
					System.out.println("* * Modelo não disponível na fábrica * *");	
					break;
				}				
			}
		} catch (Exception e) {
			System.out.println("Um erro grave ocorreu: " + e);
		}
	}
}
