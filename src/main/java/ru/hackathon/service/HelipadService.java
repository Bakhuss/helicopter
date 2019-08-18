package ru.hackathon.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.hackathon.model.Helipad;

import java.io.IOException;
import java.util.List;

@Service
public class HelipadService {
    private final Logger log = LoggerFactory.getLogger(HelipadService.class);

    private List<Helipad> helipads;

    @Autowired
    public HelipadService(List<Helipad> helipads) {
        this.helipads = helipads;
    }

    public List<Helipad> getHelicopterPad() throws IOException {
        return helipads;
    }
}
