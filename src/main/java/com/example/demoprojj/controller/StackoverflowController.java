package com.example.demoprojj.controller;

import com.example.demoprojj.dto.SiteDto;
import com.example.demoprojj.exception.ResourceNotFoundException;
import com.example.demoprojj.service.StackoverflowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

@RestController
@RequestMapping("/stack")
public class StackoverflowController {

    @Autowired
    private StackoverflowService stackoverflowService;
    @GetMapping()
    public ResponseEntity<List<SiteDto>> getSites(@RequestParam(value = "page") String page,
                                                  @RequestParam (value = "page_size")String page_size){
        List<SiteDto> sites = stackoverflowService.getSites(page, page_size);
        return new ResponseEntity<>(sites, HttpStatus.ACCEPTED);

    }
}
