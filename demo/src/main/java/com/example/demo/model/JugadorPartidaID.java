package com.example.demo.model;


import jakarta.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

public class JugadorPartidaID implements Serializable {
    

      private Long jugadorId;
    private Long partidaId;

    // Getters y setters
    public Long getJugadorId() { return jugadorId; }
    public void setJugadorId(Long jugadorId) { this.jugadorId = jugadorId; }

    public Long getPartidaId() { return partidaId; }
    public void setPartidaId(Long partidaId) { this.partidaId = partidaId; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof JugadorPartidaID)) return false;
        JugadorPartidaID that = (JugadorPartidaID) o;
        return Objects.equals(jugadorId, that.jugadorId) &&
               Objects.equals(partidaId, that.partidaId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(jugadorId, partidaId);
    }

}
