package Set.Pesquisa;

import Set.OperacoesBasicas.ConjuntoConvidados;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    //atributos
    private Set<Contato> contatoSet;

    public AgendaContatos() {
        this.contatoSet = new HashSet<>();
    }

    public void adicionarContatos(String nome, int numero){
        contatoSet.add(new Contato(nome, numero));
    }

    public void exibirContatos(){
        System.out.println(contatoSet);
    }

    public Set<Contato> pesquisarPorNome(String nome){
        Set<Contato> contatosPorNome = new HashSet<>();
        for(Contato c: contatoSet){
            if(c.getNome().startsWith(nome)){
                contatosPorNome.add(c);
            }
        }
        return contatosPorNome;
    }

    public Contato atualizarNumeroContato(String nome, int novoNumero){
        Contato contatoAtualizado = null;
        for(Contato c : contatoSet){
            if(c.getNome().equalsIgnoreCase(nome)){
                c.setNumero(novoNumero);
                contatoAtualizado = c;
                break;
            }
        }
        return contatoAtualizado;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.exibirContatos();

        agendaContatos.adicionarContatos("Camila", 123456);
        agendaContatos.adicionarContatos("Camila", 5665);
        agendaContatos.adicionarContatos("Camila Cavalcante", 1111111);
        agendaContatos.adicionarContatos("Camila DIO", 654987);
        agendaContatos.adicionarContatos("Maria Silva", 1111111);

        agendaContatos.exibirContatos();

        System.out.println(agendaContatos.pesquisarPorNome("Camila"));

        System.out.println("Contato Atualizado: " + agendaContatos.atualizarNumeroContato("Maria Silva", 5555555));

        agendaContatos.exibirContatos();
    }
}
