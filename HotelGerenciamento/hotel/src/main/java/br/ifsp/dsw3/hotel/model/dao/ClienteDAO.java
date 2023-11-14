package br.ifsp.dsw3.hotel.model.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import br.ifsp.dsw3.hotel.model.domain.Cliente;

public interface ClienteDAO extends JpaRepository<Cliente, Long> {

    void save(Cliente cliente);

    void delete(Long id);

    Object getAll();

    Object getById(Long id);

    void update(Cliente cliente);
    
}
