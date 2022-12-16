package com.example.demoprojj.config;

import org.apache.hc.client5.http.classic.HttpClient;
import org.apache.hc.client5.http.impl.classic.HttpClientBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.http.client.ClientHttpRequestFactory;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@org.springframework.context.annotation.Configuration
@ComponentScan
public class Configuration {

    @Bean
    public HttpClient httpClient(){
        HttpClient httpClient = HttpClientBuilder.create().build();
        return httpClient;
    }

    @Bean
    public ClientHttpRequestFactory httpRequestFactory(){
        ClientHttpRequestFactory factory = new HttpComponentsClientHttpRequestFactory(httpClient());
        return factory;
    }

    @Bean
    public RestTemplate restTemplate(){
        RestTemplate restTemplate = new RestTemplate(httpRequestFactory());
        return restTemplate;
    }

}
