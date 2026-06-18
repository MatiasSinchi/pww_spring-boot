package ec.edu.ups.icc.fundamentos01.status;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.Instant;
import java.util.Map;

@RestController
@RequestMapping("/api/status")
public class StatusController {

    @GetMapping
    public Map<String, String> getStatus() {
        return Map.of(
            "service", "Spring Boot API",
            "status", "running",
            "timestamp", Instant.now().toString()
        );
    }
}
