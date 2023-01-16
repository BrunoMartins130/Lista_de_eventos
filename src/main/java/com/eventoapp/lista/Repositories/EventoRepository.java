package com.eventoapp.lista.Repositories;

import com.eventoapp.lista.models.Evento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;
@Repository
public interface EventoRepository extends JpaRepository <Evento , UUID> {

}
