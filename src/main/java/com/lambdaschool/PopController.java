package com.lambdaschool;

import com.lambdaschool.countries.CountriesApplication;
import com.lambdaschool.countries.Country;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.Array;
import java.util.ArrayList;

@RestController
@RequestMapping("/population")
public class PopController
{
    @RequestMapping("/size")
    public ArrayList<Country> getByPopSize(@RequestParam(value="people") long people)
    {
        return CountriesApplication.ourCountryList.equalorGreaterPop(people);
    }

    @RequestMapping("/min")
    public Country smallestPop()
    {
        return CountriesApplication.ourCountryList.smallestPopCountry();
    }

    @RequestMapping("/max")
    public Country largestPop()
    {
        return CountriesApplication.ourCountryList.smallestPopCountry();
    }
}
