package test;

import org.domain.Automovel;

import org.domain.Automovel;
import static org.junit.jupiter.api.Assertions.*;

class AutomovelTest {
    @org.junit.jupiter.api.Test
    void alterarKMSvalido(){
        //arrange
        Automovel auto = new Automovel("00-00-00");

        //act
        boolean res1 = auto.alterarKms(10);

        //assert
        assertTrue(res1);
    }

    @org.junit.jupiter.api.Test
    void alterarKMSabaixoAtual(){
        //arrange
        Automovel auto = new Automovel("00-00-00");

        //act
        boolean res3 = auto.alterarKms(-1);

        //assert
        assertFalse(res3);
    }
        @org.junit.jupiter.api.Test
        void testGetMatricula() {

        }
        @org.junit.jupiter.api.Test
        void testSetMatricula(){

            // arrange
            Automovel automovel = new Automovel("00-00-00");

            // act


            // assert

        }

}