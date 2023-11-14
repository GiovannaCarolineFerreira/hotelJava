package br.ifsp.dsw3.hotel.model.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import br.ifsp.dsw3.hotel.model.domain.Tipo_quarto;

public interface Tipo_quartoDAO extends JpaRepository <Tipo_quarto, Long>{

    Object getAll();

    void delete(Long id);

    Object getById(Long id);

    void save(Tipo_quarto tipoQuarto);

    void update(Tipo_quarto tipoQuarto);
    
}
