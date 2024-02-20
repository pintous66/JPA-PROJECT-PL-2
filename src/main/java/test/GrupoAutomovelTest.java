package test;

import org.domain.GrupoAutomovel;

import static org.junit.jupiter.api.Assertions.*;

class GrupoAutomovelTest {

        @org.junit.jupiter.api.Test
        void testAlterarNumeroPortas() {
            GrupoAutomovel grupo = new GrupoAutomovel();

            assertTrue( grupo.alterarNumeroPortas(4));
            assertFalse( grupo.alterarNumeroPortas(0));
            assertFalse( grupo.alterarNumeroPortas(-1));
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