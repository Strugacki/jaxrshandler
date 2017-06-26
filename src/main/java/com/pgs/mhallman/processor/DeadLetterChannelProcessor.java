package com.pgs.mhallman.processor;

import com.pgs.mhallman.domain.FakeException;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * Created by mhallman on 21.06.2017.
 */
@Component
public class DeadLetterChannelProcessor implements Processor {

    private static final Logger LOG = LoggerFactory.getLogger(DeadLetterChannelProcessor.class);

    @Override
    public void process(Exchange exchange) throws Exception {
        LOG.info("Exception :: {}",exchange.getException().toString());
        exchange.getIn().setBody(new FakeException("My Fake Server Error", 400, "Problems with server", ":("));
    }
}
