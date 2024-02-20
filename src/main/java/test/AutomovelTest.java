package test;

import org.domain.Automovel;

import static org.junit.jupiter.api.Assertions.*;

class AutomovelTest {

        @org.junit.jupiter.api.Test
        void testGetMatricula() {
            Automovel automovel = new Automovel();
            assertNull(automovel.getMatricula());
        }

}