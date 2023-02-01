package com.dell.currencyservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrencyController {
	
	@GetMapping("/currency/{country}")
	public String findCurrency(@PathVariable("country") String country) {
		String currency = "INR";
		System.out.println("The country selected is "+ country);
		if(country.equalsIgnoreCase("India"))
			currency = "INR";
		else if(country.equalsIgnoreCase("US"))
			currency = "USD";
		else if(country.equalsIgnoreCase("UK"))
			currency = "POUND";
		else if(country.equalsIgnoreCase("GERMANY"))
			currency = "EURO";
		return currency;
	}

}
