package br.com.showmilhao.test;

import br.com.showmilhao.dao.JogadorDAO;
import br.com.showmilhao.model.Jogador;

public class InsertDataForTesting {
	
	private static JogadorDAO jogadorDAO = new JogadorDAO();
	
	public static void main(String[] args) {
		/*Jogador jogador = new Jogador("Ana Paula", 800);
		System.out.println(jogadorDAO.adicionar(jogador));*/
		
		Jogador jogador = new Jogador();
		jogador.setId(1);
		jogador.setNome("Raul Maximiliano");
		jogador.setPontuacao(1000);		
		jogadorDAO.atualizar(jogador);
	}

}
