package br.edu.ifsp.dsw3.hotel.model.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.ifsp.dsw3.hotel.model.domain.TipoQuarto;

public interface TipoQuartoDao extends JpaRepository<TipoQuarto, Long> {
    
}
