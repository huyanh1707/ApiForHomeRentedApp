package com.ju17th.firstapi.converter;

import com.ju17th.firstapi.dto.NewDTO;
import com.ju17th.firstapi.entity.NewEntity;
import org.springframework.stereotype.Component;

@Component
public class NewConverter {

    public NewEntity toEntity(NewDTO newDTO) {
        NewEntity entity = new NewEntity();
        entity.setTitle(newDTO.getTitle());
        entity.setContent(newDTO.getContent());
        entity.setShortDescription(newDTO.getShortDescription());
        entity.setThumbnail(newDTO.getThumbnail());
        return entity;
    }

    public NewDTO toEntity(NewEntity entity) {
        NewDTO dto = new NewDTO();
        dto.setTitle(entity.getTitle());
        dto.setContent(entity.getContent());
        dto.setThumbnail(entity.getThumbnail());
        dto.setShortDescription(entity.getShortDescription());
        return dto;
    }
}
