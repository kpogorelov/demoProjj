package com.example.demoprojj.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SiteDto {
    private String favicon_url;
    private String audience;
    private String name;
}
