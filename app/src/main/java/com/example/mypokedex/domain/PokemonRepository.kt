package com.example.mypokedex.domain

import io.reactivex.Single



interface PokemonRepository {
    fun getPokemonList(): Single<List<PokemonEntity>>
    fun getPokemonById(id: String): Single<PokemonEntity>
}