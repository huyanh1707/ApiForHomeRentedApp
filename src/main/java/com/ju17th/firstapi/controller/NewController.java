package com.ju17th.firstapi.controller;

import com.ju17th.firstapi.controller.output.NewOutput;
import com.ju17th.firstapi.dto.NewDTO;
import com.ju17th.firstapi.service.INewService;
import com.ju17th.firstapi.service.impl.NewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
public class NewController {

    @Autowired
    private INewService newService;

    @GetMapping(value = "/new")
    public NewOutput showNew(@RequestParam(value = "page", required = false) Integer page ,
                             @RequestParam(value = "limit", required = false) Integer limit) {
        NewOutput result = new NewOutput();
        if (page != null  && limit != null) {
            result.setPage(page);
            result.setListResult(newService.findAll(PageRequest.of(page, limit)));
            result.setTotalPage((int) Math.ceil((double) (newService.totalItem()) / limit));
        } else {
            result.setListResult(newService.findAll());
        }
        return result;
    }

    @PostMapping(value = "/new")
    public NewDTO createNew(@RequestBody NewDTO model) {
        return newService.save(model);
    }

    @PutMapping(value = "/new/{id}")
    public NewDTO updateNew(@RequestBody NewDTO model, @PathVariable("id") long id) {
        model.setId(id);
        return newService.save(model);
    }

    @DeleteMapping(value = "/new")
    public void deleteNew(@RequestBody long[] ids) {
        newService.delete(ids);
    }
}
