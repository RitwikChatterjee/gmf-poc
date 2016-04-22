package io.swagger.api.factories;

import io.swagger.api.CustomersApiService;
import io.swagger.api.impl.CustomersApiServiceImpl;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-04-22T21:04:53.925Z")
public class CustomersApiServiceFactory {

   private final static CustomersApiService service = new CustomersApiServiceImpl();

   public static CustomersApiService getCustomersApi()
   {
      return service;
   }
}
