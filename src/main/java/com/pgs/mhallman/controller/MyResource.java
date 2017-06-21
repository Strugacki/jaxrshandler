package com.pgs.mhallman.controller;

import com.pgs.mhallman.domain.Person;
import com.pgs.mhallman.repository.PersonRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * Root resource (exposed at "myresource" path)
 */
@Component
@Path("/myresource")
public class MyResource {

    private static final Logger LOG = LoggerFactory.getLogger(MyResource.class);

    @Autowired
    private PersonRepository personRepository;

    /**
     * Method handling HTTP GET requests. The returned object will be sent
     * to the client as "text/plain" media type.
     *
     * @return String that will be returned as a text/plain response.
     */
//    @GET
//    @Produces(MediaType.TEXT_PLAIN)
//    public String getIt() {
//        return "Got it!";
//    }

    @POST
    @Path("/createpost")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response postPerson(Person person){
        String result = "Created: " + person;
        return Response.status(201).entity(result).build();
    }


    @GET
    @Path("/get")
    @Produces(MediaType.APPLICATION_JSON)
    public Person getPerson(){
        return personRepository.create();
    }

    @GET
    @Path("/getCamelGetPerson")
    @Produces(MediaType.APPLICATION_JSON)
    public Person getCamelGetPerson(){
        LOG.info("GetCamelGetPerson :: hit endpoint");
        return null;
    }

    @GET
    @Path("/getCamelGetException")
    @Produces(MediaType.APPLICATION_JSON)
    public Person getCamelGetException(){
        LOG.info("GetCamelGetException :: hit endpoint");
        return null;
    }

    @GET
    @Path("/getCamelForcedException")
    @Produces(MediaType.APPLICATION_JSON)
    public Person getCamelForcedException(){
        LOG.info("GetCamelForcedException :: hit endpoint");
        return null;
    }
}
