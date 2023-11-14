package br.ifsp.dsw3.hotel.model.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import br.ifsp.dsw3.hotel.model.domain.Funcionario;

public interface FuncionarioDAO extends JpaRepository<Funcionario, Long> {

    Object getAll();

    void delete(Long id);

    void update(Funcionario funcionario);

    Object getById(Long id);

    void save(Funcionario funcionario);
    
}
