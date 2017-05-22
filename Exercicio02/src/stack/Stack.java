package stack;

import java.util.List;

public interface Stack<E> { // Dando um nome gen�rico (o "E" pode ser qualquer letra)

	void push(E e); // Adicionando um novo dado a pilha (Ele recebe de "E", e acrescenta "e")
	
	E pop(); // o comando "pop()", retira o ultimo m�todo da pilha (Nesse caso a pilha "E")
	
	E top(); // o comando "top()", apenas nos mostra o ultimo m�todo da pilha (Nesse caso a pilha "E")
	
	int getSize(); // Este mostra o tamanho da pilha
	
	boolean isEmpty(); //Verifica se a pilha est� vazia
	
	
	
	/*
	 * 2- Altere a pilha desenvolvida em sala de aula (interface Stack e classe ArrayStack)
	 *  acrescentando o m�todo pop(int n). O m�todo deve retornar uma lista contendo n itens
	 *   retirados da pilha. Se n for maior que o tamanho da pilha, retornar apenas os elementos dispon�veis.
	 */
	List<E> pop(int n); //classe List<E> � do pr�rpio java
	
	
	
	/*
	 * 4- Altere a pilha desenvolvida em sala de aula (interface Stack e classe ArrayStack)
		acrescentando o m�todo clear(). O m�todo deve esvaziar a pilha, retornando um array com todos os seus elementos.
	 * 
	 */
	List<E> clear(); // Esta lista limpar� todo o array/pilha
	
	
	
	/*
	 * 5- Altere a pilha desenvolvida em sala de aula 
	 * (interface Stack e classe ArrayStack) acrescentando o m�todo cloneStack().
	 *  O m�todo deve retornar uma c�pia da pilha atual.
	 */
	
	Stack<E> cloneStack(); // esta lista copiar� tudo do array/ pilha
	
}
