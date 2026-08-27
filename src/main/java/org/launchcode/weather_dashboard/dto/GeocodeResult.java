package org.launchcode.weather_dashboard.dto;

// DTO for Geocoding API response payload

public record GeocodeResult(double lat,
                            double lon) {
}
