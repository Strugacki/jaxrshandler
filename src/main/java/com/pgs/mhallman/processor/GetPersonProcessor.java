package com.pgs.mhallman.processor;

import com.pgs.mhallman.repository.PersonRepository;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by mhallman on 20.06.2017.
 */
@Component
public class GetPersonProcessor implements Processor {

    private static final Logger LOG = LoggerFactory.getLogger(GetPersonProcessor.class);

    @Autowired
    PersonRepository personRepository;

    @Override
    public void process(Exchange exchange) throws Exception {
        LOG.info("GetPersonProcessor :: start");
        exchange.getIn().setBody(personRepository.create());
        LOG.info("GetPersonProcessor :: end");
    }
}
