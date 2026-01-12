package com.example.demo.model;

import jakarta.persistence.*;


    @Entity
@Table(name = "jugador_partida")
public class JugadorPartida {

    @EmbeddedId
    private JugadorPartidaID id = new JugadorPartidaID();

    @ManyToOne
    @MapsId("jugadorId")
    private Jugador jugador;

    @ManyToOne
    @MapsId("partidaId")
    private Partida partida;

    private int score;

    // Getters y setters
    public JugadorPartidaID getId() { return id; }
    public void setId(JugadorPartidaID id) { this.id = id; }

    public Jugador getJugador() { return jugador; }
    public void setJugador(Jugador jugador) { this.jugador = jugador; }

    public Partida getPartida() { return partida; }
    public void setPartida(Partida partida) { this.partida = partida; }

    public int getScore() { return score; }
    public void setScore(int score) { this.score = score; }

    
}
