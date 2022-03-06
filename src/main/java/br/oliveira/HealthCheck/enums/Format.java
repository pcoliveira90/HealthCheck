package br.oliveira.HealthCheck.enums;


import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public enum Format {
    SHORT("short"),
    FULL("full");

    private final String value;
}
