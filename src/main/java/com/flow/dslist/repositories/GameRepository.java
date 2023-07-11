package com.flow.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.flow.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {
    
}
