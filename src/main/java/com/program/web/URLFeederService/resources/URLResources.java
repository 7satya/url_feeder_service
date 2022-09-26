package com.program.web.URLFeederService.resources;

import com.program.web.URLFeederService.common.Constants;
import com.program.web.URLFeederService.model.URL;
import com.program.web.URLFeederService.service.URLService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Timestamp;
import java.util.UUID;

@RestController
public class URLResources {

    @Autowired
    private URLService urlService;

    @GetMapping("/ping")
    public String ping(){
        return "pong";
    }

    @PostMapping
    public ResponseEntity<Void> submitUrl(@RequestBody URL url){
        url.setId(Constants.URL_UUID_PREFIX + UUID.randomUUID().toString());
        url.setCreatedDate(new Timestamp(System.currentTimeMillis()));
        urlService.save(url);

        return ResponseEntity.ok().build();
    }
}
