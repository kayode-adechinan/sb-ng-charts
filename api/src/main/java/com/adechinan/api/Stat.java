package com.adechinan.api;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;

@Document
@Data
@NoArgsConstructor
public class Stat {
    @Id
    private String id;
    private String country;
    private BigDecimal salary;

    public Stat(String country, BigDecimal salary) {
        this.country = country;
        this.salary = salary;
    }
}
