package com.record.user.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.record.user.service.RiotApiService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;



@RestController
@RequestMapping("/api/riot")
public class RiotController {
    private final RiotApiService riotApiService;

    public RiotController(RiotApiService riotApiService) {
        this.riotApiService = riotApiService;
    }


    @GetMapping("/summoner/{summonerName}")
    public String getSummoner(@PathVariable String summonerName){
        return riotApiService.getSummonerInfo(summonerName);
    }    
}
