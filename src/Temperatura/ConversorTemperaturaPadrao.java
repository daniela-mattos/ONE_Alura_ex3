package Temperatura;

public class ConversorTemperaturaPadrao implements ConversorTemperatura {
    @Override
    public double celsiusParaFahrenheit(double c) {
        return (c*1.8)+32;
    }

    @Override
    public double fahrenheitParaCelsius(double f) {
        return (f-32)/1.8;
    }
}
