package it.contrader.service;

import org.springframework.stereotype.Component;

/**
 * Questa interfaccia firma i metodi dei Service. Osservare che, a differenza di
 * {@link AbstractService}, dipende solo dal parametro DTO.
 * 
 * @author Vittorio Valent
 * @author Girolamo Murdaca
 *
 * @param <DTO>
 * 
 * @see AbstractService
 */

public interface ServiceDTO<DTO> {
	
	public Iterable<DTO> getAll();

	public DTO read(long id);
	
	public DTO insert (DTO dto);
	
	public DTO update (DTO dto);
	
	public void delete (long id);
}