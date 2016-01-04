using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ManyLocalServices.Services.Conversions.TemperaturePrototype
{
    abstract public class GeneralConversion : ITemperature
    {
        public double Temperature {set; get;}
        public bool IsConvertSuccess { set; get; }

        public GeneralConversion(string Temperature) 
        {
            try 
            {
                this.Temperature = Convert.ToDouble(Temperature);
                this.IsConvertSuccess = true;
            }
            catch(FormatException e)
            {
                this.IsConvertSuccess = false;
            }
        }

        abstract public double GetTemperature();
    }
}
