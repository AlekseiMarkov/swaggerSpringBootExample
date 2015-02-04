package test;

import com.wordnik.swagger.annotations.Api;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * A simple example for a REST service.
 */
@RestController
@RequestMapping(value = "/simple")
@ConfigurationProperties(prefix = "simple")
@Api(value = "Simple Service", description = "just a dummy REST service")
public class SimpleService {

    private static final Logger LOG = LoggerFactory.getLogger(SimpleService.class);

    @RequestMapping(method = RequestMethod.POST)
    public String executeSimpleService() {
        LOG.info("Simple service triggered.");
        return "1111111111";
    }

}
