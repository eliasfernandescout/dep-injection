package depInjection;

import modelo.Cliente;
import modelo.Produto;
import notificacao.Notificador;
import notificacao.NotificadorEmail;
import notificacao.NotificadorSMS;
import service.AtivacaoClienteService;
import service.EmissaoNotaFiscalService;


public class Main {
    public static void main(String[] args) {
        Cliente elias = new Cliente("Elias Fernandes", "elias.fernandes@gmail.com", "41995296747");
        Cliente dante = new Cliente("Dante MF", "dantemf@gmail.com", "41999909086");
        Produto produto = new Produto("Assinatura Software", 200.00 );

        Notificador notificadorEmail = new NotificadorEmail();
        Notificador notificadorSMS = new NotificadorSMS();


        AtivacaoClienteService ativacaoCliente = new AtivacaoClienteService(notificadorSMS);
        ativacaoCliente.ativar(elias);
        ativacaoCliente.ativar(dante);

        System.out.println("--------------------------------------------------------------");

        EmissaoNotaFiscalService emissaoNotaFiscal = new EmissaoNotaFiscalService(notificadorEmail);
        emissaoNotaFiscal.emitir(elias, produto);
        emissaoNotaFiscal.emitir(dante, produto);

    }
}