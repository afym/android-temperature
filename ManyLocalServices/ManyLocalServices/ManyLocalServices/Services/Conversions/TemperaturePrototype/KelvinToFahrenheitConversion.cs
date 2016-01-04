using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;

namespace ManyLocalServices.Services.Conversions.TemperaturePrototype
{
    public class KelvinToFahrenheitConversion : GeneralConversion
    {
        public KelvinToFahrenheitConversion(string Temperature)
            : base(Temperature)
        {

        }
        public override double GetTemperature() 
        {
            return ((this.Temperature - 273.15) * 9) / 5 + 32;
        }
    }
}