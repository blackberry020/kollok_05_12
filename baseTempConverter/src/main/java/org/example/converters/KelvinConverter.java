package org.example;

public class KelvinConverter implements BaseTempConverter {
    @Override
    public double convert(int degreesCelsius) {
        return 273.15 + degreesCelsius;
    }
}
