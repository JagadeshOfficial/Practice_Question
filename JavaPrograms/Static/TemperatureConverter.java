package Static;

public class TemperatureConverter {

	public static double celsiusToFahrenheit(double celsius)
	{
		return (celsius * 9/5)+32;
	}
	public static double fahrenheitToCelsius(double fahrenheit)
	{
		return (fahrenheit - 32) * 5/9;
	}
	
	public static void main(String[] args) {
		
		System.out.println("celsiusToFahrenheit is : "+celsiusToFahrenheit(25));
		System.out.println("fahrenheitToCelsius is : "+fahrenheitToCelsius(50));

	}

}
