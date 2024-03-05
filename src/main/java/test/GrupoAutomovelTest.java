package test;

import org.domain.GrupoAutomovel;
import org.junit.Test;

import static org.junit.Assert.*;


public class GrupoAutomovelTest {


    @Test
    public void testAlterarNumeroPortasValido() {
        //arrange
        GrupoAutomovel grupo = new GrupoAutomovel("Classe A");
        //act
        boolean result = grupo.alterarNumeroPortas(5);
        //assert
        assertTrue(result);
    }
    @Test
    public void testAlterarNumeroPortasInvalidoMenor0() {
        //arrange
        GrupoAutomovel grupo = new GrupoAutomovel("Classe A");
        //act
        boolean result = grupo.alterarNumeroPortas(-1);
        //assert
        assertFalse(result);
    }

    @Test
    public void testAlterarClasseValido() {
            //arrange
        GrupoAutomovel grupo = new GrupoAutomovel("Classe A");
        //act
        boolean result = grupo.alterarClasse("Classe A");
        //assert
        assertTrue(result);
    }

    @Test
    public void testAlterarClasseInvalidoVazio() {
        //arrange
        GrupoAutomovel grupo = new GrupoAutomovel("Classe A");
        //act
        boolean result = grupo.alterarClasse("");
        //assert
        assertFalse(result);
    }

    @Test
    public void testAlterarClasseInvalidoNull() {
        //arrange
        GrupoAutomovel grupo = new GrupoAutomovel("Classe A");
        //act
        boolean result = grupo.alterarClasse(null);
        //assert
        assertFalse(result);
    }

    @Test
    public void toStringTest() {
        //arrange
        GrupoAutomovel grupo = new GrupoAutomovel("Classe A");
        //act
        String result = grupo.toString();
        //assert
        assertEquals("Classe = Classe A Numero de Portas = 0", result);
    }

}