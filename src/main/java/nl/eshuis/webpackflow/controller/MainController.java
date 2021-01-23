package nl.eshuis.webpackflow.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "")
public class MainController {

    @GetMapping(value = "")
    public ResponseEntity getMain () {
        return ResponseEntity.status(200).body("Webpackflow application");
    }
}
