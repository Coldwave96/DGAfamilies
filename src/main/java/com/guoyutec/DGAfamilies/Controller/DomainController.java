package com.guoyutec.DGAfamilies.Controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.guoyutec.DGAfamilies.Handler.DomainHandler;

@RestController
@RequestMapping("/dga")
public class DomainController {
    DomainHandler domainHandler = new DomainHandler();
    @RequestMapping("/regex")
    public String checkDomainRegex(String domain) {
        String response = domainHandler.checkDomainByRegex(domain);
        return response;
    }

    @RequestMapping("/query")
    public String checkDomainQuery(String domain) {
        String response = domainHandler.checkDomainByQuery(domain);
        return response;
    }

    @PostMapping("/queries")
    public String multiQueries(@RequestBody String requestBody) {
        String[] domains;
        if (requestBody.contains(",")){
            domains = requestBody.split(",");
        } else {
            domains = requestBody.split("\n");
        }

        StringBuilder result = new StringBuilder();
        for (String domain : domains) {
            String trimmedDomain = domain.trim();
            result.append(trimmedDomain).append("\n");
        }

        String response = domainHandler.checkMultiQueries(result.toString());
        return response;
    }
}
