package br.com.alura.forum.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import br.com.alura.forum.modelo.Topico;

public interface TopicoRepository extends JpaRepository<Topico, Long> {

	// nome do método segue o padrão do Spring Data, EntidadeDER_Atributo
	List<Topico> findByCurso_Nome(String nomeCurso);
	
	
	//Vantagem que eu coloco o nome do método como quiser, porém, temos de montar a query
//	@Query("SELECT t FROM Topico t WHERE t.curso.nome = :nomeCurso")
//	List<Topico> carregarPorNomeDoCurso(@Param ("nomeCurso") String nomeCurso);

}
