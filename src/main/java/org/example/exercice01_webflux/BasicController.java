package org.example.exercice01_webflux;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import static org.example.exercice01_webflux.Methode.getFluxNumbers;
import static org.example.exercice01_webflux.Methode.getWelcome;

@RestController
public class BasicController {

    @GetMapping("/api/welcome")
    public Mono<String> getWelcomeTo() {
        return getWelcome();
    }

    @GetMapping("/api/numbers")
    public Flux<Integer> getNumbers() {
        return getFluxNumbers();
    }
}
