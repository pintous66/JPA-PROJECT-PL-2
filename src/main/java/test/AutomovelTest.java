package test;

import org.domain.Automovel;

import static org.junit.jupiter.api.Assertions.*;

class AutomovelTest {

        @org.junit.jupiter.api.Test
        void testGetMatricula() {
            Automovel automovel = new Automovel();
            assertTrue(    automovel.setMatricula("00-00-00"));
            assertEquals("00-00-00", automovel.getMatricula());

        }

}