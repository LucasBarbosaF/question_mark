package application;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a String");
		String str = sc.next();
		System.out.println(question_mark(str));
		sc.close();
	}

	public static boolean question_mark(String str) {
		char[] valorChar = str.toCharArray();

		for (int c = 0; c < valorChar.length; c++) {

			if (Character.isDigit(valorChar[c])) {

				int valorNumerico = Character.getNumericValue(valorChar[c]);

				int procuraValor = 10 - valorNumerico;

				int questionMarkCount = 0;

				for (int sc = c + 1; sc < valorChar.length; sc++) {

					if (Character.isDigit(valorChar[sc])) {

						if (procuraValor == Character.getNumericValue(valorChar[sc])) {

							if (questionMarkCount != 3) {
								return false;
							}

						}

					} else if (valorChar[sc] == '?') {

						questionMarkCount++;

					}

				}

			}

		}

		return true;

	}

}
