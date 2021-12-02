public class ServicoHigienizacaoInterior implements IServico{

    public String contratado() {
        return  "Higienizacao contratada";
    }

    public String recusado(){
        return "Higienizacao Recusada, pois o limite do prazo foi excedido";
    }

}
