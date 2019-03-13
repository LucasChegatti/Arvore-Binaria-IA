import java.util.ArrayList;

public class EmNivel implements IPercorre {
    
    @Override
    public void percorre (Nodo nodo) {
        ArrayList<Nodo> lista = new ArrayList<Nodo>(); 
        lista.add(nodo); 
        for (int i = 0; i < lista.size(); i++) { 
            Nodo item = lista.get(i); 
            System.out.println(item.getValor()); 
            if (item.getEsquerda() != null) { 
                lista.add(item.getEsquerda());
            }
            if (item.getDireita() != null) { 
                lista.add(item.getDireita()); 
            }
        }
    }
}
