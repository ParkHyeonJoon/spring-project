package com.project.netplix2.client;

import lombok.RequiredArgsConstructor;
import org.apache.commons.collections4.MultiValuedMap;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Component;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;

import java.util.Map;

@Component
@RequiredArgsConstructor
public class TmdbHttpClient {

    private final HttpClient httpClient;

    @Value("${tmdb.auth.access-token}")
    private String accessToken;

    public String request(String uri, HttpMethod method, MultiValueMap headers, Map<String, Object> params) {
        MultiValueMap<String, String> multiValuedMap = new LinkedMultiValueMap<>();
        multiValuedMap.add(HttpHeaders.ACCEPT, "application/json");
        multiValuedMap.add(HttpHeaders.AUTHORIZATION, "Bearer " + accessToken);
        multiValuedMap.addAll(headers);

        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.addAll(multiValuedMap);

        return httpClient.request(uri, method, httpHeaders, params);
    }
}
