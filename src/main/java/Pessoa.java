public class Pessoa {

    public String fazerChamado(String mensagem) {
        return CentralAtendimento.getInstancia().receberChamadoSuporte(mensagem);
    }

    public String SolicitarVisita(String mensagem) {
        return CentralAtendimento.getInstancia().receberSolicitacaoVisita(mensagem);
    }
}
