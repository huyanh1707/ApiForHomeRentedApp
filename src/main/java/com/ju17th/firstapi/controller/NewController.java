package com.ju17th.firstapi.controller;

import com.ju17th.firstapi.entity.NewEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class NewController {

    @PostMapping("/new")
    public NewEntity createNew(@RequestBody NewEntity model) {
        return model;
    }

    @GetMapping("/new")
    public NewEntity updateNew(@RequestBody NewEntity model) {
        return model;
    }

    @DeleteMapping("/new")
    public NewEntity deleteNew(@RequestBody NewEntity model) {
        return model;
    }
}
