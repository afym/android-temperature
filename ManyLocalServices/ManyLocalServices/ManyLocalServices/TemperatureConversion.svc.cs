using ManyLocalServices.Services.Conversions.ResponseObjects;
using ManyLocalServices.Services.Conversions.TemperatureOperation;

namespace ManyLocalServices
{
    public class TemperatureConversion : ITemperatureConversion
    {
        public Conversion FromFahrenheitToCelsius(string Temperature)
        {
            return TOperation.GetResponse("FahrenheitToCelsiusConversion", Temperature);
        }
        public Conversion FromFahrenheitToKelvin(string Temperature)
        {
            return TOperation.GetResponse("FahrenheitToKelvinConversion", Temperature);
        }
        public Conversion FromCelsiusToFahrenheit(string Temperature)
        {
            return TOperation.GetResponse("CelsiusToFahrenheitConversion", Temperature);
        }
        public Conversion FromCelsiusToKelvin(string Temperature)
        {
            return TOperation.GetResponse("CelsiusToKelvinConversion", Temperature);
        }
        public Conversion FromKelvinToFahrenheit(string Temperature)
        {
            return TOperation.GetResponse("KelvinToFahrenheitConversion", Temperature);
        }
        public Conversion FromKelvinToCelcius(string Temperature)
        {
            return TOperation.GetResponse("KelvinToCelciusConversion", Temperature);
        }
    }
}
