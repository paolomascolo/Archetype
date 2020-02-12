package it.contrader.converter;

import java.util.List;

/**
 * Created by paolo mascolo e marco leka on 12/1/20.
 */
public interface Converter<Entity,DTO> {

	public Entity toEntity(DTO dto);
	
	public DTO toDTO(Entity entity);
	
	public List<DTO> toDTOList(Iterable<Entity> entityList);
	
	public List<Entity> toEntityList(Iterable<DTO> dtoList);

}