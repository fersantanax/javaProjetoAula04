package repositories;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import entities.Pessoa;

public class PessoaRepository {
	public void create(Pessoa pessoa) throws Exception {

		String driver = "org.postgresql.Driver";
		String url = "jdbc:postgresql://localhost:5432/bd_projetoaula04";
		String user = "postgres";
		String password = "coti";

		Class.forName(driver);
		Connection connection = DriverManager.getConnection(url, user, password);

		PreparedStatement statement = connection.prepareStatement("insert into pessoa (id, nome, cpf) values(?,?,?)");

		statement.setObject(1, pessoa.getId());

		statement.setString(2, pessoa.getNome());

		statement.setString(3, pessoa.getCpf());

		statement.execute();

		connection.close();
	}
}