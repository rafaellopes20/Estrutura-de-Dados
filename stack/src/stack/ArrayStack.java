package stack;

import java.lang.reflect.Array;

//Para que isso funcione (o codigo da linha 3) deve existir os Override abaixo:
public class ArrayStack<E> implements Stack<E> {  // Criando um ArrayStack com nome "E", implementando os dados criados do Stack<E>
	
	private E[] array;// = (E[])new Object[20]; // armazenar dados neste array / Privado pois não pode ser acessado por outras classes.	
 
	private int position = 0; //para saber a posição do array o novo elemento será adicionado
	
	public ArrayStack(){
		array = (E[])new Object[20]; //setando um valor fixo para o array, caso o usuário não informe valor (padrão 20)
	}
	
	public ArrayStack(int i){
		array = (E[])new Object[i]; //setando um valor onde o usuário irá informar o tamanho do array
	}
	
	

	@Override
	public void push(E e) {// Adiciona um novo dado a pilha (no array do tipo "[]E")
		if(position == array.length){
			E[] ArrayCopy = (E[])new Object[array.length*2];
			System.arraycopy(array, 0, ArrayCopy, 0, array.length-1);
			array = ArrayCopy;
		}
		array[position] = e; // após o sinal "=", deve-se colocar o valor que está estanciado (neste caso este em aspas - push(E "e"))
		position++; // incrementa para ir para o próximo valor
		
	}

	@Override
	public E pop() {
		if(position == 0){  //Verificando se o array tem valor, se for 0, retorna null, caso contrário mostra o valor
			return null;
		}else{
			E aux = array[position -1]; //Pegando qual é o ultimo valor que está no top da lista, usando o position
			array[position -1] = null; // fazendo um "backup" do valor, caso dê erro
			position--; // decrementando o position para pegar a posição do ultimo valor e exclui-lo (pois o POP exclui)
			return aux; // retornando a variavel
		}
	}

	@Override
	public E top() {
		if(position == 0){ //Verificando se o array tem valor, se for 0, retorna null, caso contrário mostra o valor
			return null;
		}else{
			return array[position - 1]; // pegamos o valor da posição e subtraímos 1 para descobrir o numero total de espaços ocupados no array
		}
	}

	@Override
	public int getSize() {
		return position; // Pois esta variavel basicamente conta a posição do array, tendo noção então do tamanho (pois ele sempre pega o próximo)
	}

	@Override
	public boolean isEmpty() {
		return position == 0; // se a posição for igual a 0, significa que a pilha não tem nada.
	}
	
}
