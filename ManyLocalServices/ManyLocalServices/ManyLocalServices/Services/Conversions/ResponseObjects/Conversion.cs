using System.Runtime.Serialization;

namespace ManyLocalServices.Services.Conversions.ResponseObjects
{
    ///-----------------------------------------------------------------
    ///   Namespace:      ManyLocalServices.Services.Conversions.ResponseObjects
    ///   Class:          Conversion
    ///   Description:    Response object
    ///   Author:         afym
    ///-----------------------------------------------------------------
    [DataContract]
    public class Conversion
    {
        [DataMember]
        public bool Status { set; get; }
        [DataMember]
        public string Message { set; get; }
        [DataMember]
        public double Result { set; get; }
    }
}