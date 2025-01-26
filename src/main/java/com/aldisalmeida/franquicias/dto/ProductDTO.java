package com.aldisalmeida.franquicias.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ProductDTO {
    @JsonProperty(value = "id", required = true)
    private Long id;

    @JsonProperty(value = "name", required = true)
    @NotEmpty(message = "name is required")
    private String name;

    @JsonProperty(value = "price", required = true)
    @NotNull(message = "price cannot be null")
    private Double price;

    @JsonProperty(value = "stock", required = true)
    @NotNull(message = "stock cannot be null")
    private Integer stock;

    @JsonProperty(value = "branchId", required = true)
    @NotNull(message = "branchId cannot be null")
    private Long branchId;
}
