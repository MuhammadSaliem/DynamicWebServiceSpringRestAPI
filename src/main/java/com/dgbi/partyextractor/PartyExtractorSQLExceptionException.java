
/**
 * PartyExtractorSQLExceptionException.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */

package com.dgbi.partyextractor;

public class PartyExtractorSQLExceptionException extends Exception{

    private static final long serialVersionUID = 1676357342994L;
    
    private com.dgbi.partyextractor.PartyExtractorStub.PartyExtractorSQLException faultMessage;

    
        public PartyExtractorSQLExceptionException() {
            super("PartyExtractorSQLExceptionException");
        }

        public PartyExtractorSQLExceptionException(String s) {
           super(s);
        }

        public PartyExtractorSQLExceptionException(String s, Throwable ex) {
          super(s, ex);
        }

        public PartyExtractorSQLExceptionException(Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(com.dgbi.partyextractor.PartyExtractorStub.PartyExtractorSQLException msg){
       faultMessage = msg;
    }
    
    public com.dgbi.partyextractor.PartyExtractorStub.PartyExtractorSQLException getFaultMessage(){
       return faultMessage;
    }
}
    