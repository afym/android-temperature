using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;

namespace ManyLocalServices.Services.Conversions.TemperaturePrototype
{
    public class TemperatureDecorator : ITemperature
    {
        public GeneralConversion Conversion {set; get;}
        public TemperatureDecorator(GeneralConversion Conversion) 
        {
            this.Conversion = Conversion;
        }

        public double GetTemperature() 
        {
            return Math.Round(this.Conversion.GetTemperature(), 2);
        }
    }
}