package com.example.demoprojj.service;

import com.example.demoprojj.dto.SiteDto;
import com.example.demoprojj.dto.StackoverflowSitesDto;
import lombok.NonNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import java.util.*;
import java.util.stream.Collectors;


@Service
public class StackoverflowServiceImpl implements StackoverflowService {

    @Autowired
    private RestTemplate restTemplate;
    @Value("${url.stack}")
    private String URL;

    @Override
    public List<SiteDto> getSites(String page, String page_size) {

        Map<String, String> param = new HashMap<>();
        param.put("page",page);
        param.put("page_size", page_size);

        StackoverflowSitesDto sitesDto = restTemplate.getForObject(URL, StackoverflowSitesDto.class, param);
        return sitesDto.getItems().stream().map(this::stackoverflowSitesDto).collect(Collectors.toList());
    }


        private SiteDto stackoverflowSitesDto(@NonNull SiteDto siteDto) {
        String substring = siteDto.getFavicon_url()
                .substring("https://".length(), siteDto.getFavicon_url().length() - ".iso".length());
            SiteDto dto = new SiteDto(substring, siteDto.getAudience(), siteDto.getName());
            return dto;

        }


}


