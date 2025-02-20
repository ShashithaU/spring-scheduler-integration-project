package edu.icet.service;

import edu.icet.model.Country;
import edu.icet.model.CountryResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

@Service
@RequiredArgsConstructor
public class CountryService {

    final RestTemplate restTemplate;

    public List<CountryResponse> getCountries() {

     CountryResponse[] countryList =  restTemplate.getForObject("https://restcountries.com/v3.1/all", CountryResponse[].class);
        return Arrays.asList(countryList);
    }
}
