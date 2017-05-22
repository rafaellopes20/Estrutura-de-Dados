package estd;

public class Q3 {

	public boolean somaNum(int nums[]) {
		int soma = 0;
		boolean resultado = false;

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 2) {
				soma = soma + nums[i];
			}
		}
		
		if (soma == 8) {
			resultado = true;
		}else{
			resultado = false;
		}
		
		return resultado;
	}
}
