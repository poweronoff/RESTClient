package de.hpi.restclient.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter @Setter
public class CleanURLResponse {

    private boolean blacklisted;
    private String cleanUrl;
}
