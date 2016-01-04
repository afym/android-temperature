using System;
using ManyLocalServices.Services.Conversions.ResponseObjects;
using ManyLocalServices.Services.Conversions.TemperaturePrototype;
using ManyLocalServices.Services.Conversions.TemperatureFactory;

namespace ManyLocalServices.Services.Conversions.TemperatureOperation
{
    public class TOperation
    {
        private static readonly string OK_MESSAGE = "The operation was success";
        private static readonly string ERROR_MESSAGE = "The operation is wrong";
        public static Conversion GetResponse(string Conversion, string Temperature)
        {
            Conversion response = new Conversion();
            GeneralConversion general = TConversionFactory.BuildConversion(Conversion, Temperature);
            TemperatureDecorator decorator = new TemperatureDecorator(general);

            if (general.IsConvertSuccess)
            {
                response.Message = OK_MESSAGE;
                response.Result = decorator.GetTemperature();
            }
            else 
            {
                response.Message = ERROR_MESSAGE;
                response.Result = 0;
            }

            response.Status = general.IsConvertSuccess;

            // Puesto para simular la demora de 3 segundos del lado del servidor
            System.Threading.Thread.Sleep(3000);

            return response;
        }
    }
}