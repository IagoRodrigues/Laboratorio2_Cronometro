package view;

import java.time.Duration;
import java.time.Instant;
import java.util.Scanner;

public class Cronometro {
	
	private static Scanner input;

	public static void main(String[] args) {
		Instant inicio, fim;
		Duration duracao;
		int minutos;
		
		input = new Scanner(System.in);
		
		System.out.println("Quantidade de minutos: ");
		minutos = input.nextInt();
		inicio = Instant.now();
		
		System.out.println("Inicio: " + inicio.toString());
		
		do {
			try {
				Thread.sleep(100000);
			} catch (InterruptedException ex) {
				ex.printStackTrace();
			}
			
			fim = Instant.now();
			duracao = Duration.between(inicio, fim);
			
			System.out.println("Passaram: " + duracao.toMinutes() + " minutos");
			
			System.out.println("Voc� tem: " + (minutos-duracao.toMinutes()) + " minutos para terminar");
		}while (duracao.toMinutes() < minutos);
		
		System.out.println("Acabou o tempo!!!!");
	}
}
