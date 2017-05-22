package stack;

import java.util.List;

public interface Stack<E> { // Dando um nome genérico (o "E" pode ser qualquer letra)

	void push(E e); // Adicionando um novo dado a pilha (Ele recebe de "E", e acrescenta "e")
	
	E pop(); // o comando "pop()", retira o ultimo método da pilha (Nesse caso a pilha "E")
	
	E top(); // o comando "top()", apenas nos mostra o ultimo método da pilha (Nesse caso a pilha "E")
	
	int getSize(); // Este mostra o tamanho da pilha
	
	boolean isEmpty(); //Verifica se a pilha está vazia
	
	
	
	/*
	 * 2- Altere a pilha desenvolvida em sala de aula (interface Stack e classe ArrayStack)
	 *  acrescentando o método pop(int n). O método deve retornar uma lista contendo n itens
	 *   retirados da pilha. Se n for maior que o tamanho da pilha, retornar apenas os elementos disponíveis.
	 */
	List<E> pop(int n); //classe List<E> é do prórpio java
	
	
	
	/*
	 * 4- Altere a pilha desenvolvida em sala de aula (interface Stack e classe ArrayStack)
		acrescentando o método clear(). O método deve esvaziar a pilha, retornando um array com todos os seus elementos.
	 * 
	 */
	List<E> clear(); // Esta lista limpará todo o array/pilha
	
	
	
	/*
	 * 5- Altere a pilha desenvolvida em sala de aula 
	 * (interface Stack e classe ArrayStack) acrescentando o método cloneStack().
	 *  O método deve retornar uma cópia da pilha atual.
	 */
	
	Stack<E> cloneStack(); // esta lista copiará tudo do array/ pilha
	
}
