package com.example.GetAPI;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.List;

@Component
public class DogFact {
    @JsonProperty("data")
    private List<FactData> data;

    public List<FactData> getData() {
        return data;
    }

    public void setData(List<FactData> data) {
        this.data = data;
    }

    public DogFact getFacts(String url) {
        WebClient.Builder builder = WebClient.builder();

        return builder.build()
                .get()
                .uri(url)
                .retrieve()
                .bodyToMono(DogFact.class)
                .block();
    }

    public static class FactData {
        private String id;
        private String type;
        private FactAttributes attributes;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public FactAttributes getAttributes() {
            return attributes;
        }

        public void setAttributes(FactAttributes attributes) {
            this.attributes = attributes;
        }
    }

    public static class FactAttributes {
        private String body;

        public String getBody() {
            return body;
        }

        public void setBody(String body) {
            this.body = body;
        }
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (FactData factData : data) {
            result.append("ID: ").append(factData.getId()).append("\n");
            result.append("Type: ").append(factData.getType()).append("\n");
            result.append("Body: ").append(factData.getAttributes().getBody()).append("\n");
        }
        return result.toString();
    }

}
