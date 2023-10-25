package com.senai.JuliaFarias.PrjGame.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.senai.JuliaFarias.PrjGame.entities.Jogo;

public interface JogoRepository extends JpaRepository<Jogo, Long> {	

}