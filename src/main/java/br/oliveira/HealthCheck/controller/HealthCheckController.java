package br.oliveira.HealthCheck.controller;


import br.oliveira.HealthCheck.flow.HealthCheckFlow;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;

@RestController
class HealthCheckController {

    @Autowired
    private HealthCheckFlow healthcheckFlow;

    @GetMapping(value = "/healthcheck", produces = "application/json")
    public Object healthCheck(@RequestParam(required = true) String format) {
        final var result = healthcheckFlow.get(format);
        return result.isPresent() ? ResponseEntity.ok().body(result.get()) : ResponseEntity.badRequest();
    }

    @PutMapping(value = "/healthcheck")
    public ResponseEntity<?> healthCheckPut() {
        return ResponseEntity.status(HttpStatus.METHOD_NOT_ALLOWED).build();
    }

    @PostMapping(value = "/healthcheck")
    public ResponseEntity<?> healthCheckPost() {
        return ResponseEntity.status(HttpStatus.NOT_IMPLEMENTED).build();
    }


    @DeleteMapping(value = "/healthcheck")
    public ResponseEntity<?> healthCheckDelete() {
        return ResponseEntity.status(HttpStatus.NOT_IMPLEMENTED).build();
    }


}



