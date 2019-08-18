package ru.hackathon.model;

import lombok.Data;

@Data
public class Ban {
    String _id;
    String type;
    Alt alts;
    String id;
    String[][] path;
    String active;
}
