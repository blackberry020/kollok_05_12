package org.example.creators;

import org.example.converters.BaseTempConverter;
import org.example.converters.KelvinConverter;

public class KelvinProcessor extends Processor {
    public BaseTempConverter createConverter() {
        return new KelvinConverter();
    }
}
