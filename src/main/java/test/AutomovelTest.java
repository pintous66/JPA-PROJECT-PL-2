package test;

import org.domain.Automovel;

import static org.junit.jupiter.api.Assertions.*;

class AutomovelTest {

        @org.junit.jupiter.api.Test
        void testGetMatricula() {

        }
        @org.junit.jupiter.api.Test
        void testSetMatricula(){

            // arrange
            Automovel automovel = new Automovel("00-00-00");

            // act
            boolean resultado = automovel.setMatricula("00-00-00");

            // assert
            assertTrue(resultado);
        }

}