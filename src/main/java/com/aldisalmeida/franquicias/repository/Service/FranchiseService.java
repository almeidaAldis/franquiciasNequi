package com.aldisalmeida.franquicias.repository.Service;

import com.aldisalmeida.franquicias.dto.FranchiseDTO;
import com.aldisalmeida.franquicias.dto.FranchiseUpdateDTO;
import com.aldisalmeida.franquicias.entity.Franchise;
import com.aldisalmeida.franquicias.repository.FranchiseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
public class FranchiseService {
    @Autowired
    private FranchiseRepository repository;

    public List<Franchise> getAll() {
        return repository.findAll();
    }

    public Franchise create(FranchiseDTO entity) {
        Franchise franchise = new Franchise();
        franchise.setName(entity.getName());
        return repository.save(franchise);
    }

    public Franchise findById(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new NoSuchElementException("Franchise with ID " + id + " not found"));
    }

    public Franchise update(FranchiseUpdateDTO franchiseUpdateDTO){
        Franchise franchise = findById(franchiseUpdateDTO.getId());
        franchise.setName(franchiseUpdateDTO.getName());
        return repository.save(franchise);
    }
}
