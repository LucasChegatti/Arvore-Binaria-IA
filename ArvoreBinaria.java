import java.util.ArrayList;

public class ArvoreBinaria {
    private Nodo raiz;
    private ArrayList<Integer> listaEmProfundidade = new ArrayList<Integer>();

    public boolean insere (int value) {
        if (raiz == null) {
                System.out.println(value + " eh raiz da arvore");
                raiz = new Nodo(value);
                return true;
        } else 
                return raiz.insere(value);
    }

    public void percorre(IPercorre metodo) {
        metodo.percorre(raiz);
    }

    public void remove (int valor){
        adicionaNaListaEmProfundidade(raiz);
        int valorRemover = listaEmProfundidade.indexOf(valor);
        listaEmProfundidade.remove(valorRemover);
        ArvoreBinaria ab = new ArvoreBinaria();
        for (int i = 0; listaEmProfundidade.size() > i; i++) {;
                ab.insere(listaEmProfundidade.get(i));
        }
        System.out.println("---------Inicio Remove-----------");
        ab.percorre(new Profundidade());
        System.out.println("----------Fim Remove-------------");
    }

    public void adicionaNaListaEmProfundidade(Nodo nodo){ 
        if (nodo != null){
            listaEmProfundidade.add(nodo.getValor()); 
            adicionaNaListaEmProfundidade(nodo.getEsquerda());
            adicionaNaListaEmProfundidade(nodo.getDireita());
        }
    }
        
}