package com.pgs.mhallman.processor;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * Created by mhallman on 20.06.2017.
 */
@Component
public class GetExceptionProcessor implements Processor {

    private static final Logger LOG = LoggerFactory.getLogger(GetExceptionProcessor.class);

    @Override
    public void process(Exchange exchange) throws Exception {
        LOG.info("GetExceptionProcessor :: start");
        throw new NullPointerException();
//        LOG.info("GetExceptionProcessor :: end");
    }
}
