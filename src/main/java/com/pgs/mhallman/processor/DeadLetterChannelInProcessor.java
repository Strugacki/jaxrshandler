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
public class DeadLetterChannelInProcessor implements Processor {

    private static final Logger LOG = LoggerFactory.getLogger(DeadLetterChannelInProcessor.class);

    @Override
    public void process(Exchange exchange) throws Exception {
        LOG.info("DeadLetterChannelInProcessor :: start");
        LOG.info("Exception :: {}", exchange.getProperty(Exchange.EXCEPTION_CAUGHT).toString());
        LOG.info("Last Endpoint :: {}", exchange.getProperty(Exchange.TO_ENDPOINT).toString());

        FakeException exception = new FakeException("My Fake Server Error", 400, "Problems with server", ":(");
        exchange.getIn().setBody(exception);

        LOG.info("DeadLetterChannelInProcessor :: end");
    }
}
