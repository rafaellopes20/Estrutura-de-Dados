package stack;

import java.lang.reflect.Array;

//Para que isso funcione (o codigo da linha 3) deve existir os Override abaixo:
public class ArrayStack<E> implements Stack<E> {  // Criando um ArrayStack com nome "E", implementando os dados criados do Stack<E>
	
	private E[] array;// = (E[])new Object[20]; // armazenar dados neste array / Privado pois n�o pode ser acessado por outras classes.	
 
	private int position = 0; //para saber a posi��o do array o novo elemento ser� adicionado
	
	public ArrayStack(){ // N�O RECEBE PAR�METRO, repare os parenteses ()
		array = (E[])new Object[20]; //setando um valor fixo para o array, caso o usu�rio n�o informe valor (padr�o 20)
	}
	
	public ArrayStack(int i){// RECEBE PARAMETRO, repare os parenteses (int i)
		array = (E[])new Object[i]; //setando um valor onde o usu�rio ir� informar o tamanho do array
	}
	
	

	@Override
	public void push(E e) {// Adiciona um novo dado a pilha (no array do tipo "[]E")
		if(position == array.length){ // se a posi��o for igual ao tamanho do array
			System.out.println("Redimensionando...");//Para acompanharmos no teste se est� criando um novo array se encher
			E[] ArrayCopy = (E[])new Object[array.length*2]; // Crie um objeto que copia o array antigo e multiplique seu tamanho por 2
			System.arraycopy(array, 0, ArrayCopy, 0, array.length); // primeiro item, array buscado, 2- a partir de qual numero ser� copiado, 3- qual o novo array a ser criado, 4- apartir de que numero ser� passado as c�pias...
			array = ArrayCopy; // os valores do array antigo, devem passar para o array novo, igualando-os
		}
		array[position] = e; // ap�s o sinal "=", deve-se colocar o valor que est� estanciado (neste caso este em aspas - push(E "e"))
		position++; // incrementa para ir para o pr�ximo valor
		
	}

	@Override
	public E pop() {
		if(position == 0){  //Verificando se o array tem valor, se for 0, retorna null, caso contr�rio mostra o valor
			return null;
		}else{
			E aux = array[position -1]; //Pegando qual � o ultimo valor que est� no top da lista, usando o position
			array[position -1] = null; // fazendo um "backup" do valor, caso d� erro
			position--; // decrementando o position para pegar a posi��o do ultimo valor e exclui-lo (pois o POP exclui)
			return aux; // retornando a variavel
		}
	}

	@Override
	public E top() {
		if(position == 0){ //Verificando se o array tem valor, se for 0, retorna null, caso contr�rio mostra o valor
			return null;
		}else{
			return array[position - 1]; // pegamos o valor da posi��o e subtra�mos 1 para descobrir o numero total de espa�os ocupados no array
		}
	}

	@Override
	public int getSize() {
		return position; // Pois esta variavel basicamente conta a posi��o do array, tendo no��o ent�o do tamanho (pois ele sempre pega o pr�ximo)
	}

	@Override
	public boolean isEmpty() {
		return position == 0; // se a posi��o for igual a 0, significa que a pilha n�o tem nada.
	}
	
}
