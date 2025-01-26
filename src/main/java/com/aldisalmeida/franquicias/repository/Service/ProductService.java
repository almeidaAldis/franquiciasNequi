package com.aldisalmeida.franquicias.repository.Service;

import com.aldisalmeida.franquicias.dto.ProductDTO;
import com.aldisalmeida.franquicias.dto.ProductUpdateDTO;
import com.aldisalmeida.franquicias.entity.Branch;
import com.aldisalmeida.franquicias.entity.Product;
import com.aldisalmeida.franquicias.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
public class ProductService {
    @Autowired
    private ProductRepository repository;

    @Autowired
    private BranchService branchService;

    public List<Product> getAll() {
        return repository.findAll();
    }

    public Product create(ProductDTO productDTO) {
        Branch branch = branchService.findById(productDTO.getBranchId());
        Product product = new Product();
        product.setName(productDTO.getName());
        product.setStock(productDTO.getStock());
        product.setPrice(productDTO.getPrice());
        product.setBranch(branch);
        return repository.save(product);
    }

    public Product update(ProductUpdateDTO productUpdateDTO){
        Product product = findById(productUpdateDTO.getId());
        product.setName(productUpdateDTO.getName());
        product.setStock(productUpdateDTO.getStock());
        return repository.save(product);
    }

    public Product findById(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new NoSuchElementException("Product with ID " + id + " not found"));
    }
    public void delete(Long id) {
        Product product = findById(id);
        repository.delete(product);
    }
}
