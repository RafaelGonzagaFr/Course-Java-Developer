

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.condition.EnabledIfEnvironmentVariable;

import com.junit.BancoDeDados;

public class ConsultarDadosDePessoaTest {

    @BeforeAll
    static void configuraConexao(){
        BancoDeDados.iniciarConexao();
        System.out.println("Iniciou");
    }

    @Test
    void validarDadosDeRetorno() {
        Assertions.assertTrue(true);
    }

    @AfterAll
    static void finalizarConexao() {
        BancoDeDados.finalizarConexao();
        System.out.println("Finalizou");

    }

    @Test
    void validarAlgoSomenteNoUsuario(){
        Assumptions.assumeFalse("Root".equals(System.getenv("USER")));
        Assertions.assertEquals(10, 5+5); 
    }

    @Test
    @EnabledIfEnvironmentVariable(named = "USER", matches = "Rafael")
    void validarAlgoSomenteNoUsuario2(){
        Assumptions.assumeFalse("Rafael".equals(System.getenv("USER")));
        Assertions.assertEquals(10, 5+5);
    }

    //@BeforeEach antes de cada
    //@AfterEach depois de cada
}
