package br.com.example.appfinancas.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.example.appfinancas.modelo.Financas;

public interface FinancasRepository extends JpaRepository<Financas, Long>  {

	List<Financas> findByFinancas(String nomeTipo);
}
