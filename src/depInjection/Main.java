package depInjection;

import modelo.Cliente;
import notificacao.Notificador;
import notificacao.NotificadorEmail;
import notificacao.NotificadorSMS;
import service.AtivacaoClienteService;

public class Main {
    public static void main(String[] args) {
        Cliente elias = new Cliente("Elias Fernandes", "elias.fernandes@gmail.com", "41995296747");
        Cliente dante = new Cliente("Dante MF", "dantemf@gmail.com", "41999909086");

        Notificador notificador = new NotificadorEmail();
        Notificador notificadorSMS = new NotificadorSMS();


        AtivacaoClienteService ativacaoCliente = new AtivacaoClienteService(notificadorSMS);
        ativacaoCliente.ativar(elias);
        ativacaoCliente.ativar(dante);

    }
}