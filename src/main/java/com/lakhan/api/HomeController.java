package com.lakhan.api;

import com.lakhan.exception.InValidIdException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@Slf4j
public class HomeController {

    @GetMapping("/home/{id}")
    public ResponseEntity<String> get(@PathVariable("id") String id){
        log.info("id={}", id);
        if(id.equals("23")){
            throw new InValidIdException("test failed due to invalid id pass in url");
        }
        if(id.equals("24")){
            throw  new RuntimeException("Internal server error");
        }
        return ResponseEntity.ok("Success");
    }
}
