public class CentralAtendimento {

    private static CentralAtendimento instancia = new CentralAtendimento();

    private CentralAtendimento() {}

    public static CentralAtendimento getInstancia() {
        return instancia;
    }

    public String receberChamadoSuporte(String mensagem) {
        return "A Central agradece seu contato.\n"+
                "A equipe de suporte já respondeu a sua mensagem conforme a seguir.\n" +
                ">>" + Suporte.getInstancia().receberChamado(mensagem);
    }

    public String receberSolicitacaoVisita(String mensagem) {
        return "A Central agradece seu contato.\n"+
                "A equipe de suporte já respondeu a sua mensagem conforme a seguir.\n" +
                ">>" + Suporte.getInstancia().SolicitarVisita(mensagem);
    }

}
