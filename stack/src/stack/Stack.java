package stack;

public interface Stack<E> { // Dando um nome gen�rico (o "E" pode ser qualquer letra)

	void push(E e); // Adicionando um novo dado a pilha (Ele recebe de "E", e acrescenta "e")
	
	E pop(); // o comando "pop()", retira o ultimo m�todo da pilha (Nesse caso a pilha "E")
	
	E top(); // o comando "top()", apenas nos mostra o ultimo m�todo da pilha (Nesse caso a pilha "E")
	
	int getSize(); // Este mostra o tamanho da pilha
	
	boolean isEmpty(); //Verifica se a pilha est� vazia
	
}
