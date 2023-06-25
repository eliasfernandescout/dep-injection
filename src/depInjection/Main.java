package depInjection;

import modelo.Cliente;
import service.AtivacaoClienteService;

public class Main {
    public static void main(String[] args) {
        Cliente elias = new Cliente("Elias Fernandes", "elias.fernandes@gmail.com", "41995296747");
        Cliente dante = new Cliente("Dante MF", "dantemf@gmail.com", "41999909086");

        AtivacaoClienteService ativacaoCliente = new AtivacaoClienteService();
        ativacaoCliente.ativar(elias);
        ativacaoCliente.ativar(dante);

    }
}