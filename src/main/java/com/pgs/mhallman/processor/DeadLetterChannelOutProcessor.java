package com.pgs.mhallman.processor;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * Created by mhallman on 06.07.2017.
 */
@Component
public class DeadLetterChannelOutProcessor implements Processor {

    private static final Logger LOG = LoggerFactory.getLogger(DeadLetterChannelOutProcessor.class);

    @Override
    public void process(Exchange exchange) throws Exception {
        LOG.info("DeadLetterChannelOutProcessor :: start");
        LOG.info("DeadLetterChannelOut message :: {}", exchange.getIn().getBody().toString());
        LOG.info("DeadLetterChannelOutProcessor :: end");

    }
}
