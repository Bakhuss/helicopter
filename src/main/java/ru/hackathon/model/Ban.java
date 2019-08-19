package ru.hackathon.model;

import lombok.Data;

@Data
public class Ban {
    String _id;
    String type;
    Alt alts;
    String id;
    Double[][] path;
    String active;
}
