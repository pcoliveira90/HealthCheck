package br.oliveira.HealthCheck.flow;

import br.oliveira.HealthCheck.enums.Format;
import br.oliveira.HealthCheck.model.Status;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Optional;


@Service
@Scope("singleton")
public class HealthCheckFlow {
    public Optional<Status> get(String format) {
        try {
            var formatStatus = Format.valueOf(format.toUpperCase());
            var status =Status.builder().status("ok").build();
            if (Format.FULL.equals(formatStatus))
                status.setCurrentTime(LocalDateTime.now());
            return Optional.ofNullable(status);
        } catch (IllegalArgumentException e) {
            return Optional.empty();
        }
    }
}
