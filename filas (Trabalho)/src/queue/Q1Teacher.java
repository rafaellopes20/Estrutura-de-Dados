package queue;

public class Q1Teacher {
	
	public Queue<Integer> q1 (Integer[] a, Integer[] b) {
		Queue<Integer> result = new ArrayQueue<>();
		
		for (Integer integer : a) {
			result.enqueue(integer);
		}
		
		for (Integer integer : b) {
			result.enqueue(integer);
		}
		
		return result;
	}

}

//1- Dado um array de números inteiros, retorne uma fila contendo todos os elementos do mesmo.

/*3- Altere a fila desenvolvida em sala de aula (interface Queue e classe ArrayQueue)
 acrescentando o método pop(int n). O método deve retornar uma lista contendo n itens
 retirados da fila. Se n for maior que o tamanho da fila, retornar apenas os elementos disponíveis.*/

//2- Dada uma fila de números inteiros, retorne um array de números pares contidos na mesma.

/*4- Altere a fila desenvolvida em sala de aula (interface fila e classe ArrayQueue) acrescentando o método clear().
  O método deve esvaziar a fila, retornando um array com todos os seus elementos. */

/*5- Altere a fila desenvolvida em sala de aula (interface fila e classe ArrayQueue) 
acrescentando o método cloneFila(). O método deve retornar uma cópia da fila atual.*/


/*Dada uma fila de caracteres, retorne uma outra fila contendo apenas os vogais presentes na primeira.

Dados dois arranjos de números decimais, retorne uma fila contendo todos os itens dos dois elevados ao cubo.

Dada uma fila de números inteiros, retorne a soma de todos eles.

Dada um número inteiro n, retorne uma fila contendo todos os números maiores que zero e menores que n.*/