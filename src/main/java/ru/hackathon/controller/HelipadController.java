package ru.hackathon.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.hackathon.model.view.HeliIdPositionView;
import ru.hackathon.service.HelipadService;

import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping(value = "/", produces = APPLICATION_JSON_VALUE)
public class HelipadController {
    private final Logger log = LoggerFactory.getLogger(HelipadController.class);

    private final HelipadService helipadService;

    @Autowired
    public HelipadController(HelipadService helipadService) {
        this.helipadService = helipadService;
    }

    @GetMapping("/helipad")
    public List<HeliIdPositionView> getHeliIdsAndPositions() throws Exception {
        return helipadService.getHelicopterIdsAndPositions();
    }
}
