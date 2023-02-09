package com.softwareag.connectors.cloudpi;

import com.softwareag.connectors.cloudpi.error.ErrorResponse;
import com.softwareag.connectors.cloudpi.model.PiRest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CloudPiController {
    @Autowired
    RestClient rc;
    @PostMapping("/restCall")
    String restCall(@RequestBody PiRest requestBody) throws Exception {
        ErrorResponse er = new ErrorResponse();
        Object response = rc.execute(requestBody, er);

        return (String) response;

    }
}
