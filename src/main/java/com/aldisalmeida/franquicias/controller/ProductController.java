package com.aldisalmeida.franquicias.controller;

import com.aldisalmeida.franquicias.dto.ProductDTO;
import com.aldisalmeida.franquicias.dto.ProductUpdateDTO;
import com.aldisalmeida.franquicias.entity.Product;
import com.aldisalmeida.franquicias.repository.Service.ProductService;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController {
    @Autowired
    private ProductService service;

    @GetMapping
    public List<Product> getAll() {
        return service.getAll();
    }

    @PostMapping
    public Product create(@Valid @RequestBody ProductDTO entity) {
        return service.create(entity);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable  @NotNull(message = "ID cannot be null")
                           @Positive(message = "ID must be a positive number")
                           Long id) {
        service.delete(id);
    }

    @PutMapping
    public Product updateProduct(@Valid @RequestBody ProductUpdateDTO productUpdateDTO) {
        return service.update(productUpdateDTO);
    }
}
