package org.example.exercice01_webflux;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public class Methode {

    public static Mono<String> getWelcome(){
        Mono<String> mono = Mono.just("Welcome to project Reactor!");
        return mono;
    }

    public static Flux<Integer> getFluxNumbers(){
        Flux<Integer> flux = Flux.range(1, 5);
        return flux;
    }
}
