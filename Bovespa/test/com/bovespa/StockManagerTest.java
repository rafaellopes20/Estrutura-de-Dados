package com.bovespa;

import java.io.IOException;

import org.junit.Test;

public class StockManagerTest {

	@Test
	public void loadStocksTest()  throws IOException{
		StockManager stockManager = new StockManager();
		stockManager.loadStocks("Z:\\3º Ano (Sistemas de Informação)\\Estrutura de Dados (ESTD)\\Estrutura-de-Dados\\Bovespa\\Arquivos\\COTAHIST_A2016_TEST.txt");
		
	}
	
}
