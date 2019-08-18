package ru.hackathon.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.hackathon.model.Helipad;
import ru.hackathon.model.Restriction;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class HelipadService {
    private final Logger log = LoggerFactory.getLogger(HelipadService.class);

    private List<Helipad> helipads;
    private List<Restriction> restrictions;

    @Autowired
    public HelipadService(List<Helipad> helipads,
                          List<Restriction> restrictions) {
        this.helipads = helipads;
        this.restrictions = restrictions;
    }

    public List<Helipad> getHelicopterPad() throws IOException {
        return helipads;
    }

    public Map<String, String[]> getHelicopterIdsAndPositions() throws IOException {
        Map<String, String[]> helicopterIdAndPosition = helipads.stream().collect(Collectors.toMap(r -> r.getId(), r -> r.getPosition()));
        return helicopterIdAndPosition;
    }

    public Map<String, String[]> getRestrictions() {
        return null;
    }
}
