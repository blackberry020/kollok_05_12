package org.example.creators;

import org.example.converters.BaseTempConverter;
import org.example.converters.FahrenheitConverter;

public class FahrenheitProcessor extends Processor {
    public BaseTempConverter createConverter() {
        return new FahrenheitConverter();
    }
}
