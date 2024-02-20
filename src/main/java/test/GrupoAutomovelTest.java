package test;

import org.domain.GrupoAutomovel;

import static org.junit.jupiter.api.Assertions.*;

class GrupoAutomovelTest {

    @org.junit.jupiter.api.Test
    void testAlterarNumeroPortasValido() {
        //arrange
        GrupoAutomovel grupo = new GrupoAutomovel();
        //act
        boolean result = grupo.alterarNumeroPortas(5);
        //assert
        assertTrue(result);
    }

    @org.junit.jupiter.api.Test
    void testAlterarNumeroPortasInvalidoMenor0() {
        //arrange
        GrupoAutomovel grupo = new GrupoAutomovel();
        //act
        boolean result = grupo.alterarNumeroPortas(-1);
        //assert
        assertFalse(result);
    }

    @org.junit.jupiter.api.Test
    void testAlterarClasseValido() {
            //arrange
        GrupoAutomovel grupo = new GrupoAutomovel();
        //act
        boolean result = grupo.alterarClasse("Classe A");
        //assert
        assertTrue(result);
    }

    @org.junit.jupiter.api.Test
    void testAlterarClasseInvalidoVazio() {
        //arrange
        GrupoAutomovel grupo = new GrupoAutomovel();
        //act
        boolean result = grupo.alterarClasse("");
        //assert
        assertFalse(result);
    }

    @org.junit.jupiter.api.Test
    void testAlterarClasseInvalidoNull() {
        //arrange
        GrupoAutomovel grupo = new GrupoAutomovel();
        //act
        boolean result = grupo.alterarClasse(null);
        //assert
        assertFalse(result);
    }
}