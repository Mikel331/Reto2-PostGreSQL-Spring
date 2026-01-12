package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.model.JugadorPartida;
import com.example.demo.model.JugadorPartidaID;

public interface JugadorPartidaRepository extends JpaRepository<JugadorPartida, JugadorPartidaID> {}

