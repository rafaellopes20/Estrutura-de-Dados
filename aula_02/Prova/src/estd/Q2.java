package estd;

public class Q2 {

	public String tirarX(String texto) {

		String resultado = "";

		char[] st = texto.toCharArray();

		for (char c : st) {

			if (c != 'x' && c != 'X') {
				resultado = resultado + c;
			}

		}

		return resultado;

	}

}
