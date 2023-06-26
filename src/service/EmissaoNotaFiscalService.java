package service;

import modelo.Cliente;
import modelo.Produto;
import notificacao.Notificador;
import notificacao.NotificadorEmail;

public class EmissaoNotaFiscalService {
    private Notificador notificador;

    public EmissaoNotaFiscalService(Notificador notificador) {
        this.notificador = notificador;
    }

    public void emitir(Cliente cliente, Produto produto) {
        // TODO emite a nota fiscal aqui;
        // INFORMAR AO CLIENTE QUE A NOTA FISCAL FOI EMITIDA

        this.notificador.notificar(cliente, "Nota fiscal do produto" + produto.getNome() + "foi emitida.");

    }


}

