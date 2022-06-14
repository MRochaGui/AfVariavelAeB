package application;

import java.util.Scanner;

public class AfVetoresAeB {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		int A[] = { 4, 6, 7, 1, 0 }; // informações dentro de cada vetor

		int B[] = { 7, 1, 3, 1, 2 }; // informações dentro de cada vetor

		int SomaA = A[0] + A[1] + A[2] + A[3] + A[4]; // soma todos os valores dentro do vetor A
		int SomaB = B[0] + B[1] + B[2] + B[3] + B[4]; // soma todos os valores dentro do vetor B
		int C = SomaA * SomaB; // pega o total da soma do vetor A e multiplica pelo total da soma do vetor B

		System.out.println("A multiplicação das somas dos vetores A e B é de: " + C); // displaya na tela o valor final

	}
}
