using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;

namespace ManyLocalServices.Services.Conversions.TemperaturePrototype
{
    public class CelsiusToFahrenheitConversion : GeneralConversion
    {
        public CelsiusToFahrenheitConversion(string Temperature) : 
            base(Temperature)
        {

        }

        public override double GetTemperature() 
        {
            return (this.Temperature * 9) / 5 + 32;
        }
    }
}