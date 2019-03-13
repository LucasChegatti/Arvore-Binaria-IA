
public class Profundidade implements IPercorre {
    
    @Override
    public void percorre(Nodo nodo) {
        if (nodo != null) {
            System.out.println(nodo.getValor());
            percorre(nodo.getEsquerda());
            percorre(nodo.getDireita());
        }
    }
    
}
