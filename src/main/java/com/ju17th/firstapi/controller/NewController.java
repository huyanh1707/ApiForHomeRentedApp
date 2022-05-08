package com.ju17th.firstapi.controller;

import com.ju17th.firstapi.dto.NewDTO;
import com.ju17th.firstapi.service.INewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
public class NewController {

    @Autowired
    private INewService NewService;

    @PostMapping(value = "/new")
    public NewDTO createNew(@RequestBody NewDTO model) {
        return NewService.save(model);
    }

    @PutMapping(value = "/new")
    public NewDTO updateNew(@RequestBody NewDTO model) {
        return model;
    }

    @DeleteMapping(value = "/new")
    public void deleteNew(@RequestBody long[] ids) {
    }
}
