using System.ServiceModel;
using System.ServiceModel.Web;
using ManyLocalServices.Services.Conversions.ResponseObjects;

namespace ManyLocalServices
{
    [ServiceContract]
    public interface ITemperatureConversion
    {
        [OperationContract]
        [WebInvoke(Method = "GET", UriTemplate = "/FahrenheitToCelsius/{Temperature}",
            RequestFormat = WebMessageFormat.Json, ResponseFormat = WebMessageFormat.Json,
            BodyStyle = WebMessageBodyStyle.Wrapped)]
        [return: MessageParameter(Name = "Response")]
        Conversion FromFahrenheitToCelsius(string Temperature);
        [OperationContract]
        [WebInvoke(Method = "GET", UriTemplate = "/FahrenheitToKelvin/{Temperature}",
         RequestFormat = WebMessageFormat.Json, ResponseFormat = WebMessageFormat.Json,
         BodyStyle = WebMessageBodyStyle.Wrapped)]
        [return: MessageParameter(Name = "Response")]
        Conversion FromFahrenheitToKelvin(string Temperature);
        [OperationContract]
        [WebInvoke(Method = "GET", UriTemplate = "/CelsiusToFahrenheit/{Temperature}",
         RequestFormat = WebMessageFormat.Json, ResponseFormat = WebMessageFormat.Json,
         BodyStyle = WebMessageBodyStyle.Wrapped)]
        [return: MessageParameter(Name = "Response")]
        Conversion FromCelsiusToFahrenheit(string Temperature);
        [OperationContract]
        [WebInvoke(Method = "GET", UriTemplate = "/CelsiusToKelvin/{Temperature}",
         RequestFormat = WebMessageFormat.Json, ResponseFormat = WebMessageFormat.Json,
         BodyStyle = WebMessageBodyStyle.Wrapped)]
        [return: MessageParameter(Name = "Response")]
        Conversion FromCelsiusToKelvin(string Temperature);
        [OperationContract]
        [WebInvoke(Method = "GET", UriTemplate = "/KelvinToFahrenheit/{Temperature}",
         RequestFormat = WebMessageFormat.Json, ResponseFormat = WebMessageFormat.Json,
         BodyStyle = WebMessageBodyStyle.Wrapped)]
        [return: MessageParameter(Name = "Response")]
        Conversion FromKelvinToFahrenheit(string Temperature);
        [OperationContract]
        [WebInvoke(Method = "GET", UriTemplate = "/KelvinToCelsius/{Temperature}",
         RequestFormat = WebMessageFormat.Json, ResponseFormat = WebMessageFormat.Json,
         BodyStyle = WebMessageBodyStyle.Wrapped)]
        [return: MessageParameter(Name = "Response")]
        Conversion FromKelvinToCelcius(string Temperature);
    }
}
