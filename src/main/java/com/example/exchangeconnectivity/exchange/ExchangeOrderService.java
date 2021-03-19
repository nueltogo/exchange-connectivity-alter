package com.example.exchangeconnectivity.exchange;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.web.client.RestTemplate;

public class ExchangeOrderService {

    public void persistToDb(ExchangeOrder exchangeOrder) throws JsonProcessingException {
        final String API_URL = "https://tradeenginedb.herokuapp.com/api/v1/exchangeorder";
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.postForObject(API_URL, exchangeOrder, ExchangeOrder.class);
    }
}
