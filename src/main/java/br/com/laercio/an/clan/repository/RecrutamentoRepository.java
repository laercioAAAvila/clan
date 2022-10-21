package br.com.laercio.an.clan.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.laercio.an.clan.model.RecrutamentoModel;

@Repository
public interface RecrutamentoRepository extends JpaRepository<RecrutamentoModel, Long>{

}
