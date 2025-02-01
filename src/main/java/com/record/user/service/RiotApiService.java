package com.record.user.service;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.beans.factory.annotation.Value;

@Service 
public class RiotApiService {

    private final WebClient webClient;

    @Value("${riot.api-key}")
    private String apiKey;

    public RiotApiService(WebClient.Builder webClientBuilder) {
        this.webClient = webClientBuilder.baseUrl("https://kr.api.riotgames.com").build();
    }

    public String getSummonerInfo(String summonerName) {
        return webClient.get()
                .uri(uriBuilder -> uriBuilder
                        .path("/lol/summoner/v4/summoners/by-name/{summonerName}")
                        .build(summonerName))
                .header("X-Riot-Token", apiKey)
                .retrieve()
                .bodyToMono(String.class)
                .block();
    }
}
