package ru.hackathon.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

@Data
public class Vrp {
    String _id;
    String id;
    String type;
    String description;
    String name;
    String name_ru;
    String freq;
    @JsonIgnore
    Icon icon;
    Double[] position;
}
