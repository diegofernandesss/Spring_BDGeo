package br.com.example.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class PortoVO {
    private String codigo;
    private String municipio;
}
