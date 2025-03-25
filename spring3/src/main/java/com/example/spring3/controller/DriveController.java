package com.example.spring3.controller;

import com.example.spring3.service.Drive;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("drive")
public class DriveController {

    private final Drive drive;

    public DriveController(Drive drive) {
        this.drive = drive;
        log.info("Successfully injected Drive into DriveController");
    }

    @PostMapping("startEngine")
    public void startEngineApi() {
        drive.startEngine();
        log.info("Engine started");
    }
}
