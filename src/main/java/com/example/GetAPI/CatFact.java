package com.example.GetAPI;

import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;

@Component
public class CatFact {
    String fact;
    int length;


    public CatFact()
    {

    }

    public String getFact() {
        return fact;
    }

    public void setFact(String fact) {
        this.fact = fact;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "MeowFact{" +
                "fact='" + fact + '\'' +
                ", length=" + length +
                '}';
    }

    public CatFact getFacts(String url) {
        WebClient.Builder builder = WebClient.builder();

        return builder.build()
                .get()
                .uri(url)
                .retrieve()
                .bodyToMono(CatFact.class)
                .block();
    }
}
