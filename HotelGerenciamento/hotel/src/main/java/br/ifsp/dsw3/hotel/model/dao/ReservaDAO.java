package br.ifsp.dsw3.hotel.model.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import br.ifsp.dsw3.hotel.model.domain.Reserva;

public interface ReservaDAO extends JpaRepository<Reserva, Long>{

    Object getAll();

    void save(Reserva reserva);

    void delete(int id);

    Object getById(int id);

    void update(Reserva reserva);
    
}
