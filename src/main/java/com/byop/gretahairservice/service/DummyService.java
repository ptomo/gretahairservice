package com.byop.gretahairservice.service;

import com.byop.gretahairservice.valueobject.Dummy;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DummyService {

    @RequestMapping("/dummy")
    public Dummy dummy() {
        return new Dummy(1, "BISWAJIT ROY");
    }

}
