package example;/**
 * Created by Ben on 2/17/2017.
 */
public class HelloWorldClient {
  public static void main(String[] argv) {
      com.daehosting.temperatureconversions.TemperatureConversionsSoapType service = new com.daehosting.temperatureconversions.TemperatureConversions().getPort();
      //invoke business method
      service.celsiusToFahrenheit();  
  }
}
