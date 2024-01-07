import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.junit.Conta;
import com.junit.Pessoa;
import com.junit.TransferenciaEntreConta;

public class PessoaTest {
    @Test
    void deveCalcularIdadeCorretamente(){
        Pessoa pessoa = new Pessoa("Rafael", LocalDate.of(2001, 11, 8));
        assertEquals(22, pessoa.getIdade());
    }

    @Test
    void deveRetornarSeEhMaiorDeIdade(){
        Pessoa pessoa = new Pessoa("Rafael", LocalDate.of(2001, 11, 8));
        assertTrue(pessoa.ehMaiorDeIdade());

        Pessoa joao = new Pessoa("João", LocalDate.of(2010, 02, 02));
        assertFalse(joao.ehMaiorDeIdade());
    }

    @Test
    void validarLancamentos() {
        int[] primeiroLancamento = {10, 20, 30, 40, 50};
        int[] segundoLancamento = {10, 20, 30, 40, 50};

        assertArrayEquals(primeiroLancamento, segundoLancamento);
    }

    @Test
    void validarSeObjetoEstaNulo() {
        Pessoa pessoa = null;

        assertNull(pessoa);

        pessoa = new Pessoa("Luciano", LocalDate.of(2000, 02, 04));

        assertNotNull(pessoa);
    }

    @Test
    void validarCenarioDeExcecaoNaTransferencia() {
        Conta contaOrigem = new Conta(0);
        Conta contaDestino = new Conta(2000);

        TransferenciaEntreConta transferenciaEntreConta = new TransferenciaEntreConta();

        Assertions.assertThrows(IllegalArgumentException.class, () ->
            transferenciaEntreConta.transfere(contaOrigem, contaDestino, -1));
    }
}

