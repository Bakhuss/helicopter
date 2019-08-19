package ru.hackathon.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.hackathon.model.Ban;
import ru.hackathon.model.Helipad;
import ru.hackathon.model.Restriction;
import ru.hackathon.model.Vrp;
import ru.hackathon.model.view.BanIdPositionView;
import ru.hackathon.model.view.HeliIdPositionView;
import ru.hackathon.model.view.RestrictionIdPositionView;
import ru.hackathon.model.view.VrpIdPositionView;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class HelipadService {
    private final Logger log = LoggerFactory.getLogger(HelipadService.class);

    private List<Helipad> helipads;
    private List<Restriction> restrictions;
    private List<Vrp> vrps;
    private List<Ban> bans;

    @Autowired
    public HelipadService(List<Helipad> helipads,
                          List<Restriction> restrictions,
                          List<Vrp> vrps,
                          List<Ban> bans) {
        this.helipads = helipads;
        this.restrictions = restrictions;
        this.vrps = vrps;
        this.bans = bans;
    }

    public List<Helipad> getHelicopterPad() {
        return helipads;
    }

    public List<HeliIdPositionView> getHelicopterIdsAndPositions() {
        return helipads.stream().map(h -> {
            HeliIdPositionView view = new HeliIdPositionView();
            view.setId(h.getId());
            view.setPosition(h.getPosition());
            return view;
        }).collect(Collectors.toList());
    }

    public List<RestrictionIdPositionView> getRestrictions() {
        return restrictions.stream().map(r -> {
            RestrictionIdPositionView view = new RestrictionIdPositionView();
            view.setId(r.getId());
            view.setPath(r.getPath());
            return view;
        }).collect(Collectors.toList());
    }

    public List<VrpIdPositionView> getVrps() {
        return vrps.stream().map(v -> {
            VrpIdPositionView view = new VrpIdPositionView();
            view.setId(v.getId());
            view.setPosition(v.getPosition());
            return view;
        }).collect(Collectors.toList());
    }

    public List<BanIdPositionView> getBans() {
        return bans.stream().map(b -> {
            BanIdPositionView view = new BanIdPositionView();
            view.setId(b.getId());
            view.setPath(b.getPath());
            return view;
        }).collect(Collectors.toList());
    }
}
