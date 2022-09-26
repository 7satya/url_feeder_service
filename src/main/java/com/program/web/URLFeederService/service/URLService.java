package com.program.web.URLFeederService.service;

import com.program.web.URLFeederService.dao.URLRepository;
import com.program.web.URLFeederService.model.URL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class URLService {

    @Autowired
    private URLRepository urlRepository;

    public void save(URL url){
        urlRepository.save(url);
    }
}
