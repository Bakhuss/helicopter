package ru.hackathon.config;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.hackathon.model.Ban;
import ru.hackathon.model.Helipad;
import ru.hackathon.model.Restriction;
import ru.hackathon.model.Vrp;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

@Configuration
public class DataConfig {

    @Bean
    public List<Helipad> helipads() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        InputStream inputStreamHelipad = getClass().getResourceAsStream("/queries/helicopter-map.json");
        return mapper.readValue(inputStreamHelipad, new TypeReference<List<Helipad>>() {
        });
    }

    @Bean
    public List<Restriction> restrictions() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        InputStream inputStreamRestriction = getClass().getResourceAsStream("/queries/restrictions.json");
        return mapper.readValue(inputStreamRestriction, new TypeReference<List<Restriction>>() {
        });
    }

    @Bean
    public List<Vrp> vrps() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        InputStream inputStreamVrp = getClass().getResourceAsStream("/queries/vrp.json");
        return mapper.readValue(inputStreamVrp, new TypeReference<List<Vrp>>() {
        });
    }

    @Bean
    public List<Ban> bans() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        InputStream inputStreamBan = getClass().getResourceAsStream("/queries/bans.json");
        return mapper.readValue(inputStreamBan, new TypeReference<List<Ban>>() {
        });
    }
}
