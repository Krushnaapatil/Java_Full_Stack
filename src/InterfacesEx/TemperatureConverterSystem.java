package InterfacesEx;

interface TemperatureConverter {
	double convert(double celsius);
}
public class TemperatureConverterSystem {

	public static void main(String[] args) {
		TemperatureConverter temperatureConverter = (celsius) -> (celsius * 9/5) + 32;
		
		System.out.println("Temperature in Fahrenheit = " + temperatureConverter.convert(23.44));
	}

}
