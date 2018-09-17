package com.attendance_tracker.client;

import com.attendance_tracker.client.api.AbstractApiResource;
import com.attendance_tracker.rest.endpoint.dto.InfoDto;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.WebTarget;

/**
 * @author Marta Ginosyan<br/>
 * Date: gitsearcher<br/>
 * Date: 8/5/18<br/>
 */
public class InfoResource extends AbstractApiResource {

    private final Logger logger = LoggerFactory.getLogger(InfoResource.class);

    private ObjectMapper objectMapper;

    public InfoResource(Client client, WebTarget rootTarget, ObjectMapper objectMapper) {
        super(client, rootTarget, "");
        this.objectMapper = objectMapper;
    }

    public InfoDto info() {
        return doGet("/info", InfoDto.class);
    }
}