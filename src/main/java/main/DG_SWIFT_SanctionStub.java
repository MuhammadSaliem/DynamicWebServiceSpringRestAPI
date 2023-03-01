
/**
 * DG_SWIFT_SanctionStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */
        package main;

        

        /*
        *  DG_SWIFT_SanctionStub java implementation
        */

        
        public class DG_SWIFT_SanctionStub extends org.apache.axis2.client.Stub
        {
        protected org.apache.axis2.description.AxisOperation[] _operations;

        //hashmaps to keep the fault mapping
        private java.util.HashMap faultExceptionNameMap = new java.util.HashMap();
        private java.util.HashMap faultExceptionClassNameMap = new java.util.HashMap();
        private java.util.HashMap faultMessageMap = new java.util.HashMap();

        private static int counter = 0;

        private static synchronized String getUniqueSuffix(){
            // reset the counter if it is greater than 99999
            if (counter > 99999){
                counter = 0;
            }
            counter = counter + 1; 
            return Long.toString(System.currentTimeMillis()) + "_" + counter;
        }

    
    private void populateAxisService() throws org.apache.axis2.AxisFault {

     //creating the Service with a unique name
     _service = new org.apache.axis2.description.AxisService("DG_SWIFT_Sanction" + getUniqueSuffix());
     addAnonymousOperations();

        //creating the operations
        org.apache.axis2.description.AxisOperation __operation;

        _operations = new org.apache.axis2.description.AxisOperation[1];
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://main", "searchWatchList"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[0]=__operation;
            
        
        }

    //populates the faults
    private void populateFaults(){
         


    }

    /**
      *Constructor that takes in a configContext
      */

    public DG_SWIFT_SanctionStub(org.apache.axis2.context.ConfigurationContext configurationContext,
       String targetEndpoint)
       throws org.apache.axis2.AxisFault {
         this(configurationContext,targetEndpoint,false);
   }


   /**
     * Constructor that takes in a configContext  and useseperate listner
     */
   public DG_SWIFT_SanctionStub(org.apache.axis2.context.ConfigurationContext configurationContext,
        String targetEndpoint, boolean useSeparateListener)
        throws org.apache.axis2.AxisFault {
         //To populate AxisService
         populateAxisService();
         populateFaults();

        _serviceClient = new org.apache.axis2.client.ServiceClient(configurationContext,_service);
        
	
        _serviceClient.getOptions().setTo(new org.apache.axis2.addressing.EndpointReference(
                targetEndpoint));
        _serviceClient.getOptions().setUseSeparateListener(useSeparateListener);
        
            //Set the soap version
            _serviceClient.getOptions().setSoapVersionURI(org.apache.axiom.soap.SOAP12Constants.SOAP_ENVELOPE_NAMESPACE_URI);
        
    
    }

    /**
     * Default Constructor
     */
    public DG_SWIFT_SanctionStub(org.apache.axis2.context.ConfigurationContext configurationContext) throws org.apache.axis2.AxisFault {
        
                    this(configurationContext,"http://localhost:91/DG_SNCT/services/DG_SWIFT_Sanction.DG_SWIFT_SanctionHttpSoap12Endpoint/" );
                
    }

    /**
     * Default Constructor
     */
    public DG_SWIFT_SanctionStub() throws org.apache.axis2.AxisFault {
        
                    this("http://localhost:91/DG_SNCT/services/DG_SWIFT_Sanction.DG_SWIFT_SanctionHttpSoap12Endpoint/" );
                
    }

    /**
     * Constructor taking the target endpoint
     */
    public DG_SWIFT_SanctionStub(String targetEndpoint) throws org.apache.axis2.AxisFault {
        this(null,targetEndpoint);
    }



        
                    /**
                     * Auto generated method signature

                    
                     */

                    

                            public  main.DG_SWIFT_SanctionStub.SearchWatchListResponse searchWatchList(

                            main.DG_SWIFT_SanctionStub.SearchWatchList searchWatchList0)
                        

                    throws java.rmi.RemoteException
                    
                    {
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[0].getName());
              _operationClient.getOptions().setAction("urn:searchWatchList");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    searchWatchList0,
                                                    optimizeContent(new javax.xml.namespace.QName("http://main",
                                                    "searchWatchList")), new javax.xml.namespace.QName("http://main",
                                                    "searchWatchList"));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             main.DG_SWIFT_SanctionStub.SearchWatchListResponse.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (main.DG_SWIFT_SanctionStub.SearchWatchListResponse)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"searchWatchList"))){
                    //make the fault by reflection
                    try{
                        String exceptionClassName = (String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"searchWatchList"));
                        Class exceptionClass = Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(String.class);
                        Exception ex = (Exception) constructor.newInstance(f.getMessage());
                        //message class
                        String messageClassName = (String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"searchWatchList"));
                        Class messageClass = Class.forName(messageClassName);
                        Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new Class[]{messageClass});
                        m.invoke(ex,new Object[]{messageObject});
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                if (_messageContext.getTransportOut() != null) {
                      _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                }
            }
        }
            
                /**
                * Auto generated method signature for Asynchronous Invocations
                * 

                
                */
                public  void startsearchWatchList(

                 main.DG_SWIFT_SanctionStub.SearchWatchList searchWatchList0,

                  final main.DG_SWIFT_SanctionCallbackHandler callback)

                throws java.rmi.RemoteException{

              org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[0].getName());
             _operationClient.getOptions().setAction("urn:searchWatchList");
             _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              


              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env=null;
              final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

                    
                                    //Style is Doc.
                                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    searchWatchList0,
                                                    optimizeContent(new javax.xml.namespace.QName("http://main",
                                                    "searchWatchList")), new javax.xml.namespace.QName("http://main",
                                                    "searchWatchList"));
                                                
        // adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);


                    
                        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
                            public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
                            try {
                                org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();
                                
                                        Object object = fromOM(resultEnv.getBody().getFirstElement(),
                                                                         main.DG_SWIFT_SanctionStub.SearchWatchListResponse.class,
                                                                         getEnvelopeNamespaces(resultEnv));
                                        callback.receiveResultsearchWatchList(
                                        (main.DG_SWIFT_SanctionStub.SearchWatchListResponse)object);
                                        
                            } catch (org.apache.axis2.AxisFault e) {
                                callback.receiveErrorsearchWatchList(e);
                            }
                            }

                            public void onError(Exception error) {
								if (error instanceof org.apache.axis2.AxisFault) {
									org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
									org.apache.axiom.om.OMElement faultElt = f.getDetail();
									if (faultElt!=null){
										if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"searchWatchList"))){
											//make the fault by reflection
											try{
													String exceptionClassName = (String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"searchWatchList"));
													Class exceptionClass = Class.forName(exceptionClassName);
													java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(String.class);
                                                    Exception ex = (Exception) constructor.newInstance(f.getMessage());
													//message class
													String messageClassName = (String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"searchWatchList"));
														Class messageClass = Class.forName(messageClassName);
													Object messageObject = fromOM(faultElt,messageClass,null);
													java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
															new Class[]{messageClass});
													m.invoke(ex,new Object[]{messageObject});
													
					
										            callback.receiveErrorsearchWatchList(new java.rmi.RemoteException(ex.getMessage(), ex));
                                            } catch(ClassCastException e){
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorsearchWatchList(f);
                                            } catch (ClassNotFoundException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorsearchWatchList(f);
                                            } catch (NoSuchMethodException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorsearchWatchList(f);
                                            } catch (java.lang.reflect.InvocationTargetException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorsearchWatchList(f);
                                            } catch (IllegalAccessException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorsearchWatchList(f);
                                            } catch (InstantiationException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorsearchWatchList(f);
                                            } catch (org.apache.axis2.AxisFault e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorsearchWatchList(f);
                                            }
									    } else {
										    callback.receiveErrorsearchWatchList(f);
									    }
									} else {
									    callback.receiveErrorsearchWatchList(f);
									}
								} else {
								    callback.receiveErrorsearchWatchList(error);
								}
                            }

                            public void onFault(org.apache.axis2.context.MessageContext faultContext) {
                                org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                                onError(fault);
                            }

                            public void onComplete() {
                                try {
                                    _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                                } catch (org.apache.axis2.AxisFault axisFault) {
                                    callback.receiveErrorsearchWatchList(axisFault);
                                }
                            }
                });
                        

          org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if ( _operations[0].getMessageReceiver()==null &&  _operationClient.getOptions().isUseSeparateListener()) {
           _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
          _operations[0].setMessageReceiver(
                    _callbackReceiver);
        }

           //execute the operation client
           _operationClient.execute(false);

                    }
                


       /**
        *  A utility method that copies the namepaces from the SOAPEnvelope
        */
       private java.util.Map getEnvelopeNamespaces(org.apache.axiom.soap.SOAPEnvelope env){
        java.util.Map returnMap = new java.util.HashMap();
        java.util.Iterator namespaceIterator = env.getAllDeclaredNamespaces();
        while (namespaceIterator.hasNext()) {
            org.apache.axiom.om.OMNamespace ns = (org.apache.axiom.om.OMNamespace) namespaceIterator.next();
            returnMap.put(ns.getPrefix(),ns.getNamespaceURI());
        }
       return returnMap;
    }

    
    
    private javax.xml.namespace.QName[] opNameArray = null;
    private boolean optimizeContent(javax.xml.namespace.QName opName) {
        

        if (opNameArray == null) {
            return false;
        }
        for (int i = 0; i < opNameArray.length; i++) {
            if (opName.equals(opNameArray[i])) {
                return true;   
            }
        }
        return false;
    }
     //http://localhost:91/DG_SNCT/services/DG_SWIFT_Sanction.DG_SWIFT_SanctionHttpSoap12Endpoint/
        public static class WatchListEntity
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = WatchListEntity
                Namespace URI = http://main/xsd
                Namespace Prefix = ns1
                */
            

                        /**
                        * field for Address
                        */

                        
                                    protected String localAddress ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localAddressTracker = false ;

                           public boolean isAddressSpecified(){
                               return localAddressTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  String getAddress(){
                               return localAddress;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Address
                               */
                               public void setAddress(String param){
                            localAddressTracker = true;
                                   
                                            this.localAddress=param;
                                    

                               }
                            

                        /**
                        * field for Age
                        */

                        
                                    protected int localAge ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localAgeTracker = false ;

                           public boolean isAgeSpecified(){
                               return localAgeTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return int
                           */
                           public  int getAge(){
                               return localAge;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Age
                               */
                               public void setAge(int param){
                            
                                       // setting primitive attribute tracker to true
                                       localAgeTracker =
                                       param != Integer.MIN_VALUE;
                                   
                                            this.localAge=param;
                                    

                               }
                            

                        /**
                        * field for AgeDate
                        */

                        
                                    protected String localAgeDate ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localAgeDateTracker = false ;

                           public boolean isAgeDateSpecified(){
                               return localAgeDateTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  String getAgeDate(){
                               return localAgeDate;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param AgeDate
                               */
                               public void setAgeDate(String param){
                            localAgeDateTracker = true;
                                   
                                            this.localAgeDate=param;
                                    

                               }
                            

                        /**
                        * field for Aliases
                        */

                        
                                    protected String localAliases ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localAliasesTracker = false ;

                           public boolean isAliasesSpecified(){
                               return localAliasesTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  String getAliases(){
                               return localAliases;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Aliases
                               */
                               public void setAliases(String param){
                            localAliasesTracker = true;
                                   
                                            this.localAliases=param;
                                    

                               }
                            

                        /**
                        * field for AlternativeSpelling
                        */

                        
                                    protected String localAlternativeSpelling ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localAlternativeSpellingTracker = false ;

                           public boolean isAlternativeSpellingSpecified(){
                               return localAlternativeSpellingTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  String getAlternativeSpelling(){
                               return localAlternativeSpelling;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param AlternativeSpelling
                               */
                               public void setAlternativeSpelling(String param){
                            localAlternativeSpellingTracker = true;
                                   
                                            this.localAlternativeSpelling=param;
                                    

                               }
                            

                        /**
                        * field for AvgMatchSensitivity
                        */

                        
                                    protected double localAvgMatchSensitivity ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localAvgMatchSensitivityTracker = false ;

                           public boolean isAvgMatchSensitivitySpecified(){
                               return localAvgMatchSensitivityTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return double
                           */
                           public  double getAvgMatchSensitivity(){
                               return localAvgMatchSensitivity;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param AvgMatchSensitivity
                               */
                               public void setAvgMatchSensitivity(double param){
                            
                                       // setting primitive attribute tracker to true
                                       localAvgMatchSensitivityTracker =
                                       !Double.isNaN(param);
                                   
                                            this.localAvgMatchSensitivity=param;
                                    

                               }
                            

                        /**
                        * field for BirthDate
                        */

                        
                                    protected String localBirthDate ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localBirthDateTracker = false ;

                           public boolean isBirthDateSpecified(){
                               return localBirthDateTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  String getBirthDate(){
                               return localBirthDate;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param BirthDate
                               */
                               public void setBirthDate(String param){
                            localBirthDateTracker = true;
                                   
                                            this.localBirthDate=param;
                                    

                               }
                            

                        /**
                        * field for Category
                        */

                        
                                    protected String localCategory ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localCategoryTracker = false ;

                           public boolean isCategorySpecified(){
                               return localCategoryTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  String getCategory(){
                               return localCategory;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Category
                               */
                               public void setCategory(String param){
                            localCategoryTracker = true;
                                   
                                            this.localCategory=param;
                                    

                               }
                            

                        /**
                        * field for CategoryDescription
                        */

                        
                                    protected String localCategoryDescription ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localCategoryDescriptionTracker = false ;

                           public boolean isCategoryDescriptionSpecified(){
                               return localCategoryDescriptionTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  String getCategoryDescription(){
                               return localCategoryDescription;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param CategoryDescription
                               */
                               public void setCategoryDescription(String param){
                            localCategoryDescriptionTracker = true;
                                   
                                            this.localCategoryDescription=param;
                                    

                               }
                            

                        /**
                        * field for ChangeBeginDate
                        */

                        
                                    protected String localChangeBeginDate ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localChangeBeginDateTracker = false ;

                           public boolean isChangeBeginDateSpecified(){
                               return localChangeBeginDateTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  String getChangeBeginDate(){
                               return localChangeBeginDate;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ChangeBeginDate
                               */
                               public void setChangeBeginDate(String param){
                            localChangeBeginDateTracker = true;
                                   
                                            this.localChangeBeginDate=param;
                                    

                               }
                            

                        /**
                        * field for ChangeCurrentInd
                        */

                        
                                    protected String localChangeCurrentInd ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localChangeCurrentIndTracker = false ;

                           public boolean isChangeCurrentIndSpecified(){
                               return localChangeCurrentIndTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  String getChangeCurrentInd(){
                               return localChangeCurrentInd;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ChangeCurrentInd
                               */
                               public void setChangeCurrentInd(String param){
                            localChangeCurrentIndTracker = true;
                                   
                                            this.localChangeCurrentInd=param;
                                    

                               }
                            

                        /**
                        * field for ChangeEndDate
                        */

                        
                                    protected String localChangeEndDate ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localChangeEndDateTracker = false ;

                           public boolean isChangeEndDateSpecified(){
                               return localChangeEndDateTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  String getChangeEndDate(){
                               return localChangeEndDate;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ChangeEndDate
                               */
                               public void setChangeEndDate(String param){
                            localChangeEndDateTracker = true;
                                   
                                            this.localChangeEndDate=param;
                                    

                               }
                            

                        /**
                        * field for CitizenShipCountryCode
                        */

                        
                                    protected String localCitizenShipCountryCode ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localCitizenShipCountryCodeTracker = false ;

                           public boolean isCitizenShipCountryCodeSpecified(){
                               return localCitizenShipCountryCodeTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  String getCitizenShipCountryCode(){
                               return localCitizenShipCountryCode;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param CitizenShipCountryCode
                               */
                               public void setCitizenShipCountryCode(String param){
                            localCitizenShipCountryCodeTracker = true;
                                   
                                            this.localCitizenShipCountryCode=param;
                                    

                               }
                            

                        /**
                        * field for CitizenShipCountryName
                        */

                        
                                    protected String localCitizenShipCountryName ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localCitizenShipCountryNameTracker = false ;

                           public boolean isCitizenShipCountryNameSpecified(){
                               return localCitizenShipCountryNameTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  String getCitizenShipCountryName(){
                               return localCitizenShipCountryName;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param CitizenShipCountryName
                               */
                               public void setCitizenShipCountryName(String param){
                            localCitizenShipCountryNameTracker = true;
                                   
                                            this.localCitizenShipCountryName=param;
                                    

                               }
                            

                        /**
                        * field for Citizenship
                        */

                        
                                    protected String localCitizenship ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localCitizenshipTracker = false ;

                           public boolean isCitizenshipSpecified(){
                               return localCitizenshipTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  String getCitizenship(){
                               return localCitizenship;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Citizenship
                               */
                               public void setCitizenship(String param){
                            localCitizenshipTracker = true;
                                   
                                            this.localCitizenship=param;
                                    

                               }
                            

                        /**
                        * field for Citizenshp
                        */

                        
                                    protected String localCitizenshp ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localCitizenshpTracker = false ;

                           public boolean isCitizenshpSpecified(){
                               return localCitizenshpTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  String getCitizenshp(){
                               return localCitizenshp;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Citizenshp
                               */
                               public void setCitizenshp(String param){
                            localCitizenshpTracker = true;
                                   
                                            this.localCitizenshp=param;
                                    

                               }
                            

                        /**
                        * field for CityName
                        */

                        
                                    protected String localCityName ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localCityNameTracker = false ;

                           public boolean isCityNameSpecified(){
                               return localCityNameTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  String getCityName(){
                               return localCityName;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param CityName
                               */
                               public void setCityName(String param){
                            localCityNameTracker = true;
                                   
                                            this.localCityName=param;
                                    

                               }
                            

                        /**
                        * field for Companies
                        */

                        
                                    protected String localCompanies ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localCompaniesTracker = false ;

                           public boolean isCompaniesSpecified(){
                               return localCompaniesTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  String getCompanies(){
                               return localCompanies;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Companies
                               */
                               public void setCompanies(String param){
                            localCompaniesTracker = true;
                                   
                                            this.localCompanies=param;
                                    

                               }
                            

                        /**
                        * field for Countries
                        */

                        
                                    protected String localCountries ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localCountriesTracker = false ;

                           public boolean isCountriesSpecified(){
                               return localCountriesTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  String getCountries(){
                               return localCountries;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Countries
                               */
                               public void setCountries(String param){
                            localCountriesTracker = true;
                                   
                                            this.localCountries=param;
                                    

                               }
                            

                        /**
                        * field for CountryCode
                        */

                        
                                    protected String localCountryCode ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localCountryCodeTracker = false ;

                           public boolean isCountryCodeSpecified(){
                               return localCountryCodeTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  String getCountryCode(){
                               return localCountryCode;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param CountryCode
                               */
                               public void setCountryCode(String param){
                            localCountryCodeTracker = true;
                                   
                                            this.localCountryCode=param;
                                    

                               }
                            

                        /**
                        * field for CountryName
                        */

                        
                                    protected String localCountryName ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localCountryNameTracker = false ;

                           public boolean isCountryNameSpecified(){
                               return localCountryNameTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  String getCountryName(){
                               return localCountryName;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param CountryName
                               */
                               public void setCountryName(String param){
                            localCountryNameTracker = true;
                                   
                                            this.localCountryName=param;
                                    

                               }
                            

                        /**
                        * field for CreateDate
                        */

                        
                                    protected String localCreateDate ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localCreateDateTracker = false ;

                           public boolean isCreateDateSpecified(){
                               return localCreateDateTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  String getCreateDate(){
                               return localCreateDate;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param CreateDate
                               */
                               public void setCreateDate(String param){
                            localCreateDateTracker = true;
                                   
                                            this.localCreateDate=param;
                                    

                               }
                            

                        /**
                        * field for CurrentVersion
                        */

                        
                                    protected boolean localCurrentVersion ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localCurrentVersionTracker = false ;

                           public boolean isCurrentVersionSpecified(){
                               return localCurrentVersionTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getCurrentVersion(){
                               return localCurrentVersion;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param CurrentVersion
                               */
                               public void setCurrentVersion(boolean param){
                            
                                       // setting primitive attribute tracker to true
                                       localCurrentVersionTracker =
                                       true;
                                   
                                            this.localCurrentVersion=param;
                                    

                               }
                            

                        /**
                        * field for Deceased
                        */

                        
                                    protected String localDeceased ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localDeceasedTracker = false ;

                           public boolean isDeceasedSpecified(){
                               return localDeceasedTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  String getDeceased(){
                               return localDeceased;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Deceased
                               */
                               public void setDeceased(String param){
                            localDeceasedTracker = true;
                                   
                                            this.localDeceased=param;
                                    

                               }
                            

                        /**
                        * field for DeceasedInd
                        */

                        
                                    protected String localDeceasedInd ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localDeceasedIndTracker = false ;

                           public boolean isDeceasedIndSpecified(){
                               return localDeceasedIndTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  String getDeceasedInd(){
                               return localDeceasedInd;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param DeceasedInd
                               */
                               public void setDeceasedInd(String param){
                            localDeceasedIndTracker = true;
                                   
                                            this.localDeceasedInd=param;
                                    

                               }
                            

                        /**
                        * field for Dobs
                        */

                        
                                    protected String localDobs ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localDobsTracker = false ;

                           public boolean isDobsSpecified(){
                               return localDobsTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  String getDobs(){
                               return localDobs;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Dobs
                               */
                               public void setDobs(String param){
                            localDobsTracker = true;
                                   
                                            this.localDobs=param;
                                    

                               }
                            

                        /**
                        * field for EddBIC
                        */

                        
                                    protected String localEddBIC ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localEddBICTracker = false ;

                           public boolean isEddBICSpecified(){
                               return localEddBICTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  String getEddBIC(){
                               return localEddBIC;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param EddBIC
                               */
                               public void setEddBIC(String param){
                            localEddBICTracker = true;
                                   
                                            this.localEddBIC=param;
                                    

                               }
                            

                        /**
                        * field for EddCountry
                        */

                        
                                    protected String localEddCountry ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localEddCountryTracker = false ;

                           public boolean isEddCountrySpecified(){
                               return localEddCountryTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  String getEddCountry(){
                               return localEddCountry;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param EddCountry
                               */
                               public void setEddCountry(String param){
                            localEddCountryTracker = true;
                                   
                                            this.localEddCountry=param;
                                    

                               }
                            

                        /**
                        * field for Editor
                        */

                        
                                    protected String localEditor ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localEditorTracker = false ;

                           public boolean isEditorSpecified(){
                               return localEditorTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  String getEditor(){
                               return localEditor;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Editor
                               */
                               public void setEditor(String param){
                            localEditorTracker = true;
                                   
                                            this.localEditor=param;
                                    

                               }
                            

                        /**
                        * field for Ei
                        */

                        
                                    protected String localEi ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localEiTracker = false ;

                           public boolean isEiSpecified(){
                               return localEiTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  String getEi(){
                               return localEi;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Ei
                               */
                               public void setEi(String param){
                            localEiTracker = true;
                                   
                                            this.localEi=param;
                                    

                               }
                            

                        /**
                        * field for Entered
                        */

                        
                                    protected String localEntered ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localEnteredTracker = false ;

                           public boolean isEnteredSpecified(){
                               return localEnteredTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  String getEntered(){
                               return localEntered;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Entered
                               */
                               public void setEntered(String param){
                            localEnteredTracker = true;
                                   
                                            this.localEntered=param;
                                    

                               }
                            

                        /**
                        * field for EntityName
                        */

                        
                                    protected String localEntityName ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localEntityNameTracker = false ;

                           public boolean isEntityNameSpecified(){
                               return localEntityNameTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  String getEntityName(){
                               return localEntityName;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param EntityName
                               */
                               public void setEntityName(String param){
                            localEntityNameTracker = true;
                                   
                                            this.localEntityName=param;
                                    

                               }
                            

                        /**
                        * field for EntityNameMatchSensitivity
                        */

                        
                                    protected int localEntityNameMatchSensitivity ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localEntityNameMatchSensitivityTracker = false ;

                           public boolean isEntityNameMatchSensitivitySpecified(){
                               return localEntityNameMatchSensitivityTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return int
                           */
                           public  int getEntityNameMatchSensitivity(){
                               return localEntityNameMatchSensitivity;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param EntityNameMatchSensitivity
                               */
                               public void setEntityNameMatchSensitivity(int param){
                            
                                       // setting primitive attribute tracker to true
                                       localEntityNameMatchSensitivityTracker =
                                       param != Integer.MIN_VALUE;
                                   
                                            this.localEntityNameMatchSensitivity=param;
                                    

                               }
                            

                        /**
                        * field for EntityTitle
                        */

                        
                                    protected String localEntityTitle ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localEntityTitleTracker = false ;

                           public boolean isEntityTitleSpecified(){
                               return localEntityTitleTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  String getEntityTitle(){
                               return localEntityTitle;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param EntityTitle
                               */
                               public void setEntityTitle(String param){
                            localEntityTitleTracker = true;
                                   
                                            this.localEntityTitle=param;
                                    

                               }
                            

                        /**
                        * field for EntityWatchListKey
                        */

                        
                                    protected String localEntityWatchListKey ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localEntityWatchListKeyTracker = false ;

                           public boolean isEntityWatchListKeySpecified(){
                               return localEntityWatchListKeyTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  String getEntityWatchListKey(){
                               return localEntityWatchListKey;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param EntityWatchListKey
                               */
                               public void setEntityWatchListKey(String param){
                            localEntityWatchListKeyTracker = true;
                                   
                                            this.localEntityWatchListKey=param;
                                    

                               }
                            

                        /**
                        * field for ExcludeInd
                        */

                        
                                    protected String localExcludeInd ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localExcludeIndTracker = false ;

                           public boolean isExcludeIndSpecified(){
                               return localExcludeIndTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  String getExcludeInd(){
                               return localExcludeInd;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ExcludeInd
                               */
                               public void setExcludeInd(String param){
                            localExcludeIndTracker = true;
                                   
                                            this.localExcludeInd=param;
                                    

                               }
                            

                        /**
                        * field for ExternalSources
                        */

                        
                                    protected String localExternalSources ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localExternalSourcesTracker = false ;

                           public boolean isExternalSourcesSpecified(){
                               return localExternalSourcesTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  String getExternalSources(){
                               return localExternalSources;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ExternalSources
                               */
                               public void setExternalSources(String param){
                            localExternalSourcesTracker = true;
                                   
                                            this.localExternalSources=param;
                                    

                               }
                            

                        /**
                        * field for FirstName
                        */

                        
                                    protected String localFirstName ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localFirstNameTracker = false ;

                           public boolean isFirstNameSpecified(){
                               return localFirstNameTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  String getFirstName(){
                               return localFirstName;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param FirstName
                               */
                               public void setFirstName(String param){
                            localFirstNameTracker = true;
                                   
                                            this.localFirstName=param;
                                    

                               }
                            

                        /**
                        * field for FirstNameMatchSensitivity
                        */

                        
                                    protected int localFirstNameMatchSensitivity ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localFirstNameMatchSensitivityTracker = false ;

                           public boolean isFirstNameMatchSensitivitySpecified(){
                               return localFirstNameMatchSensitivityTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return int
                           */
                           public  int getFirstNameMatchSensitivity(){
                               return localFirstNameMatchSensitivity;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param FirstNameMatchSensitivity
                               */
                               public void setFirstNameMatchSensitivity(int param){
                            
                                       // setting primitive attribute tracker to true
                                       localFirstNameMatchSensitivityTracker =
                                       param != Integer.MIN_VALUE;
                                   
                                            this.localFirstNameMatchSensitivity=param;
                                    

                               }
                            

                        /**
                        * field for FullAddress
                        */

                        
                                    protected String localFullAddress ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localFullAddressTracker = false ;

                           public boolean isFullAddressSpecified(){
                               return localFullAddressTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  String getFullAddress(){
                               return localFullAddress;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param FullAddress
                               */
                               public void setFullAddress(String param){
                            localFullAddressTracker = true;
                                   
                                            this.localFullAddress=param;
                                    

                               }
                            

                        /**
                        * field for FurtherInfo
                        */

                        
                                    protected String localFurtherInfo ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localFurtherInfoTracker = false ;

                           public boolean isFurtherInfoSpecified(){
                               return localFurtherInfoTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  String getFurtherInfo(){
                               return localFurtherInfo;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param FurtherInfo
                               */
                               public void setFurtherInfo(String param){
                            localFurtherInfoTracker = true;
                                   
                                            this.localFurtherInfo=param;
                                    

                               }
                            

                        /**
                        * field for IdNumbers
                        */

                        
                                    protected String localIdNumbers ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localIdNumbersTracker = false ;

                           public boolean isIdNumbersSpecified(){
                               return localIdNumbersTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  String getIdNumbers(){
                               return localIdNumbers;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param IdNumbers
                               */
                               public void setIdNumbers(String param){
                            localIdNumbersTracker = true;
                                   
                                            this.localIdNumbers=param;
                                    

                               }
                            

                        /**
                        * field for IndenTypeDesc
                        */

                        
                                    protected String localIndenTypeDesc ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localIndenTypeDescTracker = false ;

                           public boolean isIndenTypeDescSpecified(){
                               return localIndenTypeDescTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  String getIndenTypeDesc(){
                               return localIndenTypeDesc;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param IndenTypeDesc
                               */
                               public void setIndenTypeDesc(String param){
                            localIndenTypeDescTracker = true;
                                   
                                            this.localIndenTypeDesc=param;
                                    

                               }
                            

                        /**
                        * field for IndentificationId
                        */

                        
                                    protected String localIndentificationId ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localIndentificationIdTracker = false ;

                           public boolean isIndentificationIdSpecified(){
                               return localIndentificationIdTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  String getIndentificationId(){
                               return localIndentificationId;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param IndentificationId
                               */
                               public void setIndentificationId(String param){
                            localIndentificationIdTracker = true;
                                   
                                            this.localIndentificationId=param;
                                    

                               }
                            

                        /**
                        * field for KeyWords
                        */

                        
                                    protected String localKeyWords ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localKeyWordsTracker = false ;

                           public boolean isKeyWordsSpecified(){
                               return localKeyWordsTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  String getKeyWords(){
                               return localKeyWords;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param KeyWords
                               */
                               public void setKeyWords(String param){
                            localKeyWordsTracker = true;
                                   
                                            this.localKeyWords=param;
                                    

                               }
                            

                        /**
                        * field for LastName
                        */

                        
                                    protected String localLastName ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localLastNameTracker = false ;

                           public boolean isLastNameSpecified(){
                               return localLastNameTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  String getLastName(){
                               return localLastName;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param LastName
                               */
                               public void setLastName(String param){
                            localLastNameTracker = true;
                                   
                                            this.localLastName=param;
                                    

                               }
                            

                        /**
                        * field for LastNameMatchSensitivity
                        */

                        
                                    protected int localLastNameMatchSensitivity ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localLastNameMatchSensitivityTracker = false ;

                           public boolean isLastNameMatchSensitivitySpecified(){
                               return localLastNameMatchSensitivityTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return int
                           */
                           public  int getLastNameMatchSensitivity(){
                               return localLastNameMatchSensitivity;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param LastNameMatchSensitivity
                               */
                               public void setLastNameMatchSensitivity(int param){
                            
                                       // setting primitive attribute tracker to true
                                       localLastNameMatchSensitivityTracker =
                                       param != Integer.MIN_VALUE;
                                   
                                            this.localLastNameMatchSensitivity=param;
                                    

                               }
                            

                        /**
                        * field for LinkedTo
                        */

                        
                                    protected String localLinkedTo ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localLinkedToTracker = false ;

                           public boolean isLinkedToSpecified(){
                               return localLinkedToTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  String getLinkedTo(){
                               return localLinkedTo;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param LinkedTo
                               */
                               public void setLinkedTo(String param){
                            localLinkedToTracker = true;
                                   
                                            this.localLinkedTo=param;
                                    

                               }
                            

                        /**
                        * field for Locations
                        */

                        
                                    protected String localLocations ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localLocationsTracker = false ;

                           public boolean isLocationsSpecified(){
                               return localLocationsTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  String getLocations(){
                               return localLocations;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Locations
                               */
                               public void setLocations(String param){
                            localLocationsTracker = true;
                                   
                                            this.localLocations=param;
                                    

                               }
                            

                        /**
                        * field for LowQualityAliases
                        */

                        
                                    protected String localLowQualityAliases ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localLowQualityAliasesTracker = false ;

                           public boolean isLowQualityAliasesSpecified(){
                               return localLowQualityAliasesTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  String getLowQualityAliases(){
                               return localLowQualityAliases;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param LowQualityAliases
                               */
                               public void setLowQualityAliases(String param){
                            localLowQualityAliasesTracker = true;
                                   
                                            this.localLowQualityAliases=param;
                                    

                               }
                            

                        /**
                        * field for MaxMatchSensitivity
                        */

                        
                                    protected int localMaxMatchSensitivity ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localMaxMatchSensitivityTracker = false ;

                           public boolean isMaxMatchSensitivitySpecified(){
                               return localMaxMatchSensitivityTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return int
                           */
                           public  int getMaxMatchSensitivity(){
                               return localMaxMatchSensitivity;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param MaxMatchSensitivity
                               */
                               public void setMaxMatchSensitivity(int param){
                            
                                       // setting primitive attribute tracker to true
                                       localMaxMatchSensitivityTracker =
                                       param != Integer.MIN_VALUE;
                                   
                                            this.localMaxMatchSensitivity=param;
                                    

                               }
                            

                        /**
                        * field for MiddleName
                        */

                        
                                    protected String localMiddleName ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localMiddleNameTracker = false ;

                           public boolean isMiddleNameSpecified(){
                               return localMiddleNameTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  String getMiddleName(){
                               return localMiddleName;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param MiddleName
                               */
                               public void setMiddleName(String param){
                            localMiddleNameTracker = true;
                                   
                                            this.localMiddleName=param;
                                    

                               }
                            

                        /**
                        * field for MiddleNameMatchSensitivity
                        */

                        
                                    protected int localMiddleNameMatchSensitivity ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localMiddleNameMatchSensitivityTracker = false ;

                           public boolean isMiddleNameMatchSensitivitySpecified(){
                               return localMiddleNameMatchSensitivityTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return int
                           */
                           public  int getMiddleNameMatchSensitivity(){
                               return localMiddleNameMatchSensitivity;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param MiddleNameMatchSensitivity
                               */
                               public void setMiddleNameMatchSensitivity(int param){
                            
                                       // setting primitive attribute tracker to true
                                       localMiddleNameMatchSensitivityTracker =
                                       param != Integer.MIN_VALUE;
                                   
                                            this.localMiddleNameMatchSensitivity=param;
                                    

                               }
                            

                        /**
                        * field for NationalityCountryCode
                        */

                        
                                    protected String localNationalityCountryCode ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localNationalityCountryCodeTracker = false ;

                           public boolean isNationalityCountryCodeSpecified(){
                               return localNationalityCountryCodeTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  String getNationalityCountryCode(){
                               return localNationalityCountryCode;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param NationalityCountryCode
                               */
                               public void setNationalityCountryCode(String param){
                            localNationalityCountryCodeTracker = true;
                                   
                                            this.localNationalityCountryCode=param;
                                    

                               }
                            

                        /**
                        * field for NationalityCountryName
                        */

                        
                                    protected String localNationalityCountryName ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localNationalityCountryNameTracker = false ;

                           public boolean isNationalityCountryNameSpecified(){
                               return localNationalityCountryNameTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  String getNationalityCountryName(){
                               return localNationalityCountryName;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param NationalityCountryName
                               */
                               public void setNationalityCountryName(String param){
                            localNationalityCountryNameTracker = true;
                                   
                                            this.localNationalityCountryName=param;
                                    

                               }
                            

                        /**
                        * field for OccupationDesc
                        */

                        
                                    protected String localOccupationDesc ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localOccupationDescTracker = false ;

                           public boolean isOccupationDescSpecified(){
                               return localOccupationDescTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  String getOccupationDesc(){
                               return localOccupationDesc;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param OccupationDesc
                               */
                               public void setOccupationDesc(String param){
                            localOccupationDescTracker = true;
                                   
                                            this.localOccupationDesc=param;
                                    

                               }
                            

                        /**
                        * field for OfficialName
                        */

                        
                                    protected String localOfficialName ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localOfficialNameTracker = false ;

                           public boolean isOfficialNameSpecified(){
                               return localOfficialNameTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  String getOfficialName(){
                               return localOfficialName;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param OfficialName
                               */
                               public void setOfficialName(String param){
                            localOfficialNameTracker = true;
                                   
                                            this.localOfficialName=param;
                                    

                               }
                            

                        /**
                        * field for OrgCountryOfBusinessCode
                        */

                        
                                    protected String localOrgCountryOfBusinessCode ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localOrgCountryOfBusinessCodeTracker = false ;

                           public boolean isOrgCountryOfBusinessCodeSpecified(){
                               return localOrgCountryOfBusinessCodeTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  String getOrgCountryOfBusinessCode(){
                               return localOrgCountryOfBusinessCode;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param OrgCountryOfBusinessCode
                               */
                               public void setOrgCountryOfBusinessCode(String param){
                            localOrgCountryOfBusinessCodeTracker = true;
                                   
                                            this.localOrgCountryOfBusinessCode=param;
                                    

                               }
                            

                        /**
                        * field for OrgCountryOfBusinessName
                        */

                        
                                    protected String localOrgCountryOfBusinessName ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localOrgCountryOfBusinessNameTracker = false ;

                           public boolean isOrgCountryOfBusinessNameSpecified(){
                               return localOrgCountryOfBusinessNameTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  String getOrgCountryOfBusinessName(){
                               return localOrgCountryOfBusinessName;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param OrgCountryOfBusinessName
                               */
                               public void setOrgCountryOfBusinessName(String param){
                            localOrgCountryOfBusinessNameTracker = true;
                                   
                                            this.localOrgCountryOfBusinessName=param;
                                    

                               }
                            

                        /**
                        * field for OrgNameMatchSensitivity
                        */

                        
                                    protected int localOrgNameMatchSensitivity ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localOrgNameMatchSensitivityTracker = false ;

                           public boolean isOrgNameMatchSensitivitySpecified(){
                               return localOrgNameMatchSensitivityTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return int
                           */
                           public  int getOrgNameMatchSensitivity(){
                               return localOrgNameMatchSensitivity;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param OrgNameMatchSensitivity
                               */
                               public void setOrgNameMatchSensitivity(int param){
                            
                                       // setting primitive attribute tracker to true
                                       localOrgNameMatchSensitivityTracker =
                                       param != Integer.MIN_VALUE;
                                   
                                            this.localOrgNameMatchSensitivity=param;
                                    

                               }
                            

                        /**
                        * field for Passports
                        */

                        
                                    protected String localPassports ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localPassportsTracker = false ;

                           public boolean isPassportsSpecified(){
                               return localPassportsTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  String getPassports(){
                               return localPassports;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Passports
                               */
                               public void setPassports(String param){
                            localPassportsTracker = true;
                                   
                                            this.localPassports=param;
                                    

                               }
                            

                        /**
                        * field for PlaceOfBirth
                        */

                        
                                    protected String localPlaceOfBirth ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localPlaceOfBirthTracker = false ;

                           public boolean isPlaceOfBirthSpecified(){
                               return localPlaceOfBirthTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  String getPlaceOfBirth(){
                               return localPlaceOfBirth;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param PlaceOfBirth
                               */
                               public void setPlaceOfBirth(String param){
                            localPlaceOfBirthTracker = true;
                                   
                                            this.localPlaceOfBirth=param;
                                    

                               }
                            

                        /**
                        * field for PoliticallyExposed
                        */

                        
                                    protected boolean localPoliticallyExposed ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localPoliticallyExposedTracker = false ;

                           public boolean isPoliticallyExposedSpecified(){
                               return localPoliticallyExposedTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getPoliticallyExposed(){
                               return localPoliticallyExposed;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param PoliticallyExposed
                               */
                               public void setPoliticallyExposed(boolean param){
                            
                                       // setting primitive attribute tracker to true
                                       localPoliticallyExposedTracker =
                                       true;
                                   
                                            this.localPoliticallyExposed=param;
                                    

                               }
                            

                        /**
                        * field for PoliticallyExposedPersonInd
                        */

                        
                                    protected String localPoliticallyExposedPersonInd ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localPoliticallyExposedPersonIndTracker = false ;

                           public boolean isPoliticallyExposedPersonIndSpecified(){
                               return localPoliticallyExposedPersonIndTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  String getPoliticallyExposedPersonInd(){
                               return localPoliticallyExposedPersonInd;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param PoliticallyExposedPersonInd
                               */
                               public void setPoliticallyExposedPersonInd(String param){
                            localPoliticallyExposedPersonIndTracker = true;
                                   
                                            this.localPoliticallyExposedPersonInd=param;
                                    

                               }
                            

                        /**
                        * field for Position
                        */

                        
                                    protected String localPosition ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localPositionTracker = false ;

                           public boolean isPositionSpecified(){
                               return localPositionTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  String getPosition(){
                               return localPosition;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Position
                               */
                               public void setPosition(String param){
                            localPositionTracker = true;
                                   
                                            this.localPosition=param;
                                    

                               }
                            

                        /**
                        * field for PostalCode
                        */

                        
                                    protected String localPostalCode ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localPostalCodeTracker = false ;

                           public boolean isPostalCodeSpecified(){
                               return localPostalCodeTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  String getPostalCode(){
                               return localPostalCode;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param PostalCode
                               */
                               public void setPostalCode(String param){
                            localPostalCodeTracker = true;
                                   
                                            this.localPostalCode=param;
                                    

                               }
                            

                        /**
                        * field for Programs
                        */

                        
                                    protected String localPrograms ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localProgramsTracker = false ;

                           public boolean isProgramsSpecified(){
                               return localProgramsTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  String getPrograms(){
                               return localPrograms;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Programs
                               */
                               public void setPrograms(String param){
                            localProgramsTracker = true;
                                   
                                            this.localPrograms=param;
                                    

                               }
                            

                        /**
                        * field for Remarks
                        */

                        
                                    protected String localRemarks ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localRemarksTracker = false ;

                           public boolean isRemarksSpecified(){
                               return localRemarksTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  String getRemarks(){
                               return localRemarks;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Remarks
                               */
                               public void setRemarks(String param){
                            localRemarksTracker = true;
                                   
                                            this.localRemarks=param;
                                    

                               }
                            

                        /**
                        * field for Ssn
                        */

                        
                                    protected String localSsn ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSsnTracker = false ;

                           public boolean isSsnSpecified(){
                               return localSsnTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  String getSsn(){
                               return localSsn;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Ssn
                               */
                               public void setSsn(String param){
                            localSsnTracker = true;
                                   
                                            this.localSsn=param;
                                    

                               }
                            

                        /**
                        * field for StateName
                        */

                        
                                    protected String localStateName ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localStateNameTracker = false ;

                           public boolean isStateNameSpecified(){
                               return localStateNameTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  String getStateName(){
                               return localStateName;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param StateName
                               */
                               public void setStateName(String param){
                            localStateNameTracker = true;
                                   
                                            this.localStateName=param;
                                    

                               }
                            

                        /**
                        * field for SubCategory
                        */

                        
                                    protected String localSubCategory ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSubCategoryTracker = false ;

                           public boolean isSubCategorySpecified(){
                               return localSubCategoryTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  String getSubCategory(){
                               return localSubCategory;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SubCategory
                               */
                               public void setSubCategory(String param){
                            localSubCategoryTracker = true;
                                   
                                            this.localSubCategory=param;
                                    

                               }
                            

                        /**
                        * field for TaxId
                        */

                        
                                    protected String localTaxId ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localTaxIdTracker = false ;

                           public boolean isTaxIdSpecified(){
                               return localTaxIdTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  String getTaxId(){
                               return localTaxId;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param TaxId
                               */
                               public void setTaxId(String param){
                            localTaxIdTracker = true;
                                   
                                            this.localTaxId=param;
                                    

                               }
                            

                        /**
                        * field for TaxIdTypeCode
                        */

                        
                                    protected String localTaxIdTypeCode ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localTaxIdTypeCodeTracker = false ;

                           public boolean isTaxIdTypeCodeSpecified(){
                               return localTaxIdTypeCodeTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  String getTaxIdTypeCode(){
                               return localTaxIdTypeCode;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param TaxIdTypeCode
                               */
                               public void setTaxIdTypeCode(String param){
                            localTaxIdTypeCodeTracker = true;
                                   
                                            this.localTaxIdTypeCode=param;
                                    

                               }
                            

                        /**
                        * field for Title
                        */

                        
                                    protected String localTitle ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localTitleTracker = false ;

                           public boolean isTitleSpecified(){
                               return localTitleTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  String getTitle(){
                               return localTitle;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Title
                               */
                               public void setTitle(String param){
                            localTitleTracker = true;
                                   
                                            this.localTitle=param;
                                    

                               }
                            

                        /**
                        * field for TypeDescription
                        */

                        
                                    protected String localTypeDescription ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localTypeDescriptionTracker = false ;

                           public boolean isTypeDescriptionSpecified(){
                               return localTypeDescriptionTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  String getTypeDescription(){
                               return localTypeDescription;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param TypeDescription
                               */
                               public void setTypeDescription(String param){
                            localTypeDescriptionTracker = true;
                                   
                                            this.localTypeDescription=param;
                                    

                               }
                            

                        /**
                        * field for UpdateCategory
                        */

                        
                                    protected String localUpdateCategory ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localUpdateCategoryTracker = false ;

                           public boolean isUpdateCategorySpecified(){
                               return localUpdateCategoryTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  String getUpdateCategory(){
                               return localUpdateCategory;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param UpdateCategory
                               */
                               public void setUpdateCategory(String param){
                            localUpdateCategoryTracker = true;
                                   
                                            this.localUpdateCategory=param;
                                    

                               }
                            

                        /**
                        * field for UpdateDate
                        */

                        
                                    protected String localUpdateDate ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localUpdateDateTracker = false ;

                           public boolean isUpdateDateSpecified(){
                               return localUpdateDateTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  String getUpdateDate(){
                               return localUpdateDate;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param UpdateDate
                               */
                               public void setUpdateDate(String param){
                            localUpdateDateTracker = true;
                                   
                                            this.localUpdateDate=param;
                                    

                               }
                            

                        /**
                        * field for Updated
                        */

                        
                                    protected String localUpdated ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localUpdatedTracker = false ;

                           public boolean isUpdatedSpecified(){
                               return localUpdatedTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  String getUpdated(){
                               return localUpdated;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Updated
                               */
                               public void setUpdated(String param){
                            localUpdatedTracker = true;
                                   
                                            this.localUpdated=param;
                                    

                               }
                            

                        /**
                        * field for WatchListName
                        */

                        
                                    protected String localWatchListName ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localWatchListNameTracker = false ;

                           public boolean isWatchListNameSpecified(){
                               return localWatchListNameTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  String getWatchListName(){
                               return localWatchListName;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param WatchListName
                               */
                               public void setWatchListName(String param){
                            localWatchListNameTracker = true;
                                   
                                            this.localWatchListName=param;
                                    

                               }
                            

                        /**
                        * field for WatchListNumber
                        */

                        
                                    protected String localWatchListNumber ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localWatchListNumberTracker = false ;

                           public boolean isWatchListNumberSpecified(){
                               return localWatchListNumberTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  String getWatchListNumber(){
                               return localWatchListNumber;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param WatchListNumber
                               */
                               public void setWatchListNumber(String param){
                            localWatchListNumberTracker = true;
                                   
                                            this.localWatchListNumber=param;
                                    

                               }
                            

                        /**
                        * field for WatchListSubCategory
                        */

                        
                                    protected String localWatchListSubCategory ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localWatchListSubCategoryTracker = false ;

                           public boolean isWatchListSubCategorySpecified(){
                               return localWatchListSubCategoryTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  String getWatchListSubCategory(){
                               return localWatchListSubCategory;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param WatchListSubCategory
                               */
                               public void setWatchListSubCategory(String param){
                            localWatchListSubCategoryTracker = true;
                                   
                                            this.localWatchListSubCategory=param;
                                    

                               }
                            

                        /**
                        * field for YearOfBirth
                        */

                        
                                    protected String localYearOfBirth ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localYearOfBirthTracker = false ;

                           public boolean isYearOfBirthSpecified(){
                               return localYearOfBirthTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  String getYearOfBirth(){
                               return localYearOfBirth;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param YearOfBirth
                               */
                               public void setYearOfBirth(String param){
                            localYearOfBirthTracker = true;
                                   
                                            this.localYearOfBirth=param;
                                    

                               }
                            

     
     
        /**
        *
        * @param parentQName
        * @param factory
        * @return org.apache.axiom.om.OMElement
        */
       public org.apache.axiom.om.OMElement getOMElement (
               final javax.xml.namespace.QName parentQName,
               final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException{


        
               org.apache.axiom.om.OMDataSource dataSource =
                       new org.apache.axis2.databinding.ADBDataSource(this,parentQName);
               return factory.createOMElement(dataSource,parentQName);
            
        }

         public void serialize(final javax.xml.namespace.QName parentQName,
                                       javax.xml.stream.XMLStreamWriter xmlWriter)
                                throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{
                           serialize(parentQName,xmlWriter,false);
         }

         public void serialize(final javax.xml.namespace.QName parentQName,
                               javax.xml.stream.XMLStreamWriter xmlWriter,
                               boolean serializeType)
            throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{
            
                


                String prefix = null;
                String namespace = null;
                

                    prefix = parentQName.getPrefix();
                    namespace = parentQName.getNamespaceURI();
                    writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);
                
                  if (serializeType){
               

                   String namespacePrefix = registerPrefix(xmlWriter,"http://main/xsd");
                   if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)){
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           namespacePrefix+":WatchListEntity",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "WatchListEntity",
                           xmlWriter);
                   }

               
                   }
                if (localAddressTracker){
                                    namespace = "http://main/xsd";
                                    writeStartElement(null, namespace, "address", xmlWriter);
                             

                                          if (localAddress==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localAddress);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localAgeTracker){
                                    namespace = "http://main/xsd";
                                    writeStartElement(null, namespace, "age", xmlWriter);
                             
                                               if (localAge== Integer.MIN_VALUE) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("age cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAge));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localAgeDateTracker){
                                    namespace = "http://main/xsd";
                                    writeStartElement(null, namespace, "ageDate", xmlWriter);
                             

                                          if (localAgeDate==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localAgeDate);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localAliasesTracker){
                                    namespace = "http://main/xsd";
                                    writeStartElement(null, namespace, "aliases", xmlWriter);
                             

                                          if (localAliases==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localAliases);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localAlternativeSpellingTracker){
                                    namespace = "http://main/xsd";
                                    writeStartElement(null, namespace, "alternativeSpelling", xmlWriter);
                             

                                          if (localAlternativeSpelling==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localAlternativeSpelling);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localAvgMatchSensitivityTracker){
                                    namespace = "http://main/xsd";
                                    writeStartElement(null, namespace, "avgMatchSensitivity", xmlWriter);
                             
                                               if (Double.isNaN(localAvgMatchSensitivity)) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("avgMatchSensitivity cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAvgMatchSensitivity));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localBirthDateTracker){
                                    namespace = "http://main/xsd";
                                    writeStartElement(null, namespace, "birthDate", xmlWriter);
                             

                                          if (localBirthDate==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localBirthDate);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localCategoryTracker){
                                    namespace = "http://main/xsd";
                                    writeStartElement(null, namespace, "category", xmlWriter);
                             

                                          if (localCategory==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localCategory);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localCategoryDescriptionTracker){
                                    namespace = "http://main/xsd";
                                    writeStartElement(null, namespace, "categoryDescription", xmlWriter);
                             

                                          if (localCategoryDescription==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localCategoryDescription);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localChangeBeginDateTracker){
                                    namespace = "http://main/xsd";
                                    writeStartElement(null, namespace, "changeBeginDate", xmlWriter);
                             

                                          if (localChangeBeginDate==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localChangeBeginDate);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localChangeCurrentIndTracker){
                                    namespace = "http://main/xsd";
                                    writeStartElement(null, namespace, "changeCurrentInd", xmlWriter);
                             

                                          if (localChangeCurrentInd==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localChangeCurrentInd);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localChangeEndDateTracker){
                                    namespace = "http://main/xsd";
                                    writeStartElement(null, namespace, "changeEndDate", xmlWriter);
                             

                                          if (localChangeEndDate==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localChangeEndDate);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localCitizenShipCountryCodeTracker){
                                    namespace = "http://main/xsd";
                                    writeStartElement(null, namespace, "citizenShipCountryCode", xmlWriter);
                             

                                          if (localCitizenShipCountryCode==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localCitizenShipCountryCode);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localCitizenShipCountryNameTracker){
                                    namespace = "http://main/xsd";
                                    writeStartElement(null, namespace, "citizenShipCountryName", xmlWriter);
                             

                                          if (localCitizenShipCountryName==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localCitizenShipCountryName);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localCitizenshipTracker){
                                    namespace = "http://main/xsd";
                                    writeStartElement(null, namespace, "citizenship", xmlWriter);
                             

                                          if (localCitizenship==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localCitizenship);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localCitizenshpTracker){
                                    namespace = "http://main/xsd";
                                    writeStartElement(null, namespace, "citizenshp", xmlWriter);
                             

                                          if (localCitizenshp==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localCitizenshp);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localCityNameTracker){
                                    namespace = "http://main/xsd";
                                    writeStartElement(null, namespace, "cityName", xmlWriter);
                             

                                          if (localCityName==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localCityName);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localCompaniesTracker){
                                    namespace = "http://main/xsd";
                                    writeStartElement(null, namespace, "companies", xmlWriter);
                             

                                          if (localCompanies==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localCompanies);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localCountriesTracker){
                                    namespace = "http://main/xsd";
                                    writeStartElement(null, namespace, "countries", xmlWriter);
                             

                                          if (localCountries==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localCountries);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localCountryCodeTracker){
                                    namespace = "http://main/xsd";
                                    writeStartElement(null, namespace, "countryCode", xmlWriter);
                             

                                          if (localCountryCode==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localCountryCode);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localCountryNameTracker){
                                    namespace = "http://main/xsd";
                                    writeStartElement(null, namespace, "countryName", xmlWriter);
                             

                                          if (localCountryName==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localCountryName);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localCreateDateTracker){
                                    namespace = "http://main/xsd";
                                    writeStartElement(null, namespace, "createDate", xmlWriter);
                             

                                          if (localCreateDate==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localCreateDate);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localCurrentVersionTracker){
                                    namespace = "http://main/xsd";
                                    writeStartElement(null, namespace, "currentVersion", xmlWriter);
                             
                                               if (false) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("currentVersion cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCurrentVersion));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localDeceasedTracker){
                                    namespace = "http://main/xsd";
                                    writeStartElement(null, namespace, "deceased", xmlWriter);
                             

                                          if (localDeceased==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localDeceased);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localDeceasedIndTracker){
                                    namespace = "http://main/xsd";
                                    writeStartElement(null, namespace, "deceasedInd", xmlWriter);
                             

                                          if (localDeceasedInd==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localDeceasedInd);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localDobsTracker){
                                    namespace = "http://main/xsd";
                                    writeStartElement(null, namespace, "dobs", xmlWriter);
                             

                                          if (localDobs==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localDobs);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localEddBICTracker){
                                    namespace = "http://main/xsd";
                                    writeStartElement(null, namespace, "eddBIC", xmlWriter);
                             

                                          if (localEddBIC==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localEddBIC);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localEddCountryTracker){
                                    namespace = "http://main/xsd";
                                    writeStartElement(null, namespace, "eddCountry", xmlWriter);
                             

                                          if (localEddCountry==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localEddCountry);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localEditorTracker){
                                    namespace = "http://main/xsd";
                                    writeStartElement(null, namespace, "editor", xmlWriter);
                             

                                          if (localEditor==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localEditor);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localEiTracker){
                                    namespace = "http://main/xsd";
                                    writeStartElement(null, namespace, "ei", xmlWriter);
                             

                                          if (localEi==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localEi);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localEnteredTracker){
                                    namespace = "http://main/xsd";
                                    writeStartElement(null, namespace, "entered", xmlWriter);
                             

                                          if (localEntered==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localEntered);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localEntityNameTracker){
                                    namespace = "http://main/xsd";
                                    writeStartElement(null, namespace, "entityName", xmlWriter);
                             

                                          if (localEntityName==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localEntityName);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localEntityNameMatchSensitivityTracker){
                                    namespace = "http://main/xsd";
                                    writeStartElement(null, namespace, "entityNameMatchSensitivity", xmlWriter);
                             
                                               if (localEntityNameMatchSensitivity== Integer.MIN_VALUE) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("entityNameMatchSensitivity cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localEntityNameMatchSensitivity));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localEntityTitleTracker){
                                    namespace = "http://main/xsd";
                                    writeStartElement(null, namespace, "entityTitle", xmlWriter);
                             

                                          if (localEntityTitle==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localEntityTitle);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localEntityWatchListKeyTracker){
                                    namespace = "http://main/xsd";
                                    writeStartElement(null, namespace, "entityWatchListKey", xmlWriter);
                             

                                          if (localEntityWatchListKey==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localEntityWatchListKey);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localExcludeIndTracker){
                                    namespace = "http://main/xsd";
                                    writeStartElement(null, namespace, "excludeInd", xmlWriter);
                             

                                          if (localExcludeInd==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localExcludeInd);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localExternalSourcesTracker){
                                    namespace = "http://main/xsd";
                                    writeStartElement(null, namespace, "externalSources", xmlWriter);
                             

                                          if (localExternalSources==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localExternalSources);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localFirstNameTracker){
                                    namespace = "http://main/xsd";
                                    writeStartElement(null, namespace, "firstName", xmlWriter);
                             

                                          if (localFirstName==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localFirstName);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localFirstNameMatchSensitivityTracker){
                                    namespace = "http://main/xsd";
                                    writeStartElement(null, namespace, "firstNameMatchSensitivity", xmlWriter);
                             
                                               if (localFirstNameMatchSensitivity== Integer.MIN_VALUE) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("firstNameMatchSensitivity cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localFirstNameMatchSensitivity));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localFullAddressTracker){
                                    namespace = "http://main/xsd";
                                    writeStartElement(null, namespace, "fullAddress", xmlWriter);
                             

                                          if (localFullAddress==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localFullAddress);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localFurtherInfoTracker){
                                    namespace = "http://main/xsd";
                                    writeStartElement(null, namespace, "furtherInfo", xmlWriter);
                             

                                          if (localFurtherInfo==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localFurtherInfo);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localIdNumbersTracker){
                                    namespace = "http://main/xsd";
                                    writeStartElement(null, namespace, "idNumbers", xmlWriter);
                             

                                          if (localIdNumbers==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localIdNumbers);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localIndenTypeDescTracker){
                                    namespace = "http://main/xsd";
                                    writeStartElement(null, namespace, "indenTypeDesc", xmlWriter);
                             

                                          if (localIndenTypeDesc==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localIndenTypeDesc);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localIndentificationIdTracker){
                                    namespace = "http://main/xsd";
                                    writeStartElement(null, namespace, "indentificationId", xmlWriter);
                             

                                          if (localIndentificationId==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localIndentificationId);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localKeyWordsTracker){
                                    namespace = "http://main/xsd";
                                    writeStartElement(null, namespace, "keyWords", xmlWriter);
                             

                                          if (localKeyWords==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localKeyWords);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localLastNameTracker){
                                    namespace = "http://main/xsd";
                                    writeStartElement(null, namespace, "lastName", xmlWriter);
                             

                                          if (localLastName==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localLastName);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localLastNameMatchSensitivityTracker){
                                    namespace = "http://main/xsd";
                                    writeStartElement(null, namespace, "lastNameMatchSensitivity", xmlWriter);
                             
                                               if (localLastNameMatchSensitivity== Integer.MIN_VALUE) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("lastNameMatchSensitivity cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localLastNameMatchSensitivity));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localLinkedToTracker){
                                    namespace = "http://main/xsd";
                                    writeStartElement(null, namespace, "linkedTo", xmlWriter);
                             

                                          if (localLinkedTo==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localLinkedTo);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localLocationsTracker){
                                    namespace = "http://main/xsd";
                                    writeStartElement(null, namespace, "locations", xmlWriter);
                             

                                          if (localLocations==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localLocations);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localLowQualityAliasesTracker){
                                    namespace = "http://main/xsd";
                                    writeStartElement(null, namespace, "lowQualityAliases", xmlWriter);
                             

                                          if (localLowQualityAliases==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localLowQualityAliases);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localMaxMatchSensitivityTracker){
                                    namespace = "http://main/xsd";
                                    writeStartElement(null, namespace, "maxMatchSensitivity", xmlWriter);
                             
                                               if (localMaxMatchSensitivity== Integer.MIN_VALUE) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("maxMatchSensitivity cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localMaxMatchSensitivity));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localMiddleNameTracker){
                                    namespace = "http://main/xsd";
                                    writeStartElement(null, namespace, "middleName", xmlWriter);
                             

                                          if (localMiddleName==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localMiddleName);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localMiddleNameMatchSensitivityTracker){
                                    namespace = "http://main/xsd";
                                    writeStartElement(null, namespace, "middleNameMatchSensitivity", xmlWriter);
                             
                                               if (localMiddleNameMatchSensitivity== Integer.MIN_VALUE) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("middleNameMatchSensitivity cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localMiddleNameMatchSensitivity));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localNationalityCountryCodeTracker){
                                    namespace = "http://main/xsd";
                                    writeStartElement(null, namespace, "nationalityCountryCode", xmlWriter);
                             

                                          if (localNationalityCountryCode==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localNationalityCountryCode);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localNationalityCountryNameTracker){
                                    namespace = "http://main/xsd";
                                    writeStartElement(null, namespace, "nationalityCountryName", xmlWriter);
                             

                                          if (localNationalityCountryName==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localNationalityCountryName);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localOccupationDescTracker){
                                    namespace = "http://main/xsd";
                                    writeStartElement(null, namespace, "occupationDesc", xmlWriter);
                             

                                          if (localOccupationDesc==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localOccupationDesc);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localOfficialNameTracker){
                                    namespace = "http://main/xsd";
                                    writeStartElement(null, namespace, "officialName", xmlWriter);
                             

                                          if (localOfficialName==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localOfficialName);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localOrgCountryOfBusinessCodeTracker){
                                    namespace = "http://main/xsd";
                                    writeStartElement(null, namespace, "orgCountryOfBusinessCode", xmlWriter);
                             

                                          if (localOrgCountryOfBusinessCode==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localOrgCountryOfBusinessCode);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localOrgCountryOfBusinessNameTracker){
                                    namespace = "http://main/xsd";
                                    writeStartElement(null, namespace, "orgCountryOfBusinessName", xmlWriter);
                             

                                          if (localOrgCountryOfBusinessName==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localOrgCountryOfBusinessName);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localOrgNameMatchSensitivityTracker){
                                    namespace = "http://main/xsd";
                                    writeStartElement(null, namespace, "orgNameMatchSensitivity", xmlWriter);
                             
                                               if (localOrgNameMatchSensitivity== Integer.MIN_VALUE) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("orgNameMatchSensitivity cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localOrgNameMatchSensitivity));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localPassportsTracker){
                                    namespace = "http://main/xsd";
                                    writeStartElement(null, namespace, "passports", xmlWriter);
                             

                                          if (localPassports==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localPassports);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localPlaceOfBirthTracker){
                                    namespace = "http://main/xsd";
                                    writeStartElement(null, namespace, "placeOfBirth", xmlWriter);
                             

                                          if (localPlaceOfBirth==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localPlaceOfBirth);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localPoliticallyExposedTracker){
                                    namespace = "http://main/xsd";
                                    writeStartElement(null, namespace, "politicallyExposed", xmlWriter);
                             
                                               if (false) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("politicallyExposed cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPoliticallyExposed));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localPoliticallyExposedPersonIndTracker){
                                    namespace = "http://main/xsd";
                                    writeStartElement(null, namespace, "politicallyExposedPersonInd", xmlWriter);
                             

                                          if (localPoliticallyExposedPersonInd==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localPoliticallyExposedPersonInd);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localPositionTracker){
                                    namespace = "http://main/xsd";
                                    writeStartElement(null, namespace, "position", xmlWriter);
                             

                                          if (localPosition==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localPosition);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localPostalCodeTracker){
                                    namespace = "http://main/xsd";
                                    writeStartElement(null, namespace, "postalCode", xmlWriter);
                             

                                          if (localPostalCode==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localPostalCode);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localProgramsTracker){
                                    namespace = "http://main/xsd";
                                    writeStartElement(null, namespace, "programs", xmlWriter);
                             

                                          if (localPrograms==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localPrograms);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localRemarksTracker){
                                    namespace = "http://main/xsd";
                                    writeStartElement(null, namespace, "remarks", xmlWriter);
                             

                                          if (localRemarks==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localRemarks);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localSsnTracker){
                                    namespace = "http://main/xsd";
                                    writeStartElement(null, namespace, "ssn", xmlWriter);
                             

                                          if (localSsn==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localSsn);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localStateNameTracker){
                                    namespace = "http://main/xsd";
                                    writeStartElement(null, namespace, "stateName", xmlWriter);
                             

                                          if (localStateName==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localStateName);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localSubCategoryTracker){
                                    namespace = "http://main/xsd";
                                    writeStartElement(null, namespace, "subCategory", xmlWriter);
                             

                                          if (localSubCategory==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localSubCategory);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localTaxIdTracker){
                                    namespace = "http://main/xsd";
                                    writeStartElement(null, namespace, "taxId", xmlWriter);
                             

                                          if (localTaxId==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localTaxId);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localTaxIdTypeCodeTracker){
                                    namespace = "http://main/xsd";
                                    writeStartElement(null, namespace, "taxIdTypeCode", xmlWriter);
                             

                                          if (localTaxIdTypeCode==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localTaxIdTypeCode);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localTitleTracker){
                                    namespace = "http://main/xsd";
                                    writeStartElement(null, namespace, "title", xmlWriter);
                             

                                          if (localTitle==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localTitle);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localTypeDescriptionTracker){
                                    namespace = "http://main/xsd";
                                    writeStartElement(null, namespace, "typeDescription", xmlWriter);
                             

                                          if (localTypeDescription==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localTypeDescription);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localUpdateCategoryTracker){
                                    namespace = "http://main/xsd";
                                    writeStartElement(null, namespace, "updateCategory", xmlWriter);
                             

                                          if (localUpdateCategory==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localUpdateCategory);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localUpdateDateTracker){
                                    namespace = "http://main/xsd";
                                    writeStartElement(null, namespace, "updateDate", xmlWriter);
                             

                                          if (localUpdateDate==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localUpdateDate);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localUpdatedTracker){
                                    namespace = "http://main/xsd";
                                    writeStartElement(null, namespace, "updated", xmlWriter);
                             

                                          if (localUpdated==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localUpdated);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localWatchListNameTracker){
                                    namespace = "http://main/xsd";
                                    writeStartElement(null, namespace, "watchListName", xmlWriter);
                             

                                          if (localWatchListName==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localWatchListName);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localWatchListNumberTracker){
                                    namespace = "http://main/xsd";
                                    writeStartElement(null, namespace, "watchListNumber", xmlWriter);
                             

                                          if (localWatchListNumber==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localWatchListNumber);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localWatchListSubCategoryTracker){
                                    namespace = "http://main/xsd";
                                    writeStartElement(null, namespace, "watchListSubCategory", xmlWriter);
                             

                                          if (localWatchListSubCategory==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localWatchListSubCategory);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localYearOfBirthTracker){
                                    namespace = "http://main/xsd";
                                    writeStartElement(null, namespace, "yearOfBirth", xmlWriter);
                             

                                          if (localYearOfBirth==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localYearOfBirth);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             }
                    xmlWriter.writeEndElement();
               

        }

        private static String generatePrefix(String namespace) {
            if(namespace.equals("http://main/xsd")){
                return "ns1";
            }
            return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }

        /**
         * Utility method to write an element start tag.
         */
        private void writeStartElement(String prefix, String namespace, String localPart,
                                       javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            String writerPrefix = xmlWriter.getPrefix(namespace);
            if (writerPrefix != null) {
                xmlWriter.writeStartElement(namespace, localPart);
            } else {
                if (namespace.length() == 0) {
                    prefix = "";
                } else if (prefix == null) {
                    prefix = generatePrefix(namespace);
                }

                xmlWriter.writeStartElement(prefix, localPart, namespace);
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
        }
        
        /**
         * Util method to write an attribute with the ns prefix
         */
        private void writeAttribute(String prefix, String namespace, String attName,
                                    String attValue, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
            if (xmlWriter.getPrefix(namespace) == null) {
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            xmlWriter.writeAttribute(namespace,attName,attValue);
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeAttribute(String namespace, String attName,
                                    String attValue, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName,attValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace,attName,attValue);
            }
        }


           /**
             * Util method to write an attribute without the ns prefix
             */
            private void writeQNameAttribute(String namespace, String attName,
                                             javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

                String attributeNamespace = qname.getNamespaceURI();
                String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
                if (attributePrefix == null) {
                    attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
                }
                String attributeValue;
                if (attributePrefix.trim().length() > 0) {
                    attributeValue = attributePrefix + ":" + qname.getLocalPart();
                } else {
                    attributeValue = qname.getLocalPart();
                }

                if (namespace.equals("")) {
                    xmlWriter.writeAttribute(attName, attributeValue);
                } else {
                    registerPrefix(xmlWriter, namespace);
                    xmlWriter.writeAttribute(namespace, attName, attributeValue);
                }
            }
        /**
         *  method to handle Qnames
         */

        private void writeQName(javax.xml.namespace.QName qname,
                                javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            String namespaceURI = qname.getNamespaceURI();
            if (namespaceURI != null) {
                String prefix = xmlWriter.getPrefix(namespaceURI);
                if (prefix == null) {
                    prefix = generatePrefix(namespaceURI);
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix,namespaceURI);
                }

                if (prefix.trim().length() > 0){
                    xmlWriter.writeCharacters(prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                } else {
                    // i.e this is the default namespace
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                }

            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
            }
        }

        private void writeQNames(javax.xml.namespace.QName[] qnames,
                                 javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

            if (qnames != null) {
                // we have to store this data until last moment since it is not possible to write any
                // namespace data after writing the charactor data
                StringBuffer stringToWrite = new StringBuffer();
                String namespaceURI = null;
                String prefix = null;

                for (int i = 0; i < qnames.length; i++) {
                    if (i > 0) {
                        stringToWrite.append(" ");
                    }
                    namespaceURI = qnames[i].getNamespaceURI();
                    if (namespaceURI != null) {
                        prefix = xmlWriter.getPrefix(namespaceURI);
                        if ((prefix == null) || (prefix.length() == 0)) {
                            prefix = generatePrefix(namespaceURI);
                            xmlWriter.writeNamespace(prefix, namespaceURI);
                            xmlWriter.setPrefix(prefix,namespaceURI);
                        }

                        if (prefix.trim().length() > 0){
                            stringToWrite.append(prefix).append(":").append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        } else {
                            stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        }
                    } else {
                        stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                    }
                }
                xmlWriter.writeCharacters(stringToWrite.toString());
            }

        }


        /**
         * Register a namespace prefix
         */
        private String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, String namespace) throws javax.xml.stream.XMLStreamException {
            String prefix = xmlWriter.getPrefix(namespace);
            if (prefix == null) {
                prefix = generatePrefix(namespace);
                javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
                while (true) {
                    String uri = nsContext.getNamespaceURI(prefix);
                    if (uri == null || uri.length() == 0) {
                        break;
                    }
                    prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                }
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            return prefix;
        }


  
        /**
        * databinding method to get an XML representation of this object
        *
        */
        public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName)
                    throws org.apache.axis2.databinding.ADBException{


        
                 java.util.ArrayList elementList = new java.util.ArrayList();
                 java.util.ArrayList attribList = new java.util.ArrayList();

                 if (localAddressTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://main/xsd",
                                                                      "address"));
                                 
                                         elementList.add(localAddress==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAddress));
                                    } if (localAgeTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://main/xsd",
                                                                      "age"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAge));
                            } if (localAgeDateTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://main/xsd",
                                                                      "ageDate"));
                                 
                                         elementList.add(localAgeDate==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAgeDate));
                                    } if (localAliasesTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://main/xsd",
                                                                      "aliases"));
                                 
                                         elementList.add(localAliases==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAliases));
                                    } if (localAlternativeSpellingTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://main/xsd",
                                                                      "alternativeSpelling"));
                                 
                                         elementList.add(localAlternativeSpelling==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAlternativeSpelling));
                                    } if (localAvgMatchSensitivityTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://main/xsd",
                                                                      "avgMatchSensitivity"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAvgMatchSensitivity));
                            } if (localBirthDateTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://main/xsd",
                                                                      "birthDate"));
                                 
                                         elementList.add(localBirthDate==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localBirthDate));
                                    } if (localCategoryTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://main/xsd",
                                                                      "category"));
                                 
                                         elementList.add(localCategory==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCategory));
                                    } if (localCategoryDescriptionTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://main/xsd",
                                                                      "categoryDescription"));
                                 
                                         elementList.add(localCategoryDescription==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCategoryDescription));
                                    } if (localChangeBeginDateTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://main/xsd",
                                                                      "changeBeginDate"));
                                 
                                         elementList.add(localChangeBeginDate==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localChangeBeginDate));
                                    } if (localChangeCurrentIndTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://main/xsd",
                                                                      "changeCurrentInd"));
                                 
                                         elementList.add(localChangeCurrentInd==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localChangeCurrentInd));
                                    } if (localChangeEndDateTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://main/xsd",
                                                                      "changeEndDate"));
                                 
                                         elementList.add(localChangeEndDate==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localChangeEndDate));
                                    } if (localCitizenShipCountryCodeTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://main/xsd",
                                                                      "citizenShipCountryCode"));
                                 
                                         elementList.add(localCitizenShipCountryCode==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCitizenShipCountryCode));
                                    } if (localCitizenShipCountryNameTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://main/xsd",
                                                                      "citizenShipCountryName"));
                                 
                                         elementList.add(localCitizenShipCountryName==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCitizenShipCountryName));
                                    } if (localCitizenshipTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://main/xsd",
                                                                      "citizenship"));
                                 
                                         elementList.add(localCitizenship==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCitizenship));
                                    } if (localCitizenshpTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://main/xsd",
                                                                      "citizenshp"));
                                 
                                         elementList.add(localCitizenshp==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCitizenshp));
                                    } if (localCityNameTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://main/xsd",
                                                                      "cityName"));
                                 
                                         elementList.add(localCityName==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCityName));
                                    } if (localCompaniesTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://main/xsd",
                                                                      "companies"));
                                 
                                         elementList.add(localCompanies==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCompanies));
                                    } if (localCountriesTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://main/xsd",
                                                                      "countries"));
                                 
                                         elementList.add(localCountries==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCountries));
                                    } if (localCountryCodeTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://main/xsd",
                                                                      "countryCode"));
                                 
                                         elementList.add(localCountryCode==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCountryCode));
                                    } if (localCountryNameTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://main/xsd",
                                                                      "countryName"));
                                 
                                         elementList.add(localCountryName==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCountryName));
                                    } if (localCreateDateTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://main/xsd",
                                                                      "createDate"));
                                 
                                         elementList.add(localCreateDate==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCreateDate));
                                    } if (localCurrentVersionTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://main/xsd",
                                                                      "currentVersion"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCurrentVersion));
                            } if (localDeceasedTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://main/xsd",
                                                                      "deceased"));
                                 
                                         elementList.add(localDeceased==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localDeceased));
                                    } if (localDeceasedIndTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://main/xsd",
                                                                      "deceasedInd"));
                                 
                                         elementList.add(localDeceasedInd==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localDeceasedInd));
                                    } if (localDobsTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://main/xsd",
                                                                      "dobs"));
                                 
                                         elementList.add(localDobs==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localDobs));
                                    } if (localEddBICTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://main/xsd",
                                                                      "eddBIC"));
                                 
                                         elementList.add(localEddBIC==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localEddBIC));
                                    } if (localEddCountryTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://main/xsd",
                                                                      "eddCountry"));
                                 
                                         elementList.add(localEddCountry==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localEddCountry));
                                    } if (localEditorTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://main/xsd",
                                                                      "editor"));
                                 
                                         elementList.add(localEditor==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localEditor));
                                    } if (localEiTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://main/xsd",
                                                                      "ei"));
                                 
                                         elementList.add(localEi==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localEi));
                                    } if (localEnteredTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://main/xsd",
                                                                      "entered"));
                                 
                                         elementList.add(localEntered==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localEntered));
                                    } if (localEntityNameTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://main/xsd",
                                                                      "entityName"));
                                 
                                         elementList.add(localEntityName==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localEntityName));
                                    } if (localEntityNameMatchSensitivityTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://main/xsd",
                                                                      "entityNameMatchSensitivity"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localEntityNameMatchSensitivity));
                            } if (localEntityTitleTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://main/xsd",
                                                                      "entityTitle"));
                                 
                                         elementList.add(localEntityTitle==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localEntityTitle));
                                    } if (localEntityWatchListKeyTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://main/xsd",
                                                                      "entityWatchListKey"));
                                 
                                         elementList.add(localEntityWatchListKey==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localEntityWatchListKey));
                                    } if (localExcludeIndTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://main/xsd",
                                                                      "excludeInd"));
                                 
                                         elementList.add(localExcludeInd==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localExcludeInd));
                                    } if (localExternalSourcesTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://main/xsd",
                                                                      "externalSources"));
                                 
                                         elementList.add(localExternalSources==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localExternalSources));
                                    } if (localFirstNameTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://main/xsd",
                                                                      "firstName"));
                                 
                                         elementList.add(localFirstName==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localFirstName));
                                    } if (localFirstNameMatchSensitivityTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://main/xsd",
                                                                      "firstNameMatchSensitivity"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localFirstNameMatchSensitivity));
                            } if (localFullAddressTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://main/xsd",
                                                                      "fullAddress"));
                                 
                                         elementList.add(localFullAddress==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localFullAddress));
                                    } if (localFurtherInfoTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://main/xsd",
                                                                      "furtherInfo"));
                                 
                                         elementList.add(localFurtherInfo==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localFurtherInfo));
                                    } if (localIdNumbersTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://main/xsd",
                                                                      "idNumbers"));
                                 
                                         elementList.add(localIdNumbers==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localIdNumbers));
                                    } if (localIndenTypeDescTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://main/xsd",
                                                                      "indenTypeDesc"));
                                 
                                         elementList.add(localIndenTypeDesc==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localIndenTypeDesc));
                                    } if (localIndentificationIdTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://main/xsd",
                                                                      "indentificationId"));
                                 
                                         elementList.add(localIndentificationId==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localIndentificationId));
                                    } if (localKeyWordsTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://main/xsd",
                                                                      "keyWords"));
                                 
                                         elementList.add(localKeyWords==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localKeyWords));
                                    } if (localLastNameTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://main/xsd",
                                                                      "lastName"));
                                 
                                         elementList.add(localLastName==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localLastName));
                                    } if (localLastNameMatchSensitivityTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://main/xsd",
                                                                      "lastNameMatchSensitivity"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localLastNameMatchSensitivity));
                            } if (localLinkedToTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://main/xsd",
                                                                      "linkedTo"));
                                 
                                         elementList.add(localLinkedTo==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localLinkedTo));
                                    } if (localLocationsTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://main/xsd",
                                                                      "locations"));
                                 
                                         elementList.add(localLocations==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localLocations));
                                    } if (localLowQualityAliasesTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://main/xsd",
                                                                      "lowQualityAliases"));
                                 
                                         elementList.add(localLowQualityAliases==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localLowQualityAliases));
                                    } if (localMaxMatchSensitivityTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://main/xsd",
                                                                      "maxMatchSensitivity"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localMaxMatchSensitivity));
                            } if (localMiddleNameTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://main/xsd",
                                                                      "middleName"));
                                 
                                         elementList.add(localMiddleName==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localMiddleName));
                                    } if (localMiddleNameMatchSensitivityTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://main/xsd",
                                                                      "middleNameMatchSensitivity"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localMiddleNameMatchSensitivity));
                            } if (localNationalityCountryCodeTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://main/xsd",
                                                                      "nationalityCountryCode"));
                                 
                                         elementList.add(localNationalityCountryCode==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localNationalityCountryCode));
                                    } if (localNationalityCountryNameTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://main/xsd",
                                                                      "nationalityCountryName"));
                                 
                                         elementList.add(localNationalityCountryName==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localNationalityCountryName));
                                    } if (localOccupationDescTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://main/xsd",
                                                                      "occupationDesc"));
                                 
                                         elementList.add(localOccupationDesc==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localOccupationDesc));
                                    } if (localOfficialNameTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://main/xsd",
                                                                      "officialName"));
                                 
                                         elementList.add(localOfficialName==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localOfficialName));
                                    } if (localOrgCountryOfBusinessCodeTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://main/xsd",
                                                                      "orgCountryOfBusinessCode"));
                                 
                                         elementList.add(localOrgCountryOfBusinessCode==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localOrgCountryOfBusinessCode));
                                    } if (localOrgCountryOfBusinessNameTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://main/xsd",
                                                                      "orgCountryOfBusinessName"));
                                 
                                         elementList.add(localOrgCountryOfBusinessName==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localOrgCountryOfBusinessName));
                                    } if (localOrgNameMatchSensitivityTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://main/xsd",
                                                                      "orgNameMatchSensitivity"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localOrgNameMatchSensitivity));
                            } if (localPassportsTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://main/xsd",
                                                                      "passports"));
                                 
                                         elementList.add(localPassports==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPassports));
                                    } if (localPlaceOfBirthTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://main/xsd",
                                                                      "placeOfBirth"));
                                 
                                         elementList.add(localPlaceOfBirth==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPlaceOfBirth));
                                    } if (localPoliticallyExposedTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://main/xsd",
                                                                      "politicallyExposed"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPoliticallyExposed));
                            } if (localPoliticallyExposedPersonIndTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://main/xsd",
                                                                      "politicallyExposedPersonInd"));
                                 
                                         elementList.add(localPoliticallyExposedPersonInd==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPoliticallyExposedPersonInd));
                                    } if (localPositionTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://main/xsd",
                                                                      "position"));
                                 
                                         elementList.add(localPosition==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPosition));
                                    } if (localPostalCodeTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://main/xsd",
                                                                      "postalCode"));
                                 
                                         elementList.add(localPostalCode==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPostalCode));
                                    } if (localProgramsTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://main/xsd",
                                                                      "programs"));
                                 
                                         elementList.add(localPrograms==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPrograms));
                                    } if (localRemarksTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://main/xsd",
                                                                      "remarks"));
                                 
                                         elementList.add(localRemarks==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRemarks));
                                    } if (localSsnTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://main/xsd",
                                                                      "ssn"));
                                 
                                         elementList.add(localSsn==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSsn));
                                    } if (localStateNameTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://main/xsd",
                                                                      "stateName"));
                                 
                                         elementList.add(localStateName==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localStateName));
                                    } if (localSubCategoryTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://main/xsd",
                                                                      "subCategory"));
                                 
                                         elementList.add(localSubCategory==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSubCategory));
                                    } if (localTaxIdTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://main/xsd",
                                                                      "taxId"));
                                 
                                         elementList.add(localTaxId==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTaxId));
                                    } if (localTaxIdTypeCodeTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://main/xsd",
                                                                      "taxIdTypeCode"));
                                 
                                         elementList.add(localTaxIdTypeCode==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTaxIdTypeCode));
                                    } if (localTitleTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://main/xsd",
                                                                      "title"));
                                 
                                         elementList.add(localTitle==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTitle));
                                    } if (localTypeDescriptionTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://main/xsd",
                                                                      "typeDescription"));
                                 
                                         elementList.add(localTypeDescription==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTypeDescription));
                                    } if (localUpdateCategoryTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://main/xsd",
                                                                      "updateCategory"));
                                 
                                         elementList.add(localUpdateCategory==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localUpdateCategory));
                                    } if (localUpdateDateTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://main/xsd",
                                                                      "updateDate"));
                                 
                                         elementList.add(localUpdateDate==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localUpdateDate));
                                    } if (localUpdatedTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://main/xsd",
                                                                      "updated"));
                                 
                                         elementList.add(localUpdated==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localUpdated));
                                    } if (localWatchListNameTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://main/xsd",
                                                                      "watchListName"));
                                 
                                         elementList.add(localWatchListName==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localWatchListName));
                                    } if (localWatchListNumberTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://main/xsd",
                                                                      "watchListNumber"));
                                 
                                         elementList.add(localWatchListNumber==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localWatchListNumber));
                                    } if (localWatchListSubCategoryTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://main/xsd",
                                                                      "watchListSubCategory"));
                                 
                                         elementList.add(localWatchListSubCategory==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localWatchListSubCategory));
                                    } if (localYearOfBirthTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://main/xsd",
                                                                      "yearOfBirth"));
                                 
                                         elementList.add(localYearOfBirth==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localYearOfBirth));
                                    }

                return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(), attribList.toArray());
            
            

        }

  

     /**
      *  Factory class that keeps the parse method
      */
    public static class Factory{

        
        

        /**
        * static method to create the object
        * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
        *                If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
        * Postcondition: If this object is an element, the reader is positioned at its end element
        *                If this object is a complex type, the reader is positioned at the end element of its outer element
        */
        public static WatchListEntity parse(javax.xml.stream.XMLStreamReader reader) throws Exception{
            WatchListEntity object =
                new WatchListEntity();

            int event;
            String nillableValue = null;
            String prefix ="";
            String namespaceuri ="";
            try {
                
                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                
                if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","type")!=null){
                  String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                        "type");
                  if (fullTypeName!=null){
                    String nsPrefix = null;
                    if (fullTypeName.indexOf(":") > -1){
                        nsPrefix = fullTypeName.substring(0,fullTypeName.indexOf(":"));
                    }
                    nsPrefix = nsPrefix==null?"":nsPrefix;

                    String type = fullTypeName.substring(fullTypeName.indexOf(":")+1);
                    
                            if (!"WatchListEntity".equals(type)){
                                //find namespace for the prefix
                                String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (WatchListEntity)ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                
                    
                    reader.next();
                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://main/xsd","address").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    String content = reader.getElementText();
                                    
                                              object.setAddress(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://main/xsd","age").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"age" +"  cannot be null");
                                    }
                                    

                                    String content = reader.getElementText();
                                    
                                              object.setAge(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setAge(Integer.MIN_VALUE);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://main/xsd","ageDate").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    String content = reader.getElementText();
                                    
                                              object.setAgeDate(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://main/xsd","aliases").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    String content = reader.getElementText();
                                    
                                              object.setAliases(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://main/xsd","alternativeSpelling").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    String content = reader.getElementText();
                                    
                                              object.setAlternativeSpelling(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://main/xsd","avgMatchSensitivity").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"avgMatchSensitivity" +"  cannot be null");
                                    }
                                    

                                    String content = reader.getElementText();
                                    
                                              object.setAvgMatchSensitivity(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToDouble(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setAvgMatchSensitivity(Double.NaN);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://main/xsd","birthDate").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    String content = reader.getElementText();
                                    
                                              object.setBirthDate(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://main/xsd","category").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    String content = reader.getElementText();
                                    
                                              object.setCategory(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://main/xsd","categoryDescription").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    String content = reader.getElementText();
                                    
                                              object.setCategoryDescription(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://main/xsd","changeBeginDate").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    String content = reader.getElementText();
                                    
                                              object.setChangeBeginDate(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://main/xsd","changeCurrentInd").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    String content = reader.getElementText();
                                    
                                              object.setChangeCurrentInd(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://main/xsd","changeEndDate").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    String content = reader.getElementText();
                                    
                                              object.setChangeEndDate(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://main/xsd","citizenShipCountryCode").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    String content = reader.getElementText();
                                    
                                              object.setCitizenShipCountryCode(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://main/xsd","citizenShipCountryName").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    String content = reader.getElementText();
                                    
                                              object.setCitizenShipCountryName(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://main/xsd","citizenship").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    String content = reader.getElementText();
                                    
                                              object.setCitizenship(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://main/xsd","citizenshp").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    String content = reader.getElementText();
                                    
                                              object.setCitizenshp(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://main/xsd","cityName").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    String content = reader.getElementText();
                                    
                                              object.setCityName(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://main/xsd","companies").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    String content = reader.getElementText();
                                    
                                              object.setCompanies(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://main/xsd","countries").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    String content = reader.getElementText();
                                    
                                              object.setCountries(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://main/xsd","countryCode").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    String content = reader.getElementText();
                                    
                                              object.setCountryCode(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://main/xsd","countryName").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    String content = reader.getElementText();
                                    
                                              object.setCountryName(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://main/xsd","createDate").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    String content = reader.getElementText();
                                    
                                              object.setCreateDate(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://main/xsd","currentVersion").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"currentVersion" +"  cannot be null");
                                    }
                                    

                                    String content = reader.getElementText();
                                    
                                              object.setCurrentVersion(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://main/xsd","deceased").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    String content = reader.getElementText();
                                    
                                              object.setDeceased(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://main/xsd","deceasedInd").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    String content = reader.getElementText();
                                    
                                              object.setDeceasedInd(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://main/xsd","dobs").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    String content = reader.getElementText();
                                    
                                              object.setDobs(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://main/xsd","eddBIC").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    String content = reader.getElementText();
                                    
                                              object.setEddBIC(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://main/xsd","eddCountry").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    String content = reader.getElementText();
                                    
                                              object.setEddCountry(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://main/xsd","editor").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    String content = reader.getElementText();
                                    
                                              object.setEditor(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://main/xsd","ei").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    String content = reader.getElementText();
                                    
                                              object.setEi(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://main/xsd","entered").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    String content = reader.getElementText();
                                    
                                              object.setEntered(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://main/xsd","entityName").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    String content = reader.getElementText();
                                    
                                              object.setEntityName(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://main/xsd","entityNameMatchSensitivity").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"entityNameMatchSensitivity" +"  cannot be null");
                                    }
                                    

                                    String content = reader.getElementText();
                                    
                                              object.setEntityNameMatchSensitivity(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setEntityNameMatchSensitivity(Integer.MIN_VALUE);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://main/xsd","entityTitle").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    String content = reader.getElementText();
                                    
                                              object.setEntityTitle(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://main/xsd","entityWatchListKey").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    String content = reader.getElementText();
                                    
                                              object.setEntityWatchListKey(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://main/xsd","excludeInd").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    String content = reader.getElementText();
                                    
                                              object.setExcludeInd(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://main/xsd","externalSources").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    String content = reader.getElementText();
                                    
                                              object.setExternalSources(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://main/xsd","firstName").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    String content = reader.getElementText();
                                    
                                              object.setFirstName(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://main/xsd","firstNameMatchSensitivity").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"firstNameMatchSensitivity" +"  cannot be null");
                                    }
                                    

                                    String content = reader.getElementText();
                                    
                                              object.setFirstNameMatchSensitivity(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setFirstNameMatchSensitivity(Integer.MIN_VALUE);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://main/xsd","fullAddress").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    String content = reader.getElementText();
                                    
                                              object.setFullAddress(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://main/xsd","furtherInfo").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    String content = reader.getElementText();
                                    
                                              object.setFurtherInfo(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://main/xsd","idNumbers").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    String content = reader.getElementText();
                                    
                                              object.setIdNumbers(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://main/xsd","indenTypeDesc").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    String content = reader.getElementText();
                                    
                                              object.setIndenTypeDesc(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://main/xsd","indentificationId").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    String content = reader.getElementText();
                                    
                                              object.setIndentificationId(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://main/xsd","keyWords").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    String content = reader.getElementText();
                                    
                                              object.setKeyWords(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://main/xsd","lastName").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    String content = reader.getElementText();
                                    
                                              object.setLastName(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://main/xsd","lastNameMatchSensitivity").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"lastNameMatchSensitivity" +"  cannot be null");
                                    }
                                    

                                    String content = reader.getElementText();
                                    
                                              object.setLastNameMatchSensitivity(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setLastNameMatchSensitivity(Integer.MIN_VALUE);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://main/xsd","linkedTo").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    String content = reader.getElementText();
                                    
                                              object.setLinkedTo(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://main/xsd","locations").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    String content = reader.getElementText();
                                    
                                              object.setLocations(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://main/xsd","lowQualityAliases").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    String content = reader.getElementText();
                                    
                                              object.setLowQualityAliases(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://main/xsd","maxMatchSensitivity").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"maxMatchSensitivity" +"  cannot be null");
                                    }
                                    

                                    String content = reader.getElementText();
                                    
                                              object.setMaxMatchSensitivity(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setMaxMatchSensitivity(Integer.MIN_VALUE);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://main/xsd","middleName").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    String content = reader.getElementText();
                                    
                                              object.setMiddleName(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://main/xsd","middleNameMatchSensitivity").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"middleNameMatchSensitivity" +"  cannot be null");
                                    }
                                    

                                    String content = reader.getElementText();
                                    
                                              object.setMiddleNameMatchSensitivity(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setMiddleNameMatchSensitivity(Integer.MIN_VALUE);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://main/xsd","nationalityCountryCode").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    String content = reader.getElementText();
                                    
                                              object.setNationalityCountryCode(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://main/xsd","nationalityCountryName").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    String content = reader.getElementText();
                                    
                                              object.setNationalityCountryName(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://main/xsd","occupationDesc").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    String content = reader.getElementText();
                                    
                                              object.setOccupationDesc(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://main/xsd","officialName").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    String content = reader.getElementText();
                                    
                                              object.setOfficialName(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://main/xsd","orgCountryOfBusinessCode").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    String content = reader.getElementText();
                                    
                                              object.setOrgCountryOfBusinessCode(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://main/xsd","orgCountryOfBusinessName").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    String content = reader.getElementText();
                                    
                                              object.setOrgCountryOfBusinessName(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://main/xsd","orgNameMatchSensitivity").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"orgNameMatchSensitivity" +"  cannot be null");
                                    }
                                    

                                    String content = reader.getElementText();
                                    
                                              object.setOrgNameMatchSensitivity(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setOrgNameMatchSensitivity(Integer.MIN_VALUE);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://main/xsd","passports").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    String content = reader.getElementText();
                                    
                                              object.setPassports(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://main/xsd","placeOfBirth").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    String content = reader.getElementText();
                                    
                                              object.setPlaceOfBirth(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://main/xsd","politicallyExposed").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"politicallyExposed" +"  cannot be null");
                                    }
                                    

                                    String content = reader.getElementText();
                                    
                                              object.setPoliticallyExposed(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://main/xsd","politicallyExposedPersonInd").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    String content = reader.getElementText();
                                    
                                              object.setPoliticallyExposedPersonInd(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://main/xsd","position").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    String content = reader.getElementText();
                                    
                                              object.setPosition(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://main/xsd","postalCode").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    String content = reader.getElementText();
                                    
                                              object.setPostalCode(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://main/xsd","programs").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    String content = reader.getElementText();
                                    
                                              object.setPrograms(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://main/xsd","remarks").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    String content = reader.getElementText();
                                    
                                              object.setRemarks(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://main/xsd","ssn").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    String content = reader.getElementText();
                                    
                                              object.setSsn(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://main/xsd","stateName").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    String content = reader.getElementText();
                                    
                                              object.setStateName(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://main/xsd","subCategory").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    String content = reader.getElementText();
                                    
                                              object.setSubCategory(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://main/xsd","taxId").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    String content = reader.getElementText();
                                    
                                              object.setTaxId(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://main/xsd","taxIdTypeCode").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    String content = reader.getElementText();
                                    
                                              object.setTaxIdTypeCode(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://main/xsd","title").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    String content = reader.getElementText();
                                    
                                              object.setTitle(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://main/xsd","typeDescription").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    String content = reader.getElementText();
                                    
                                              object.setTypeDescription(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://main/xsd","updateCategory").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    String content = reader.getElementText();
                                    
                                              object.setUpdateCategory(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://main/xsd","updateDate").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    String content = reader.getElementText();
                                    
                                              object.setUpdateDate(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://main/xsd","updated").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    String content = reader.getElementText();
                                    
                                              object.setUpdated(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://main/xsd","watchListName").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    String content = reader.getElementText();
                                    
                                              object.setWatchListName(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://main/xsd","watchListNumber").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    String content = reader.getElementText();
                                    
                                              object.setWatchListNumber(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://main/xsd","watchListSubCategory").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    String content = reader.getElementText();
                                    
                                              object.setWatchListSubCategory(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://main/xsd","yearOfBirth").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    String content = reader.getElementText();
                                    
                                              object.setYearOfBirth(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                  
                            while (!reader.isStartElement() && !reader.isEndElement())
                                reader.next();
                            
                                if (reader.isStartElement())
                                // A start element we are not expecting indicates a trailing invalid property
                                throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                            



            } catch (javax.xml.stream.XMLStreamException e) {
                throw new Exception(e);
            }

            return object;
        }

        }//end of factory class

        

        }
           
    
        public static class SearchWatchList
        implements org.apache.axis2.databinding.ADBBean{
        
                public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName(
                "http://main",
                "searchWatchList",
                "ns2");

            

                        /**
                        * field for RequestID
                        */

                        
                                    protected String localRequestID ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localRequestIDTracker = false ;

                           public boolean isRequestIDSpecified(){
                               return localRequestIDTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  String getRequestID(){
                               return localRequestID;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param RequestID
                               */
                               public void setRequestID(String param){
                            localRequestIDTracker = true;
                                   
                                            this.localRequestID=param;
                                    

                               }
                            

                        /**
                        * field for SourceUser
                        */

                        
                                    protected String localSourceUser ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSourceUserTracker = false ;

                           public boolean isSourceUserSpecified(){
                               return localSourceUserTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  String getSourceUser(){
                               return localSourceUser;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SourceUser
                               */
                               public void setSourceUser(String param){
                            localSourceUserTracker = true;
                                   
                                            this.localSourceUser=param;
                                    

                               }
                            

                        /**
                        * field for SasPassword
                        */

                        
                                    protected String localSasPassword ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSasPasswordTracker = false ;

                           public boolean isSasPasswordSpecified(){
                               return localSasPasswordTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  String getSasPassword(){
                               return localSasPassword;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SasPassword
                               */
                               public void setSasPassword(String param){
                            localSasPasswordTracker = true;
                                   
                                            this.localSasPassword=param;
                                    

                               }
                            

                        /**
                        * field for QueryString
                        */

                        
                                    protected String localQueryString ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localQueryStringTracker = false ;

                           public boolean isQueryStringSpecified(){
                               return localQueryStringTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  String getQueryString(){
                               return localQueryString;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param QueryString
                               */
                               public void setQueryString(String param){
                            localQueryStringTracker = true;
                                   
                                            this.localQueryString=param;
                                    

                               }
                            

                        /**
                        * field for FileName
                        */

                        
                                    protected String localFileName ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localFileNameTracker = false ;

                           public boolean isFileNameSpecified(){
                               return localFileNameTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  String getFileName(){
                               return localFileName;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param FileName
                               */
                               public void setFileName(String param){
                            localFileNameTracker = true;
                                   
                                            this.localFileName=param;
                                    

                               }
                            

                        /**
                        * field for LocalUser
                        */

                        
                                    protected String localLocalUser ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localLocalUserTracker = false ;

                           public boolean isLocalUserSpecified(){
                               return localLocalUserTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  String getLocalUser(){
                               return localLocalUser;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param LocalUser
                               */
                               public void setLocalUser(String param){
                            localLocalUserTracker = true;
                                   
                                            this.localLocalUser=param;
                                    

                               }
                            

     
     
        /**
        *
        * @param parentQName
        * @param factory
        * @return org.apache.axiom.om.OMElement
        */
       public org.apache.axiom.om.OMElement getOMElement (
               final javax.xml.namespace.QName parentQName,
               final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException{


        
               org.apache.axiom.om.OMDataSource dataSource =
                       new org.apache.axis2.databinding.ADBDataSource(this,MY_QNAME);
               return factory.createOMElement(dataSource,MY_QNAME);
            
        }

         public void serialize(final javax.xml.namespace.QName parentQName,
                                       javax.xml.stream.XMLStreamWriter xmlWriter)
                                throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{
                           serialize(parentQName,xmlWriter,false);
         }

         public void serialize(final javax.xml.namespace.QName parentQName,
                               javax.xml.stream.XMLStreamWriter xmlWriter,
                               boolean serializeType)
            throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{
            
                


                String prefix = null;
                String namespace = null;
                

                    prefix = parentQName.getPrefix();
                    namespace = parentQName.getNamespaceURI();
                    writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);
                
                  if (serializeType){
               

                   String namespacePrefix = registerPrefix(xmlWriter,"http://main");
                   if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)){
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           namespacePrefix+":searchWatchList",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "searchWatchList",
                           xmlWriter);
                   }

               
                   }
                if (localRequestIDTracker){
                                    namespace = "http://main";
                                    writeStartElement(null, namespace, "requestID", xmlWriter);
                             

                                          if (localRequestID==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localRequestID);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localSourceUserTracker){
                                    namespace = "http://main";
                                    writeStartElement(null, namespace, "sourceUser", xmlWriter);
                             

                                          if (localSourceUser==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localSourceUser);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localSasPasswordTracker){
                                    namespace = "http://main";
                                    writeStartElement(null, namespace, "sasPassword", xmlWriter);
                             

                                          if (localSasPassword==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localSasPassword);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localQueryStringTracker){
                                    namespace = "http://main";
                                    writeStartElement(null, namespace, "queryString", xmlWriter);
                             

                                          if (localQueryString==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localQueryString);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localFileNameTracker){
                                    namespace = "http://main";
                                    writeStartElement(null, namespace, "fileName", xmlWriter);
                             

                                          if (localFileName==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localFileName);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localLocalUserTracker){
                                    namespace = "http://main";
                                    writeStartElement(null, namespace, "localUser", xmlWriter);
                             

                                          if (localLocalUser==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localLocalUser);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             }
                    xmlWriter.writeEndElement();
               

        }

        private static String generatePrefix(String namespace) {
            if(namespace.equals("http://main")){
                return "ns2";
            }
            return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }

        /**
         * Utility method to write an element start tag.
         */
        private void writeStartElement(String prefix, String namespace, String localPart,
                                       javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            String writerPrefix = xmlWriter.getPrefix(namespace);
            if (writerPrefix != null) {
                xmlWriter.writeStartElement(namespace, localPart);
            } else {
                if (namespace.length() == 0) {
                    prefix = "";
                } else if (prefix == null) {
                    prefix = generatePrefix(namespace);
                }

                xmlWriter.writeStartElement(prefix, localPart, namespace);
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
        }
        
        /**
         * Util method to write an attribute with the ns prefix
         */
        private void writeAttribute(String prefix, String namespace, String attName,
                                    String attValue, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
            if (xmlWriter.getPrefix(namespace) == null) {
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            xmlWriter.writeAttribute(namespace,attName,attValue);
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeAttribute(String namespace, String attName,
                                    String attValue, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName,attValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace,attName,attValue);
            }
        }


           /**
             * Util method to write an attribute without the ns prefix
             */
            private void writeQNameAttribute(String namespace, String attName,
                                             javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

                String attributeNamespace = qname.getNamespaceURI();
                String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
                if (attributePrefix == null) {
                    attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
                }
                String attributeValue;
                if (attributePrefix.trim().length() > 0) {
                    attributeValue = attributePrefix + ":" + qname.getLocalPart();
                } else {
                    attributeValue = qname.getLocalPart();
                }

                if (namespace.equals("")) {
                    xmlWriter.writeAttribute(attName, attributeValue);
                } else {
                    registerPrefix(xmlWriter, namespace);
                    xmlWriter.writeAttribute(namespace, attName, attributeValue);
                }
            }
        /**
         *  method to handle Qnames
         */

        private void writeQName(javax.xml.namespace.QName qname,
                                javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            String namespaceURI = qname.getNamespaceURI();
            if (namespaceURI != null) {
                String prefix = xmlWriter.getPrefix(namespaceURI);
                if (prefix == null) {
                    prefix = generatePrefix(namespaceURI);
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix,namespaceURI);
                }

                if (prefix.trim().length() > 0){
                    xmlWriter.writeCharacters(prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                } else {
                    // i.e this is the default namespace
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                }

            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
            }
        }

        private void writeQNames(javax.xml.namespace.QName[] qnames,
                                 javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

            if (qnames != null) {
                // we have to store this data until last moment since it is not possible to write any
                // namespace data after writing the charactor data
                StringBuffer stringToWrite = new StringBuffer();
                String namespaceURI = null;
                String prefix = null;

                for (int i = 0; i < qnames.length; i++) {
                    if (i > 0) {
                        stringToWrite.append(" ");
                    }
                    namespaceURI = qnames[i].getNamespaceURI();
                    if (namespaceURI != null) {
                        prefix = xmlWriter.getPrefix(namespaceURI);
                        if ((prefix == null) || (prefix.length() == 0)) {
                            prefix = generatePrefix(namespaceURI);
                            xmlWriter.writeNamespace(prefix, namespaceURI);
                            xmlWriter.setPrefix(prefix,namespaceURI);
                        }

                        if (prefix.trim().length() > 0){
                            stringToWrite.append(prefix).append(":").append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        } else {
                            stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        }
                    } else {
                        stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                    }
                }
                xmlWriter.writeCharacters(stringToWrite.toString());
            }

        }


        /**
         * Register a namespace prefix
         */
        private String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, String namespace) throws javax.xml.stream.XMLStreamException {
            String prefix = xmlWriter.getPrefix(namespace);
            if (prefix == null) {
                prefix = generatePrefix(namespace);
                javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
                while (true) {
                    String uri = nsContext.getNamespaceURI(prefix);
                    if (uri == null || uri.length() == 0) {
                        break;
                    }
                    prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                }
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            return prefix;
        }


  
        /**
        * databinding method to get an XML representation of this object
        *
        */
        public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName)
                    throws org.apache.axis2.databinding.ADBException{


        
                 java.util.ArrayList elementList = new java.util.ArrayList();
                 java.util.ArrayList attribList = new java.util.ArrayList();

                 if (localRequestIDTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://main",
                                                                      "requestID"));
                                 
                                         elementList.add(localRequestID==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRequestID));
                                    } if (localSourceUserTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://main",
                                                                      "sourceUser"));
                                 
                                         elementList.add(localSourceUser==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSourceUser));
                                    } if (localSasPasswordTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://main",
                                                                      "sasPassword"));
                                 
                                         elementList.add(localSasPassword==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSasPassword));
                                    } if (localQueryStringTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://main",
                                                                      "queryString"));
                                 
                                         elementList.add(localQueryString==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localQueryString));
                                    } if (localFileNameTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://main",
                                                                      "fileName"));
                                 
                                         elementList.add(localFileName==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localFileName));
                                    } if (localLocalUserTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://main",
                                                                      "localUser"));
                                 
                                         elementList.add(localLocalUser==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localLocalUser));
                                    }

                return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(), attribList.toArray());
            
            

        }

  

     /**
      *  Factory class that keeps the parse method
      */
    public static class Factory{

        
        

        /**
        * static method to create the object
        * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
        *                If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
        * Postcondition: If this object is an element, the reader is positioned at its end element
        *                If this object is a complex type, the reader is positioned at the end element of its outer element
        */
        public static SearchWatchList parse(javax.xml.stream.XMLStreamReader reader) throws Exception{
            SearchWatchList object =
                new SearchWatchList();

            int event;
            String nillableValue = null;
            String prefix ="";
            String namespaceuri ="";
            try {
                
                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                
                if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","type")!=null){
                  String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                        "type");
                  if (fullTypeName!=null){
                    String nsPrefix = null;
                    if (fullTypeName.indexOf(":") > -1){
                        nsPrefix = fullTypeName.substring(0,fullTypeName.indexOf(":"));
                    }
                    nsPrefix = nsPrefix==null?"":nsPrefix;

                    String type = fullTypeName.substring(fullTypeName.indexOf(":")+1);
                    
                            if (!"searchWatchList".equals(type)){
                                //find namespace for the prefix
                                String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (SearchWatchList)ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                
                    
                    reader.next();
                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://main","requestID").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    String content = reader.getElementText();
                                    
                                              object.setRequestID(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://main","sourceUser").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    String content = reader.getElementText();
                                    
                                              object.setSourceUser(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://main","sasPassword").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    String content = reader.getElementText();
                                    
                                              object.setSasPassword(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://main","queryString").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    String content = reader.getElementText();
                                    
                                              object.setQueryString(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://main","fileName").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    String content = reader.getElementText();
                                    
                                              object.setFileName(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://main","localUser").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    String content = reader.getElementText();
                                    
                                              object.setLocalUser(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                  
                            while (!reader.isStartElement() && !reader.isEndElement())
                                reader.next();
                            
                                if (reader.isStartElement())
                                // A start element we are not expecting indicates a trailing invalid property
                                throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                            



            } catch (javax.xml.stream.XMLStreamException e) {
                throw new Exception(e);
            }

            return object;
        }

        }//end of factory class

        

        }
           
    
        public static class ExtensionMapper{

          public static Object getTypeObject(String namespaceURI,
                                             String typeName,
                                             javax.xml.stream.XMLStreamReader reader) throws Exception{

              
                  if (
                  "http://main/xsd".equals(namespaceURI) &&
                  "WatchListEntity".equals(typeName)){
                   
                            return  WatchListEntity.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://main/xsd".equals(namespaceURI) &&
                  "SearchResults".equals(typeName)){
                   
                            return  SearchResults.Factory.parse(reader);
                        

                  }

              
             throw new org.apache.axis2.databinding.ADBException("Unsupported type " + namespaceURI + " " + typeName);
          }

        }
    
        public static class SearchResults
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = SearchResults
                Namespace URI = http://main/xsd
                Namespace Prefix = ns1
                */
            

                        /**
                        * field for CountryListMatches
                        * This was an Array!
                        */

                        
                                    protected WatchListEntity[] localCountryListMatches ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localCountryListMatchesTracker = false ;

                           public boolean isCountryListMatchesSpecified(){
                               return localCountryListMatchesTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return WatchListEntity[]
                           */
                           public  WatchListEntity[] getCountryListMatches(){
                               return localCountryListMatches;
                           }

                           
                        


                               
                              /**
                               * validate the array for CountryListMatches
                               */
                              protected void validateCountryListMatches(WatchListEntity[] param){
                             
                              }


                             /**
                              * Auto generated setter method
                              * @param param CountryListMatches
                              */
                              public void setCountryListMatches(WatchListEntity[] param){
                              
                                   validateCountryListMatches(param);

                               localCountryListMatchesTracker = true;
                                      
                                      this.localCountryListMatches=param;
                              }

                               
                             
                             /**
                             * Auto generated add method for the array for convenience
                             * @param param WatchListEntity
                             */
                             public void addCountryListMatches(WatchListEntity param){
                                   if (localCountryListMatches == null){
                                   localCountryListMatches = new WatchListEntity[]{};
                                   }

                            
                                 //update the setting tracker
                                localCountryListMatchesTracker = true;
                            

                               java.util.List list =
                            org.apache.axis2.databinding.utils.ConverterUtil.toList(localCountryListMatches);
                               list.add(param);
                               this.localCountryListMatches =
                             (WatchListEntity[])list.toArray(
                            new WatchListEntity[list.size()]);

                             }
                             

                        /**
                        * field for ErrorMsg
                        */

                        
                                    protected String localErrorMsg ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localErrorMsgTracker = false ;

                           public boolean isErrorMsgSpecified(){
                               return localErrorMsgTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  String getErrorMsg(){
                               return localErrorMsg;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ErrorMsg
                               */
                               public void setErrorMsg(String param){
                            localErrorMsgTracker = true;
                                   
                                            this.localErrorMsg=param;
                                    

                               }
                            

                        /**
                        * field for IndentityListMatches
                        * This was an Array!
                        */

                        
                                    protected WatchListEntity[] localIndentityListMatches ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localIndentityListMatchesTracker = false ;

                           public boolean isIndentityListMatchesSpecified(){
                               return localIndentityListMatchesTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return WatchListEntity[]
                           */
                           public  WatchListEntity[] getIndentityListMatches(){
                               return localIndentityListMatches;
                           }

                           
                        


                               
                              /**
                               * validate the array for IndentityListMatches
                               */
                              protected void validateIndentityListMatches(WatchListEntity[] param){
                             
                              }


                             /**
                              * Auto generated setter method
                              * @param param IndentityListMatches
                              */
                              public void setIndentityListMatches(WatchListEntity[] param){
                              
                                   validateIndentityListMatches(param);

                               localIndentityListMatchesTracker = true;
                                      
                                      this.localIndentityListMatches=param;
                              }

                               
                             
                             /**
                             * Auto generated add method for the array for convenience
                             * @param param WatchListEntity
                             */
                             public void addIndentityListMatches(WatchListEntity param){
                                   if (localIndentityListMatches == null){
                                   localIndentityListMatches = new WatchListEntity[]{};
                                   }

                            
                                 //update the setting tracker
                                localIndentityListMatchesTracker = true;
                            

                               java.util.List list =
                            org.apache.axis2.databinding.utils.ConverterUtil.toList(localIndentityListMatches);
                               list.add(param);
                               this.localIndentityListMatches =
                             (WatchListEntity[])list.toArray(
                            new WatchListEntity[list.size()]);

                             }
                             

                        /**
                        * field for MatchFound
                        */

                        
                                    protected boolean localMatchFound ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localMatchFoundTracker = false ;

                           public boolean isMatchFoundSpecified(){
                               return localMatchFoundTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getMatchFound(){
                               return localMatchFound;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param MatchFound
                               */
                               public void setMatchFound(boolean param){
                            
                                       // setting primitive attribute tracker to true
                                       localMatchFoundTracker =
                                       true;
                                   
                                            this.localMatchFound=param;
                                    

                               }
                            

                        /**
                        * field for Success
                        */

                        
                                    protected boolean localSuccess ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSuccessTracker = false ;

                           public boolean isSuccessSpecified(){
                               return localSuccessTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getSuccess(){
                               return localSuccess;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Success
                               */
                               public void setSuccess(boolean param){
                            
                                       // setting primitive attribute tracker to true
                                       localSuccessTracker =
                                       true;
                                   
                                            this.localSuccess=param;
                                    

                               }
                            

                        /**
                        * field for WatchListMatches
                        * This was an Array!
                        */

                        
                                    protected WatchListEntity[] localWatchListMatches ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localWatchListMatchesTracker = false ;

                           public boolean isWatchListMatchesSpecified(){
                               return localWatchListMatchesTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return WatchListEntity[]
                           */
                           public  WatchListEntity[] getWatchListMatches(){
                               return localWatchListMatches;
                           }

                           
                        


                               
                              /**
                               * validate the array for WatchListMatches
                               */
                              protected void validateWatchListMatches(WatchListEntity[] param){
                             
                              }


                             /**
                              * Auto generated setter method
                              * @param param WatchListMatches
                              */
                              public void setWatchListMatches(WatchListEntity[] param){
                              
                                   validateWatchListMatches(param);

                               localWatchListMatchesTracker = true;
                                      
                                      this.localWatchListMatches=param;
                              }

                               
                             
                             /**
                             * Auto generated add method for the array for convenience
                             * @param param WatchListEntity
                             */
                             public void addWatchListMatches(WatchListEntity param){
                                   if (localWatchListMatches == null){
                                   localWatchListMatches = new WatchListEntity[]{};
                                   }

                            
                                 //update the setting tracker
                                localWatchListMatchesTracker = true;
                            

                               java.util.List list =
                            org.apache.axis2.databinding.utils.ConverterUtil.toList(localWatchListMatches);
                               list.add(param);
                               this.localWatchListMatches =
                             (WatchListEntity[])list.toArray(
                            new WatchListEntity[list.size()]);

                             }
                             

     
     
        /**
        *
        * @param parentQName
        * @param factory
        * @return org.apache.axiom.om.OMElement
        */
       public org.apache.axiom.om.OMElement getOMElement (
               final javax.xml.namespace.QName parentQName,
               final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException{


        
               org.apache.axiom.om.OMDataSource dataSource =
                       new org.apache.axis2.databinding.ADBDataSource(this,parentQName);
               return factory.createOMElement(dataSource,parentQName);
            
        }

         public void serialize(final javax.xml.namespace.QName parentQName,
                                       javax.xml.stream.XMLStreamWriter xmlWriter)
                                throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{
                           serialize(parentQName,xmlWriter,false);
         }

         public void serialize(final javax.xml.namespace.QName parentQName,
                               javax.xml.stream.XMLStreamWriter xmlWriter,
                               boolean serializeType)
            throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{
            
                


                String prefix = null;
                String namespace = null;
                

                    prefix = parentQName.getPrefix();
                    namespace = parentQName.getNamespaceURI();
                    writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);
                
                  if (serializeType){
               

                   String namespacePrefix = registerPrefix(xmlWriter,"http://main/xsd");
                   if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)){
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           namespacePrefix+":SearchResults",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "SearchResults",
                           xmlWriter);
                   }

               
                   }
                if (localCountryListMatchesTracker){
                                       if (localCountryListMatches!=null){
                                            for (int i = 0;i < localCountryListMatches.length;i++){
                                                if (localCountryListMatches[i] != null){
                                                 localCountryListMatches[i].serialize(new javax.xml.namespace.QName("http://main/xsd","countryListMatches"),
                                                           xmlWriter);
                                                } else {
                                                   
                                                            writeStartElement(null, "http://main/xsd", "countryListMatches", xmlWriter);

                                                           // write the nil attribute
                                                           writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                           xmlWriter.writeEndElement();
                                                    
                                                }

                                            }
                                     } else {
                                        
                                                writeStartElement(null, "http://main/xsd", "countryListMatches", xmlWriter);

                                               // write the nil attribute
                                               writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                               xmlWriter.writeEndElement();
                                        
                                    }
                                 } if (localErrorMsgTracker){
                                    namespace = "http://main/xsd";
                                    writeStartElement(null, namespace, "errorMsg", xmlWriter);
                             

                                          if (localErrorMsg==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localErrorMsg);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localIndentityListMatchesTracker){
                                       if (localIndentityListMatches!=null){
                                            for (int i = 0;i < localIndentityListMatches.length;i++){
                                                if (localIndentityListMatches[i] != null){
                                                 localIndentityListMatches[i].serialize(new javax.xml.namespace.QName("http://main/xsd","indentityListMatches"),
                                                           xmlWriter);
                                                } else {
                                                   
                                                            writeStartElement(null, "http://main/xsd", "indentityListMatches", xmlWriter);

                                                           // write the nil attribute
                                                           writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                           xmlWriter.writeEndElement();
                                                    
                                                }

                                            }
                                     } else {
                                        
                                                writeStartElement(null, "http://main/xsd", "indentityListMatches", xmlWriter);

                                               // write the nil attribute
                                               writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                               xmlWriter.writeEndElement();
                                        
                                    }
                                 } if (localMatchFoundTracker){
                                    namespace = "http://main/xsd";
                                    writeStartElement(null, namespace, "matchFound", xmlWriter);
                             
                                               if (false) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("matchFound cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localMatchFound));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localSuccessTracker){
                                    namespace = "http://main/xsd";
                                    writeStartElement(null, namespace, "success", xmlWriter);
                             
                                               if (false) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("success cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSuccess));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localWatchListMatchesTracker){
                                       if (localWatchListMatches!=null){
                                            for (int i = 0;i < localWatchListMatches.length;i++){
                                                if (localWatchListMatches[i] != null){
                                                 localWatchListMatches[i].serialize(new javax.xml.namespace.QName("http://main/xsd","watchListMatches"),
                                                           xmlWriter);
                                                } else {
                                                   
                                                            writeStartElement(null, "http://main/xsd", "watchListMatches", xmlWriter);

                                                           // write the nil attribute
                                                           writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                           xmlWriter.writeEndElement();
                                                    
                                                }

                                            }
                                     } else {
                                        
                                                writeStartElement(null, "http://main/xsd", "watchListMatches", xmlWriter);

                                               // write the nil attribute
                                               writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                               xmlWriter.writeEndElement();
                                        
                                    }
                                 }
                    xmlWriter.writeEndElement();
               

        }

        private static String generatePrefix(String namespace) {
            if(namespace.equals("http://main/xsd")){
                return "ns1";
            }
            return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }

        /**
         * Utility method to write an element start tag.
         */
        private void writeStartElement(String prefix, String namespace, String localPart,
                                       javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            String writerPrefix = xmlWriter.getPrefix(namespace);
            if (writerPrefix != null) {
                xmlWriter.writeStartElement(namespace, localPart);
            } else {
                if (namespace.length() == 0) {
                    prefix = "";
                } else if (prefix == null) {
                    prefix = generatePrefix(namespace);
                }

                xmlWriter.writeStartElement(prefix, localPart, namespace);
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
        }
        
        /**
         * Util method to write an attribute with the ns prefix
         */
        private void writeAttribute(String prefix, String namespace, String attName,
                                    String attValue, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
            if (xmlWriter.getPrefix(namespace) == null) {
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            xmlWriter.writeAttribute(namespace,attName,attValue);
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeAttribute(String namespace, String attName,
                                    String attValue, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName,attValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace,attName,attValue);
            }
        }


           /**
             * Util method to write an attribute without the ns prefix
             */
            private void writeQNameAttribute(String namespace, String attName,
                                             javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

                String attributeNamespace = qname.getNamespaceURI();
                String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
                if (attributePrefix == null) {
                    attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
                }
                String attributeValue;
                if (attributePrefix.trim().length() > 0) {
                    attributeValue = attributePrefix + ":" + qname.getLocalPart();
                } else {
                    attributeValue = qname.getLocalPart();
                }

                if (namespace.equals("")) {
                    xmlWriter.writeAttribute(attName, attributeValue);
                } else {
                    registerPrefix(xmlWriter, namespace);
                    xmlWriter.writeAttribute(namespace, attName, attributeValue);
                }
            }
        /**
         *  method to handle Qnames
         */

        private void writeQName(javax.xml.namespace.QName qname,
                                javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            String namespaceURI = qname.getNamespaceURI();
            if (namespaceURI != null) {
                String prefix = xmlWriter.getPrefix(namespaceURI);
                if (prefix == null) {
                    prefix = generatePrefix(namespaceURI);
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix,namespaceURI);
                }

                if (prefix.trim().length() > 0){
                    xmlWriter.writeCharacters(prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                } else {
                    // i.e this is the default namespace
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                }

            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
            }
        }

        private void writeQNames(javax.xml.namespace.QName[] qnames,
                                 javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

            if (qnames != null) {
                // we have to store this data until last moment since it is not possible to write any
                // namespace data after writing the charactor data
                StringBuffer stringToWrite = new StringBuffer();
                String namespaceURI = null;
                String prefix = null;

                for (int i = 0; i < qnames.length; i++) {
                    if (i > 0) {
                        stringToWrite.append(" ");
                    }
                    namespaceURI = qnames[i].getNamespaceURI();
                    if (namespaceURI != null) {
                        prefix = xmlWriter.getPrefix(namespaceURI);
                        if ((prefix == null) || (prefix.length() == 0)) {
                            prefix = generatePrefix(namespaceURI);
                            xmlWriter.writeNamespace(prefix, namespaceURI);
                            xmlWriter.setPrefix(prefix,namespaceURI);
                        }

                        if (prefix.trim().length() > 0){
                            stringToWrite.append(prefix).append(":").append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        } else {
                            stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        }
                    } else {
                        stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                    }
                }
                xmlWriter.writeCharacters(stringToWrite.toString());
            }

        }


        /**
         * Register a namespace prefix
         */
        private String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, String namespace) throws javax.xml.stream.XMLStreamException {
            String prefix = xmlWriter.getPrefix(namespace);
            if (prefix == null) {
                prefix = generatePrefix(namespace);
                javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
                while (true) {
                    String uri = nsContext.getNamespaceURI(prefix);
                    if (uri == null || uri.length() == 0) {
                        break;
                    }
                    prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                }
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            return prefix;
        }


  
        /**
        * databinding method to get an XML representation of this object
        *
        */
        public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName)
                    throws org.apache.axis2.databinding.ADBException{


        
                 java.util.ArrayList elementList = new java.util.ArrayList();
                 java.util.ArrayList attribList = new java.util.ArrayList();

                 if (localCountryListMatchesTracker){
                             if (localCountryListMatches!=null) {
                                 for (int i = 0;i < localCountryListMatches.length;i++){

                                    if (localCountryListMatches[i] != null){
                                         elementList.add(new javax.xml.namespace.QName("http://main/xsd",
                                                                          "countryListMatches"));
                                         elementList.add(localCountryListMatches[i]);
                                    } else {
                                        
                                                elementList.add(new javax.xml.namespace.QName("http://main/xsd",
                                                                          "countryListMatches"));
                                                elementList.add(null);
                                            
                                    }

                                 }
                             } else {
                                 
                                        elementList.add(new javax.xml.namespace.QName("http://main/xsd",
                                                                          "countryListMatches"));
                                        elementList.add(localCountryListMatches);
                                    
                             }

                        } if (localErrorMsgTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://main/xsd",
                                                                      "errorMsg"));
                                 
                                         elementList.add(localErrorMsg==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localErrorMsg));
                                    } if (localIndentityListMatchesTracker){
                             if (localIndentityListMatches!=null) {
                                 for (int i = 0;i < localIndentityListMatches.length;i++){

                                    if (localIndentityListMatches[i] != null){
                                         elementList.add(new javax.xml.namespace.QName("http://main/xsd",
                                                                          "indentityListMatches"));
                                         elementList.add(localIndentityListMatches[i]);
                                    } else {
                                        
                                                elementList.add(new javax.xml.namespace.QName("http://main/xsd",
                                                                          "indentityListMatches"));
                                                elementList.add(null);
                                            
                                    }

                                 }
                             } else {
                                 
                                        elementList.add(new javax.xml.namespace.QName("http://main/xsd",
                                                                          "indentityListMatches"));
                                        elementList.add(localIndentityListMatches);
                                    
                             }

                        } if (localMatchFoundTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://main/xsd",
                                                                      "matchFound"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localMatchFound));
                            } if (localSuccessTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://main/xsd",
                                                                      "success"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSuccess));
                            } if (localWatchListMatchesTracker){
                             if (localWatchListMatches!=null) {
                                 for (int i = 0;i < localWatchListMatches.length;i++){

                                    if (localWatchListMatches[i] != null){
                                         elementList.add(new javax.xml.namespace.QName("http://main/xsd",
                                                                          "watchListMatches"));
                                         elementList.add(localWatchListMatches[i]);
                                    } else {
                                        
                                                elementList.add(new javax.xml.namespace.QName("http://main/xsd",
                                                                          "watchListMatches"));
                                                elementList.add(null);
                                            
                                    }

                                 }
                             } else {
                                 
                                        elementList.add(new javax.xml.namespace.QName("http://main/xsd",
                                                                          "watchListMatches"));
                                        elementList.add(localWatchListMatches);
                                    
                             }

                        }

                return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(), attribList.toArray());
            
            

        }

  

     /**
      *  Factory class that keeps the parse method
      */
    public static class Factory{

        
        

        /**
        * static method to create the object
        * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
        *                If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
        * Postcondition: If this object is an element, the reader is positioned at its end element
        *                If this object is a complex type, the reader is positioned at the end element of its outer element
        */
        public static SearchResults parse(javax.xml.stream.XMLStreamReader reader) throws Exception{
            SearchResults object =
                new SearchResults();

            int event;
            String nillableValue = null;
            String prefix ="";
            String namespaceuri ="";
            try {
                
                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                
                if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","type")!=null){
                  String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                        "type");
                  if (fullTypeName!=null){
                    String nsPrefix = null;
                    if (fullTypeName.indexOf(":") > -1){
                        nsPrefix = fullTypeName.substring(0,fullTypeName.indexOf(":"));
                    }
                    nsPrefix = nsPrefix==null?"":nsPrefix;

                    String type = fullTypeName.substring(fullTypeName.indexOf(":")+1);
                    
                            if (!"SearchResults".equals(type)){
                                //find namespace for the prefix
                                String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (SearchResults)ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                
                    
                    reader.next();
                
                        java.util.ArrayList list1 = new java.util.ArrayList();
                    
                        java.util.ArrayList list3 = new java.util.ArrayList();
                    
                        java.util.ArrayList list6 = new java.util.ArrayList();
                    
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://main/xsd","countryListMatches").equals(reader.getName())){
                                
                                    
                                    
                                    // Process the array and step past its final element's end.
                                    
                                                          nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                                          if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                              list1.add(null);
                                                              reader.next();
                                                          } else {
                                                        list1.add(WatchListEntity.Factory.parse(reader));
                                                                }
                                                        //loop until we find a start element that is not part of this array
                                                        boolean loopDone1 = false;
                                                        while(!loopDone1){
                                                            // We should be at the end element, but make sure
                                                            while (!reader.isEndElement())
                                                                reader.next();
                                                            // Step out of this element
                                                            reader.next();
                                                            // Step to next element event.
                                                            while (!reader.isStartElement() && !reader.isEndElement())
                                                                reader.next();
                                                            if (reader.isEndElement()){
                                                                //two continuous end elements means we are exiting the xml structure
                                                                loopDone1 = true;
                                                            } else {
                                                                if (new javax.xml.namespace.QName("http://main/xsd","countryListMatches").equals(reader.getName())){
                                                                    
                                                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                                          list1.add(null);
                                                                          reader.next();
                                                                      } else {
                                                                    list1.add(WatchListEntity.Factory.parse(reader));
                                                                        }
                                                                }else{
                                                                    loopDone1 = true;
                                                                }
                                                            }
                                                        }
                                                        // call the converter utility  to convert and set the array
                                                        
                                                        object.setCountryListMatches((WatchListEntity[])
                                                            org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                                                                WatchListEntity.class,
                                                                list1));
                                                            
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://main/xsd","errorMsg").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    String content = reader.getElementText();
                                    
                                              object.setErrorMsg(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://main/xsd","indentityListMatches").equals(reader.getName())){
                                
                                    
                                    
                                    // Process the array and step past its final element's end.
                                    
                                                          nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                                          if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                              list3.add(null);
                                                              reader.next();
                                                          } else {
                                                        list3.add(WatchListEntity.Factory.parse(reader));
                                                                }
                                                        //loop until we find a start element that is not part of this array
                                                        boolean loopDone3 = false;
                                                        while(!loopDone3){
                                                            // We should be at the end element, but make sure
                                                            while (!reader.isEndElement())
                                                                reader.next();
                                                            // Step out of this element
                                                            reader.next();
                                                            // Step to next element event.
                                                            while (!reader.isStartElement() && !reader.isEndElement())
                                                                reader.next();
                                                            if (reader.isEndElement()){
                                                                //two continuous end elements means we are exiting the xml structure
                                                                loopDone3 = true;
                                                            } else {
                                                                if (new javax.xml.namespace.QName("http://main/xsd","indentityListMatches").equals(reader.getName())){
                                                                    
                                                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                                          list3.add(null);
                                                                          reader.next();
                                                                      } else {
                                                                    list3.add(WatchListEntity.Factory.parse(reader));
                                                                        }
                                                                }else{
                                                                    loopDone3 = true;
                                                                }
                                                            }
                                                        }
                                                        // call the converter utility  to convert and set the array
                                                        
                                                        object.setIndentityListMatches((WatchListEntity[])
                                                            org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                                                                WatchListEntity.class,
                                                                list3));
                                                            
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://main/xsd","matchFound").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"matchFound" +"  cannot be null");
                                    }
                                    

                                    String content = reader.getElementText();
                                    
                                              object.setMatchFound(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://main/xsd","success").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"success" +"  cannot be null");
                                    }
                                    

                                    String content = reader.getElementText();
                                    
                                              object.setSuccess(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://main/xsd","watchListMatches").equals(reader.getName())){
                                
                                    
                                    
                                    // Process the array and step past its final element's end.
                                    
                                                          nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                                          if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                              list6.add(null);
                                                              reader.next();
                                                          } else {
                                                        list6.add(WatchListEntity.Factory.parse(reader));
                                                                }
                                                        //loop until we find a start element that is not part of this array
                                                        boolean loopDone6 = false;
                                                        while(!loopDone6){
                                                            // We should be at the end element, but make sure
                                                            while (!reader.isEndElement())
                                                                reader.next();
                                                            // Step out of this element
                                                            reader.next();
                                                            // Step to next element event.
                                                            while (!reader.isStartElement() && !reader.isEndElement())
                                                                reader.next();
                                                            if (reader.isEndElement()){
                                                                //two continuous end elements means we are exiting the xml structure
                                                                loopDone6 = true;
                                                            } else {
                                                                if (new javax.xml.namespace.QName("http://main/xsd","watchListMatches").equals(reader.getName())){
                                                                    
                                                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                                          list6.add(null);
                                                                          reader.next();
                                                                      } else {
                                                                    list6.add(WatchListEntity.Factory.parse(reader));
                                                                        }
                                                                }else{
                                                                    loopDone6 = true;
                                                                }
                                                            }
                                                        }
                                                        // call the converter utility  to convert and set the array
                                                        
                                                        object.setWatchListMatches((WatchListEntity[])
                                                            org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                                                                WatchListEntity.class,
                                                                list6));
                                                            
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                  
                            while (!reader.isStartElement() && !reader.isEndElement())
                                reader.next();
                            
                                if (reader.isStartElement())
                                // A start element we are not expecting indicates a trailing invalid property
                                throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                            



            } catch (javax.xml.stream.XMLStreamException e) {
                throw new Exception(e);
            }

            return object;
        }

        }//end of factory class

        

        }
           
    
        public static class SearchWatchListResponse
        implements org.apache.axis2.databinding.ADBBean{
        
                public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName(
                "http://main",
                "searchWatchListResponse",
                "ns2");

            

                        /**
                        * field for _return
                        */

                        
                                    protected SearchResults local_return ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean local_returnTracker = false ;

                           public boolean is_returnSpecified(){
                               return local_returnTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return SearchResults
                           */
                           public  SearchResults get_return(){
                               return local_return;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param _return
                               */
                               public void set_return(SearchResults param){
                            local_returnTracker = true;
                                   
                                            this.local_return=param;
                                    

                               }
                            

     
     
        /**
        *
        * @param parentQName
        * @param factory
        * @return org.apache.axiom.om.OMElement
        */
       public org.apache.axiom.om.OMElement getOMElement (
               final javax.xml.namespace.QName parentQName,
               final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException{


        
               org.apache.axiom.om.OMDataSource dataSource =
                       new org.apache.axis2.databinding.ADBDataSource(this,MY_QNAME);
               return factory.createOMElement(dataSource,MY_QNAME);
            
        }

         public void serialize(final javax.xml.namespace.QName parentQName,
                                       javax.xml.stream.XMLStreamWriter xmlWriter)
                                throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{
                           serialize(parentQName,xmlWriter,false);
         }

         public void serialize(final javax.xml.namespace.QName parentQName,
                               javax.xml.stream.XMLStreamWriter xmlWriter,
                               boolean serializeType)
            throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{
            
                


                String prefix = null;
                String namespace = null;
                

                    prefix = parentQName.getPrefix();
                    namespace = parentQName.getNamespaceURI();
                    writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);
                
                  if (serializeType){
               

                   String namespacePrefix = registerPrefix(xmlWriter,"http://main");
                   if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)){
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           namespacePrefix+":searchWatchListResponse",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "searchWatchListResponse",
                           xmlWriter);
                   }

               
                   }
                if (local_returnTracker){
                                    if (local_return==null){

                                        writeStartElement(null, "http://main", "return", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     local_return.serialize(new javax.xml.namespace.QName("http://main","return"),
                                        xmlWriter);
                                    }
                                }
                    xmlWriter.writeEndElement();
               

        }

        private static String generatePrefix(String namespace) {
            if(namespace.equals("http://main")){
                return "ns2";
            }
            return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }

        /**
         * Utility method to write an element start tag.
         */
        private void writeStartElement(String prefix, String namespace, String localPart,
                                       javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            String writerPrefix = xmlWriter.getPrefix(namespace);
            if (writerPrefix != null) {
                xmlWriter.writeStartElement(namespace, localPart);
            } else {
                if (namespace.length() == 0) {
                    prefix = "";
                } else if (prefix == null) {
                    prefix = generatePrefix(namespace);
                }

                xmlWriter.writeStartElement(prefix, localPart, namespace);
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
        }
        
        /**
         * Util method to write an attribute with the ns prefix
         */
        private void writeAttribute(String prefix, String namespace, String attName,
                                    String attValue, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
            if (xmlWriter.getPrefix(namespace) == null) {
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            xmlWriter.writeAttribute(namespace,attName,attValue);
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeAttribute(String namespace, String attName,
                                    String attValue, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName,attValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace,attName,attValue);
            }
        }


           /**
             * Util method to write an attribute without the ns prefix
             */
            private void writeQNameAttribute(String namespace, String attName,
                                             javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

                String attributeNamespace = qname.getNamespaceURI();
                String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
                if (attributePrefix == null) {
                    attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
                }
                String attributeValue;
                if (attributePrefix.trim().length() > 0) {
                    attributeValue = attributePrefix + ":" + qname.getLocalPart();
                } else {
                    attributeValue = qname.getLocalPart();
                }

                if (namespace.equals("")) {
                    xmlWriter.writeAttribute(attName, attributeValue);
                } else {
                    registerPrefix(xmlWriter, namespace);
                    xmlWriter.writeAttribute(namespace, attName, attributeValue);
                }
            }
        /**
         *  method to handle Qnames
         */

        private void writeQName(javax.xml.namespace.QName qname,
                                javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            String namespaceURI = qname.getNamespaceURI();
            if (namespaceURI != null) {
                String prefix = xmlWriter.getPrefix(namespaceURI);
                if (prefix == null) {
                    prefix = generatePrefix(namespaceURI);
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix,namespaceURI);
                }

                if (prefix.trim().length() > 0){
                    xmlWriter.writeCharacters(prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                } else {
                    // i.e this is the default namespace
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                }

            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
            }
        }

        private void writeQNames(javax.xml.namespace.QName[] qnames,
                                 javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

            if (qnames != null) {
                // we have to store this data until last moment since it is not possible to write any
                // namespace data after writing the charactor data
                StringBuffer stringToWrite = new StringBuffer();
                String namespaceURI = null;
                String prefix = null;

                for (int i = 0; i < qnames.length; i++) {
                    if (i > 0) {
                        stringToWrite.append(" ");
                    }
                    namespaceURI = qnames[i].getNamespaceURI();
                    if (namespaceURI != null) {
                        prefix = xmlWriter.getPrefix(namespaceURI);
                        if ((prefix == null) || (prefix.length() == 0)) {
                            prefix = generatePrefix(namespaceURI);
                            xmlWriter.writeNamespace(prefix, namespaceURI);
                            xmlWriter.setPrefix(prefix,namespaceURI);
                        }

                        if (prefix.trim().length() > 0){
                            stringToWrite.append(prefix).append(":").append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        } else {
                            stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        }
                    } else {
                        stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                    }
                }
                xmlWriter.writeCharacters(stringToWrite.toString());
            }

        }


        /**
         * Register a namespace prefix
         */
        private String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, String namespace) throws javax.xml.stream.XMLStreamException {
            String prefix = xmlWriter.getPrefix(namespace);
            if (prefix == null) {
                prefix = generatePrefix(namespace);
                javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
                while (true) {
                    String uri = nsContext.getNamespaceURI(prefix);
                    if (uri == null || uri.length() == 0) {
                        break;
                    }
                    prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                }
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            return prefix;
        }


  
        /**
        * databinding method to get an XML representation of this object
        *
        */
        public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName)
                    throws org.apache.axis2.databinding.ADBException{


        
                 java.util.ArrayList elementList = new java.util.ArrayList();
                 java.util.ArrayList attribList = new java.util.ArrayList();

                 if (local_returnTracker){
                            elementList.add(new javax.xml.namespace.QName("http://main",
                                                                      "return"));
                            
                            
                                    elementList.add(local_return==null?null:
                                    local_return);
                                }

                return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(), attribList.toArray());
            
            

        }

  

     /**
      *  Factory class that keeps the parse method
      */
    public static class Factory{

        
        

        /**
        * static method to create the object
        * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
        *                If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
        * Postcondition: If this object is an element, the reader is positioned at its end element
        *                If this object is a complex type, the reader is positioned at the end element of its outer element
        */
        public static SearchWatchListResponse parse(javax.xml.stream.XMLStreamReader reader) throws Exception{
            SearchWatchListResponse object =
                new SearchWatchListResponse();

            int event;
            String nillableValue = null;
            String prefix ="";
            String namespaceuri ="";
            try {
                
                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                
                if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","type")!=null){
                  String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                        "type");
                  if (fullTypeName!=null){
                    String nsPrefix = null;
                    if (fullTypeName.indexOf(":") > -1){
                        nsPrefix = fullTypeName.substring(0,fullTypeName.indexOf(":"));
                    }
                    nsPrefix = nsPrefix==null?"":nsPrefix;

                    String type = fullTypeName.substring(fullTypeName.indexOf(":")+1);
                    
                            if (!"searchWatchListResponse".equals(type)){
                                //find namespace for the prefix
                                String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (SearchWatchListResponse)ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                
                    
                    reader.next();
                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://main","return").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.set_return(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.set_return(SearchResults.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                  
                            while (!reader.isStartElement() && !reader.isEndElement())
                                reader.next();
                            
                                if (reader.isStartElement())
                                // A start element we are not expecting indicates a trailing invalid property
                                throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                            



            } catch (javax.xml.stream.XMLStreamException e) {
                throw new Exception(e);
            }

            return object;
        }

        }//end of factory class

        

        }
           
    
            private  org.apache.axiom.om.OMElement  toOM(main.DG_SWIFT_SanctionStub.SearchWatchList param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(main.DG_SWIFT_SanctionStub.SearchWatchList.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(main.DG_SWIFT_SanctionStub.SearchWatchListResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(main.DG_SWIFT_SanctionStub.SearchWatchListResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
                                    
                                        private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, main.DG_SWIFT_SanctionStub.SearchWatchList param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                                        throws org.apache.axis2.AxisFault{

                                             
                                                    try{

                                                            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                                            emptyEnvelope.getBody().addChild(param.getOMElement(main.DG_SWIFT_SanctionStub.SearchWatchList.MY_QNAME,factory));
                                                            return emptyEnvelope;
                                                        } catch(org.apache.axis2.databinding.ADBException e){
                                                            throw org.apache.axis2.AxisFault.makeFault(e);
                                                        }
                                                

                                        }
                                
                             
                             /* methods to provide back word compatibility */

                             


        /**
        *  get the default envelope
        */
        private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory){
        return factory.getDefaultEnvelope();
        }


        private  Object fromOM(
        org.apache.axiom.om.OMElement param,
        Class type,
        java.util.Map extraNamespaces) throws org.apache.axis2.AxisFault{

        try {
        
                if (main.DG_SWIFT_SanctionStub.SearchWatchList.class.equals(type)){
                
                           return main.DG_SWIFT_SanctionStub.SearchWatchList.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (main.DG_SWIFT_SanctionStub.SearchWatchListResponse.class.equals(type)){
                
                           return main.DG_SWIFT_SanctionStub.SearchWatchListResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
        } catch (Exception e) {
        throw org.apache.axis2.AxisFault.makeFault(e);
        }
           return null;
        }



    
   }
   