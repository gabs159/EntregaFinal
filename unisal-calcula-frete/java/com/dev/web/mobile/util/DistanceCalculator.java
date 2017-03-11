package com.dev.web.mobile.util;

import com.dev.web.mobile.model.City;

public interface DistanceCalculator {
	double calculateDistanceInKilometers(City from, City to);
	double calculateDistanceInMilles(City from, City to);
}