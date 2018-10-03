package view;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Aluno;

public class vwAluno {
	

	public static void cadastrarAluno() {
		Scanner sc = new Scanner(System.in);
		List<Aluno> list = new ArrayList<>();
		
		System.out.println("informe o nome: ");
		String nome = sc.nextLine();
		System.out.println("informe o Email: ");
		String email = sc.nextLine();
		
		list.add(new Aluno(nome, email));
		
				
		sc.close();
	}
	
	public static void buscarAluno() {
		Scanner sc = new Scanner(System.in);
		System.out.println("informe o nome a ser localizado: ");
		String nome = sc.nextLine();
		
		sc.close();
	}

}
