using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;

namespace ManyLocalServices.Services.Conversions.TemperaturePrototype
{
    public class FahrenheitToCelsiusConversion : GeneralConversion
    {
        public FahrenheitToCelsiusConversion(string Temperature)
            : base(Temperature)
        {

        }
        public override double GetTemperature() 
        {
            return ((this.Temperature - 32) * 5) / 9;
        }
    }
}