using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;

namespace ManyLocalServices.Services.Conversions.TemperaturePrototype
{
    public class FahrenheitToKelvinConversion : GeneralConversion
    {
        public FahrenheitToKelvinConversion(string Temperature)
            : base(Temperature)
        {

        }
        public override double GetTemperature() 
        {
            return ((this.Temperature - 32) * 5) / 9 + 273.15;
        }
    }
}