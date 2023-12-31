package org.example;

public class FahrenheitConverter implements BaseTempConverter {
    @Override
    public double convert(int degreesCelsius) {
        return degreesCelsius * 1.8 + 32;
    }
}
