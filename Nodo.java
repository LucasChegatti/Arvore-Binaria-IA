public class Nodo {
    
	private int valor;
	private Nodo esquerda, direita;
	
	public void setEsquerda(Nodo esquerda) {
		this.esquerda = esquerda;
	}
	
	public void setDireita(Nodo direita) {
		this.direita = direita;
	}
	
	public int getValor() {
		return valor;
	}
	
	public void setValor(int valor) {
		this.valor = valor;
	}
	
	public Nodo getEsquerda() {
		return esquerda;
	}
	
	public Nodo getDireita() {
		return direita;
	}
	
	/**
	  * Construtor
	  */
	public Nodo(int value) {
		this.valor = value;
	}
	
	public boolean insere(int value) {
            if (value == this.valor) {
                    System.out.println("valor ja existe na arvore");
                    return false;
            } else if (value < this.valor) {
                    if (esquerda == null) {
                            esquerda = new Nodo(value);
                            System.out.println("inserido " + value + " a esquerda de " + this.valor);
                            return true;
                    } else 
                            return esquerda.insere(value);
            } else if (value > this.valor) {
                    if (direita == null) {
                            direita = new Nodo(value);
                            System.out.println("inserido " + value + " a direita de " + this.valor);
                            return true;
                    } else
                            return direita.insere(value);
            }
            return false;
	}
        
        public static String imprimir(Nodo aux) {
            String retorno;
            retorno = "(";
            if (aux != null) {
                    retorno += "C" + aux.valor; 
                retorno += imprimir(aux.esquerda);
                retorno += imprimir(aux.direita);
            }
            retorno += ")";
            return retorno;
        }
	
}