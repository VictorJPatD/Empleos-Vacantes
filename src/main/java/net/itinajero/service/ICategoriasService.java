package net.itinajero.service;

import java.util.List;
import net.itinajero.model.Categoria;

public interface ICategoriasService {	
	List<Categoria> buscarTodas();
	Categoria buscarPorId(Integer idCategoria);
	void guardar(Categoria categoria);
	// Ejercicio: Implementar método
	void eliminar(Integer idCategoria);
}