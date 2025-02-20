package edu.icet.controller;

import edu.icet.model.Country;
import edu.icet.model.CountryResponse;
import edu.icet.service.CountryService;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class CountryController {
    final CountryService countryService;

    @GetMapping
    List<CountryResponse> getCountries() {
        return countryService.getCountries();
    }


}
