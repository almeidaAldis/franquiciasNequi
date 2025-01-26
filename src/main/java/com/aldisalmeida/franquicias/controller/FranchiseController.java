package com.aldisalmeida.franquicias.controller;

import com.aldisalmeida.franquicias.dto.FranchiseDTO;
import com.aldisalmeida.franquicias.dto.FranchiseUpdateDTO;
import com.aldisalmeida.franquicias.entity.Franchise;
import com.aldisalmeida.franquicias.repository.Service.FranchiseService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/franchises")
public class FranchiseController {
    @Autowired
    private FranchiseService service;

    @GetMapping
    public List<Franchise> getAll() {
        return service.getAll();
    }

    @PostMapping
        public Franchise create(
            @Valid @RequestBody FranchiseDTO entity
    ) {
        return service.create(entity);
    }

    @PutMapping
    public Franchise updateFranchise(@Valid @RequestBody FranchiseUpdateDTO franchiseUpdateDTO) {
        return service.update(franchiseUpdateDTO);
    }
}
