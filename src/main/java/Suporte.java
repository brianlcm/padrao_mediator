public class Suporte {

    private static Suporte instancia = new Suporte();

    private Suporte() {}

    public static Suporte getInstancia() {
        return instancia;
    }

    public String receberChamado(String mensagem) {
        return "A equipe de suporte já recebeu o seu chamado: " + mensagem;
    }

    public String SolicitarVisita(String mensagem) {
        return "A equipe de suporte vai entrar em contato com você para marcar a visita: " + mensagem;
    }
}
