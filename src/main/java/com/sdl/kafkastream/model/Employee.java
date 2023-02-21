package com.sdl.kafkastream.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.Data;

import java.time.LocalDate;

@Data
public class Employee {
    @JsonProperty("employee_id")
    private int employeeId;
    private String name;
    @JsonProperty("date_of_birth")
    private LocalDate dateOfBirth;

    public Employee(int employeeId, String name, LocalDate dateOfBirth) {
        this.employeeId = employeeId;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
    }
}
