package br.com.showmilhao.test;

import br.com.showmilhao.dao.PerguntaDAO;
import br.com.showmilhao.model.Pergunta;

public class InsertDataForTesting {
	
	private static PerguntaDAO perguntaDAO = new PerguntaDAO();
	
	public static void main(String[] args) {
		
		Pergunta pergunta = new Pergunta();
		pergunta.setNivel("facil");
		pergunta.setEnunciado("Qual a cor do cavalo branco de Napoleão?");
		pergunta.setAlternativa1("Preto");
		pergunta.setAlternativa2("Vermelho");
		pergunta.setAlternativa3("Amarelo");
		pergunta.setResposta("branca");
		
		perguntaDAO.adicionar(pergunta);;
		
		
	}

}
