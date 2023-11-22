package es.deusto.ingenieria.prog3.easybooking.domain;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Statistics {

	
	//T3.A Crea el ranking de tránsito de pasajeros por un aeropuerto:
	//Este método devuelve la lista ordenada de mayor a menor tránsito de pasajeros 
	//por un aeropuerto. El tránsito de pasajeros se calcula sumando el número de 
	//tarjetas de embarque generadas para los vuelos que despegan o aterrizan en 
	//dicho aeropuerto. La lista debe contener únicamente los aeropuertos por los 
	//que ha transitado al menos una persona.
	/**
	 * Delvuelve el ranking de aeropuertos en base al tránsito de pasajeros. 
	 * @param flights List<Flight> con la lista completa de vuelos
	 * @return List<Airport> ranking de aeropuertos.
	 */
	public static List<Airport> getAirportTransitRanking(List<Flight> flights) {
		return new ArrayList<>();
	}
	
	
	//T3.B Crea el mapa de estadísticas de operaciones de las compañías aérea:
	//Este método devuelve un mapa que indexa para cada aerolínea una lista con 
	//información acumulada de los vuelos operados por cada aerolínea. La lista
	//contendrá los siguientes valores (en este orden):
	//- Número total de ingresos de todas las reservas.
	//- Número total de pasajeros (se calcula a partir del número de tarjetas de embarque)
	//- Número de asientos de los aviones de todos los vuelos.

	/**
	 * Delvuelve el mapa de estadísticas de operaciones
	 * @param flights List<Flight> con la lista completa de vuelos
	 * @return Map<Airline, List<Float>> con las estadísticas de operaciones
	 */
	public static Map<Airline, List<Float>> getAirlineOperationsData(List<Flight> flights) {
		return new HashMap<>();
	}
}