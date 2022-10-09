package net.itinajero.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import net.itinajero.model.Categoria;

public interface ICategoriasService {	
	List<Categoria> buscarTodas();
	Categoria buscarPorId(Integer idCategoria);
	void guardar(Categoria categoria);
	// Ejercicio: Implementar método
	void eliminar(Integer idCategoria);
	Page<Categoria> buscarTodas(Pageable page);
}