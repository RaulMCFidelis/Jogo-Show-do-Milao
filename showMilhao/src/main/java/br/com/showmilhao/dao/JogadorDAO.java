package br.com.showmilhao.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import br.com.showmilhao.connection.ConnectionFactory;
import br.com.showmilhao.model.Jogador;
import br.com.showmilhao.util.LogUtil;

public class JogadorDAO {
	
	private Connection connection;
	
	public JogadorDAO() {
		connection = ConnectionFactory.getConnection();		
	}

	public boolean adicionar(Jogador jogador) {
		try {
			String sql = "INSERT INTO jogador (id, nome, pontuacao) VALUES ($next_id, ?, ?)";
			try(PreparedStatement stmt = connection.prepareStatement(sql)) {
				stmt.setString(2, jogador.getNome());
				stmt.setInt(3, jogador.getPontuacao());
				stmt.executeUpdate();
				connection.commit();
				return true;
			}
		} catch (Exception e) {
			LogUtil.getLogger(JogadorDAO.class).error(e.getCause().toString());
			return false;
		}		
	}
	
	public void atualizar(Jogador jogador) {
		try {
			String sql = "UPDATE jogador SET nome = ?, pontuacao = ? WHERE id = ?";
			try(PreparedStatement stmt = connection.prepareStatement(sql)) {
				stmt.setString(1, jogador.getNome());
				stmt.setInt(2, jogador.getPontuacao());
				stmt.setInt(3, jogador.getId());
				stmt.executeUpdate();
				connection.commit();			
			}
		} catch (Exception e) {
			LogUtil.getLogger(JogadorDAO.class).error(e.getCause().toString());
			
		}		
	}
	
}
