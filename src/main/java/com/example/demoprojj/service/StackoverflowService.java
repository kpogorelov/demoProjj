package com.example.demoprojj.service;

import com.example.demoprojj.dto.SiteDto;

import java.util.List;

public interface StackoverflowService {
    List<SiteDto> getSites(String page, String page_size);

//    SiteDto getSiteByID(int id);
}
