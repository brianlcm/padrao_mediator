import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClienteTest {

    @Test
    void deveAbrirChamado() {
        Cliente cliente = new Cliente();
        assertEquals("A Central agradece seu contato.\nA equipe de suporte já respondeu a sua mensagem conforme a seguir.\n" +
                        ">>A equipe de suporte já recebeu o seu chamado: Quero cancelar o meu plano.",
                cliente.fazerChamado("Quero cancelar o meu plano."));
    }

    @Test
    void deveSolicitarVisita() {
        Cliente cliente = new Cliente();
        assertEquals("A Central agradece seu contato.\nA equipe de suporte já respondeu a sua mensagem conforme a seguir.\n" +
                        ">>A equipe de suporte vai entrar em contato com você para marcar a visita: Quero marcar a visita para a próxima semana.",
                cliente.SolicitarVisita("Quero marcar a visita para a próxima semana."));
    }

}