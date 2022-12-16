package com.example.demoprojj.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.swing.event.ListDataEvent;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class StackoverflowSitesDto {
    List<SiteDto> items;

}
