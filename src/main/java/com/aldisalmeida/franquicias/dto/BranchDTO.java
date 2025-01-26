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
public class BranchDTO {
    @JsonProperty(value = "id", required = true)
    private Long id;

    @JsonProperty(value = "name", required = true)
    @NotEmpty(message = "Name is required")
    private String name;

    @JsonProperty(value = "address", required = true)
    @NotEmpty(message = "address is required")
    private String address;

    @JsonProperty(value = "franchiseId", required = true)
    @NotNull(message = "franchiseId cannot be null")
    private Long franchiseId;
}
