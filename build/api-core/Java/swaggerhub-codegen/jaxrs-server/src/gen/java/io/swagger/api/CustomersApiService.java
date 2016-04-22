package io.swagger.api;

import io.swagger.api.*;
import io.swagger.model.*;

import com.sun.jersey.multipart.FormDataParam;

import io.swagger.model.CustomerResponse;
import io.swagger.model.ErrorResponse;

import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import com.sun.jersey.core.header.FormDataContentDisposition;
import com.sun.jersey.multipart.FormDataParam;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-04-22T21:04:53.925Z")
public abstract class CustomersApiService {
  
      public abstract Response customers(String clientId,String customerId,SecurityContext securityContext)
      throws NotFoundException;
  
}
