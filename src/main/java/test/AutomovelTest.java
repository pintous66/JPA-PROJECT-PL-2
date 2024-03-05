package test;

import org.domain.Automovel;
import org.junit.Test;

import static org.junit.Assert.*;


public class AutomovelTest {

        @Test
        public void testContrutorInvalidoVazio() {
              //arrange
                String expected = "Matricula inválida";
              //act
                Exception e =  assertThrows(IllegalArgumentException.class, () -> new Automovel(""));
                String result = e.getMessage();

                //assert
                assertTrue(result.equals(expected));


        }

        @Test
        public void testContrutorInvalidoNulo() {
                //arrange
                String expected = "Matricula inválida";
                //act
                Exception e = assertThrows(IllegalArgumentException.class, () ->
                        new Automovel(null));
                 String result = e.getMessage();

                //assert
                assertTrue(result.equals(expected));


        }

        @Test
        public void testAlterarKmsValidoPositivo() {
                //arrange
                Automovel auto = new Automovel("11-11-11");
                //act
                assertTrue(auto.alterarKms(100));
                assertFalse(auto.alterarKms(50));
                //assert
                assertEquals(100, auto.kms);
        }

        @Test
        public void testAlterarKmsValidoNegativo() {
                //arrange
                Automovel auto = new Automovel("11-11-11");
                //act
                assertFalse(auto.alterarKms(-100));
                //assert
                assertEquals(0, auto.kms);
        }

        @Test
        public void testAlterarKmsValidoZero() {
                //arrange
                Automovel auto = new Automovel("11-11-11");
                //act
                assertFalse(auto.alterarKms(0));
                //assert
                assertEquals(0, auto.kms);
        }

        @Test
        public void ToString(){
                //arrange
                Automovel auto = new Automovel("11-11-11");
                //act
                String result = auto.toString();
                //assert
                assertEquals("Matricula = 11-11-11 Kms = 0", result);
        }

}