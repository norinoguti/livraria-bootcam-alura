package br.com.alura.livraria.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import br.com.alura.livraria.modelo.Autores;

public class AutoresDao {

	
	private Connection conexao;	
	
	public AutoresDao(Connection conexao) {	
		this.conexao = conexao;
	}


	public void cadastrar(Autores autores) {
		try {
			String sql = "insert into autores(nome,email,dataNascimento,miniCurriculo)"
					+ "values (?,?,?,?)";
		
			PreparedStatement ps = conexao.prepareStatement(sql);
			
			ps.setString(1, autores.getNome());
			ps.setString(2,autores.getEmail());
			ps.setDate(3,Date.valueOf(autores.getDataNascimento()));
			ps.setString(4,autores.getMiniCurriculo());
			
			ps.execute();
			
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
	
	public List<Autores> listar(){
		try {
		
			String sql = "select * from autores";
		
		PreparedStatement ps;
		
			ps = conexao.prepareStatement(sql);
			
			ResultSet rs = ps.executeQuery();
			
			List<Autores> autores = new ArrayList<>();
			while(rs.next()) {
				Autores aut = new Autores();
				aut.setNome(rs.getString("nome"));
				aut.setEmail(rs.getString("email"));								
				aut.setDataNascimento(rs.getDate("dataNascimento").toLocalDate());											
				aut.setMiniCurriculo(rs.getString("miniCurriculo"));
				
				autores.add(aut);
			}
			
			return autores;
			
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
		
		
	}
}
