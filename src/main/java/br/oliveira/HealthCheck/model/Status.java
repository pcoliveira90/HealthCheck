package br.oliveira.HealthCheck.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Builder;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Status implements Serializable {
    private static final long serialVersionUID = 12312312312321321L;
    private String status;
    private LocalDateTime currentTime;
}

