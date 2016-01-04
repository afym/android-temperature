using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using ManyLocalServices.Services.Conversions.TemperaturePrototype;

namespace ManyLocalServices.Services.Conversions.TemperatureFactory
{
    public class TConversionFactory
    {
        public static GeneralConversion BuildConversion (string ConversionName, string Temperature)
        {
            GeneralConversion conversion = (GeneralConversion)Activator.CreateInstance(Type.GetType(GetClassName(ConversionName)), Temperature);
            return conversion;
        }

        private static string GetClassName(string ConversionName) 
        {
            return "ManyLocalServices.Services.Conversions.TemperaturePrototype." + ConversionName;
        }
    }
}