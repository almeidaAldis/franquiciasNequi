package com.aldisalmeida.franquicias.controller;

import com.aldisalmeida.franquicias.dto.BranchDTO;
import com.aldisalmeida.franquicias.dto.BranchUpdateDTO;
import com.aldisalmeida.franquicias.entity.Branch;
import com.aldisalmeida.franquicias.repository.Service.BranchService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/branches")
public class BranchController {
    @Autowired
    private BranchService service;

    @GetMapping
    public List<Branch> getAll() {
        return service.getAll();
    }

    @PostMapping
    public Branch create(@Valid @RequestBody BranchDTO branchDTO) {
        return service.create(branchDTO);
    }

    @PutMapping
    public Branch updateBranch(@Valid @RequestBody BranchUpdateDTO branchUpdateDTO) {
        return service.update(branchUpdateDTO);
    }
}
