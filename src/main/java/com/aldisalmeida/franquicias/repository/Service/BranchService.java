package com.aldisalmeida.franquicias.repository.Service;


import com.aldisalmeida.franquicias.dto.BranchDTO;
import com.aldisalmeida.franquicias.dto.BranchUpdateDTO;
import com.aldisalmeida.franquicias.dto.FranchiseUpdateDTO;
import com.aldisalmeida.franquicias.entity.Branch;
import com.aldisalmeida.franquicias.entity.Franchise;
import com.aldisalmeida.franquicias.repository.BranchRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
public class BranchService {
    @Autowired
    private BranchRepository repository;

    @Autowired
    private FranchiseService franchiseService;

    public List<Branch> getAll() {
        return repository.findAll();
    }

    public Branch create(BranchDTO branchDTO) {
        Franchise franchise = franchiseService.findById(branchDTO.getFranchiseId());
        Branch branch = new Branch();
        branch.setFranchise(franchise);
        branch.setName(branchDTO.getName());
        branch.setAddress(branchDTO.getAddress());
        return repository.save(branch);
    }

    public Branch findById(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new NoSuchElementException("Branch with ID " + id + " not found"));
    }

    public Branch update(BranchUpdateDTO branchUpdateDTO){
        Branch branch = findById(branchUpdateDTO.getId());
        branch.setName(branchUpdateDTO.getName());
        return repository.save(branch);
    }
}
