package com.dev.web.mobile.interfaces;

import com.dev.web.mobile.model.City;

/**
 * 
 * @author JETHER ROIS
 *
 */
public interface DistanceCalculator {
	double calculateDistanceInKilometers(City from, City to);
	double calculateDistanceInMilles(City from, City to);
}
