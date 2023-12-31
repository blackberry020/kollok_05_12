package org.example.creators;

import org.example.converters.BaseTempConverter;

public abstract class Processor {

    public double process(int degreesCelsius) {
        BaseTempConverter converter = createConverter();
        return converter.convert(degreesCelsius);
    }

    public abstract BaseTempConverter createConverter();
}
