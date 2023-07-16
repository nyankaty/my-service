package com.company.sample.infrastructure.client;

import com.company.common.client.application.ClientTemplate;
import com.company.common.client.implementation.WebClientTemplate;
import org.springframework.stereotype.Component;

@Component
public class ClientTemplateAdapter extends WebClientTemplate implements ClientTemplate {

}
