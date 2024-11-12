package com.EjercicioBaseDatos.BaseDatos.repository;

import com.EjercicioBaseDatos.BaseDatos.model.MovieEntity;
import org.springframework.data.neo4j.repository.ReactiveNeo4jRepository;
import reactor.core.pub


public interface MovieRepository extends ReactiveNeo4jRepository<MovieEntity, String> {
    Mono<MovieEntity> findOneByTitle(String title);

}
