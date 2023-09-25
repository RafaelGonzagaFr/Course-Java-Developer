package aparelhos;

import apps.musica.AparelhoMusical;
import apps.navegador.Navegador;
import apps.telefone.Telefone;

public class Iphone implements AparelhoMusical, Navegador, Telefone  {

    @Override
    public void ligar() {
        // TODO Auto-generated method stub
        System.out.println("Ligando telefone");

    }

    @Override
    public void atender() {
        // TODO Auto-generated method stub
                System.out.println("Atendendo telefone");

    }

    @Override
    public void iniciarCorreioVoz() {
        // TODO Auto-generated method stub
                System.out.println("Iniciando correio de voz");

    }

    @Override
    public void exibirPagina() {
        // TODO Auto-generated method stub
                System.out.println("Exibindo página");

    }

    @Override
    public void adicionarNovaAba() {
        // TODO Auto-generated method stub
                System.out.println("Adicionando nova aba");

    }

    @Override
    public void atualizarPagina() {
        // TODO Auto-generated method stub
                System.out.println("Atualizando página");

    }

    @Override
    public void pausar() {
        // TODO Auto-generated method stub
                System.out.println("Pausando música");

    }

    @Override
    public void tocar() {
        // TODO Auto-generated method stub
                System.out.println("Tocando música");

    }

    @Override
    public void selecionarMusica() {
        // TODO Auto-generated method stub
                System.out.println("Selecionar música");

    }
    
}
