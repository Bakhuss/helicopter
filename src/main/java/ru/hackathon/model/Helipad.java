package ru.hackathon.model;

import lombok.Data;

@Data
public class Helipad {
    String id;
    String type;
    String isValid;
    String index;
    String[] position;
    String avgas;
    String petrol;
    String kerosene;
    Icon icon;
    String isInternational;
    String title;
    String name;
}
