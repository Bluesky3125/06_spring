package com.ohgiraffers.section02.annotation.subsection05.inject;

import com.ohgiraffers.section02.annotation.common.Pokemon;
import jakarta.inject.Inject;
import jakarta.inject.Named;
import org.springframework.stereotype.Service;

@Service("pokemonServiceInject")
public class PokemonService {

    /* 설명. 1. Inject 라이브러리를 활용한 필드 주입 */
//    @Inject
//    @Named("squirtle")
//    private Pokemon pokemon;

    /* 설명. 2. 생성자 주입 */
    private final Pokemon pokemon;

    @Inject
    public PokemonService(@Named("pikachu") Pokemon pokemon) {
        this.pokemon = pokemon;
    }

    /* 설명. 3. Setter 주입 */
//    private Pokemon pokemon;
//
//    @Inject
//    public void setPokemon(@Named("squirtle") Pokemon pokemon) {
//        this.pokemon = pokemon;
//    }

    public void pokemonAttack() {
        pokemon.attack();
    }
}

/* bean 인식
 *  1. xml
 *  2. java
 *  3. annotation(@ComponentScan
 *                @Component)
 *
 * bean DI
 *  1. 필드/생성자(★)/setter
 *  2. 개별/컬렉션
 *  3. @Autowired/@Qualifier
 *     @Resource
 *     @Inject/@Named
 *
 *
 *
 *  */