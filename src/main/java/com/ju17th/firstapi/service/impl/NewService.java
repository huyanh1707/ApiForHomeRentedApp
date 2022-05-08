package com.ju17th.firstapi.service.impl;

import com.ju17th.firstapi.converter.NewConverter;
import com.ju17th.firstapi.dto.NewDTO;
import com.ju17th.firstapi.entity.CategoryEntity;
import com.ju17th.firstapi.entity.NewEntity;
import com.ju17th.firstapi.repository.CategoryRepository;
import com.ju17th.firstapi.repository.NewRepository;
import com.ju17th.firstapi.service.INewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NewService implements INewService {

    @Autowired
    private NewRepository newRepository;

    @Autowired
    private CategoryRepository categoryRepository;

    @Autowired
    private NewConverter newConverter;

    @Override
    public NewDTO save(NewDTO newDTO) {
        CategoryEntity categoryEntity = categoryRepository.findCategoryEntityByCode(newDTO.getCategoryCode());
        NewEntity newEntity = newConverter.toEntity(newDTO);
        newEntity.setCategory(categoryEntity);
        newEntity = newRepository.save(newEntity);
        return null;
    }
}