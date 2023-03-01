
/**
 * PartyExtractorParseExceptionException.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */

package com.dgbi.partyextractor;

public class PartyExtractorParseExceptionException extends Exception{

    private static final long serialVersionUID = 1676357342985L;
    
    private com.dgbi.partyextractor.PartyExtractorStub.PartyExtractorParseException faultMessage;

    
        public PartyExtractorParseExceptionException() {
            super("PartyExtractorParseExceptionException");
        }

        public PartyExtractorParseExceptionException(String s) {
           super(s);
        }

        public PartyExtractorParseExceptionException(String s, Throwable ex) {
          super(s, ex);
        }

        public PartyExtractorParseExceptionException(Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(com.dgbi.partyextractor.PartyExtractorStub.PartyExtractorParseException msg){
       faultMessage = msg;
    }
    
    public com.dgbi.partyextractor.PartyExtractorStub.PartyExtractorParseException getFaultMessage(){
       return faultMessage;
    }
}
    