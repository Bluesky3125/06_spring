package com.ohgiraffers.section02.annotation.subsection01.primary;

import com.ohgiraffers.section02.annotation.common.Pokemon;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("pokemonServicePrimary")
public class PokemonService {

    private final Pokemon pokemon;

    /* 설명. 여러 클래스가 해당되면 @Primary가 붙은 클래스가 들어온다.
     *  @Primary가 항상 하나는 있어야 아래 다른 어노테이션이 사용 가능하다.
     * */
    @Autowired  // 생성자 주입은 @Autowired 생략 가능
    public PokemonService(Pokemon pokemon) {
        this.pokemon = pokemon;
    }

    public void pokemonAttack() {
        pokemon.attack();
    }
}
