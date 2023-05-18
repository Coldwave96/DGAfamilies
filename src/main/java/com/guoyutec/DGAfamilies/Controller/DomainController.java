package com.guoyutec.DGAfamilies.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.guoyutec.DGAfamilies.Handler.DomainHandler;

@RestController
@RequestMapping("/dga")
public class DomainController {
    @RequestMapping("/regex")
    public String checkDomainRegex(String domain) {
        DomainHandler domainHandler = new DomainHandler();
        String response = domainHandler.checkDomain(domain);
        return response;
    }
}
