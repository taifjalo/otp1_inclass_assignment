public class Main {

    // testing func
    public static void main(String[] args) {
        TemperatureConverter temperatureConverter = new TemperatureConverter();

        double test1 = temperatureConverter.fahrenheitToCelcius(30.0);
        double test2 = temperatureConverter.celsiusToFahrenheit(20.0);
        double test3 = temperatureConverter.kelvinToCelsius(40.0);
        boolean test4 = temperatureConverter.isExtremeTemperature(20);
        System.out.println(test1 + test2 + test3);
    }
}
