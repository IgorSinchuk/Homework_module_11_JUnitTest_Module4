import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;


public class WeatherTest {

   private Weather weather;
    @Test
    public void testFromCelsiusToFahrenheit() throws Exception {

        final double result = weather.fromCelsiusToFahrenheit(34);
        Assert.assertEquals(93, (int) result);



    }

    @Test
    public void testFromFahrenheitToCelsius() throws Exception {

        final double result = weather.fromFahrenheitToCelsius(100);
        Assert.assertEquals(37, (int) result);

    }
}