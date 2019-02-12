package com.lambdaschool;

import com.lambdaschool.countries.CountriesApplication;
import com.lambdaschool.countries.Country;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping("/age")
public class AgeController
{
    @RequestMapping("/size")
    public ArrayList<Country> getByAge(@RequestParam(value="age") int age)
    {
        return CountriesApplication.ourCountryList.equalorGreaterAge(age);
    }

    @RequestMapping("/min")
    public Country smallestAge()
    {
        return CountriesApplication.ourCountryList.smallestAgeCountry();
    }

    @RequestMapping("/max")
    public Country largestAge()
    {
        return CountriesApplication.ourCountryList.smallestAgeCountry();
    }
}
