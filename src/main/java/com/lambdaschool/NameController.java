package com.lambdaschool;

import com.lambdaschool.countries.CountriesApplication;
import com.lambdaschool.countries.Country;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

// /names
@RestController
@RequestMapping("/names")
public class NameController
{
    @RequestMapping("/begin")
    public ArrayList<Country> getByFirstLetters(@RequestParam(value="letter") String letter)
    {
        return CountriesApplication.ourCountryList.startsWithLetter(letter);
    }

    @RequestMapping("/size")
    public ArrayList<Country> getByFirstSet(@RequestParam(value="letters") String letters)
    {
        return CountriesApplication.ourCountryList.startsWithLetter(letters);
    }

    @RequestMapping("/all")
    public ArrayList<Country> getAllCountries()
    {
        CountriesApplication.ourCountryList.countryList.sort((c1, c2) ->
                c1.getName().compareToIgnoreCase(c2.getName()));
        return CountriesApplication.ourCountryList.countryList;
    }
}
