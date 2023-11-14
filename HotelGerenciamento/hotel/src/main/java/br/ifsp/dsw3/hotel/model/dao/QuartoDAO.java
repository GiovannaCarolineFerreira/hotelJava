package br.ifsp.dsw3.hotel.model.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import br.ifsp.dsw3.hotel.model.domain.Quarto;

public interface QuartoDAO extends JpaRepository<Quarto, Long> {

    Object getAll();

    void save(Quarto quarto);

    void delete(int numero);

    Object getByNumero(int numero);

    void update(Quarto quarto);
    
}
