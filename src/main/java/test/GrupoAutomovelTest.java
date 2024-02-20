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

}