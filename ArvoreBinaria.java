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
    
    public boolean remove(int value) {
        if (raiz == null) {
            return false;
        } else {
            System.out.println("valor a ser removido da arvore = " + value);
            if (raiz.getValor() == value) {
                Nodo nodoAuxiliar = new Nodo(0);
                nodoAuxiliar.setEsquerda(raiz);
                boolean resultado = raiz.remove(value, nodoAuxiliar);
                raiz = nodoAuxiliar.getEsquerda();
                return resultado;
            } else {
                return raiz.remove(value, null);
            }
        }
    }
        
}