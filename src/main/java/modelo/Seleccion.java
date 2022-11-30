package modelo;

import java.util.ArrayList;

public class Seleccion {

	private String nombre;
	private int rankingFIFA;
	private Jugador jugadores;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getRankingFIFA() {
		return rankingFIFA;
	}

	public void setRankingFIFA(int rankingFIFA) {
		this.rankingFIFA = rankingFIFA;
	}

	public Jugador getJugadores() {
		return jugadores;
	}

	public void setJugadores(Jugador jugadores) {
		this.jugadores = jugadores;
	}
}