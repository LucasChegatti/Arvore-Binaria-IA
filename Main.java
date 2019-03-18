
public class Main{
    
    public static void main(String[] args) {
        
        System.out.println("---------Inicio Arvore-----------");
        ArvoreBinaria ab = new ArvoreBinaria();
        ab.insere(5);
        ab.insere(3);
        ab.insere(4);
        ab.insere(7);
        ab.insere(6);
        ab.insere(17);
        ab.insere(12);
        ab.insere(25);
        System.out.println("----------Fim Arvore-------------");
        
        System.out.println("---------Inicio EmOrdem----------");
        ab.percorre(new EmOrdem());
        System.out.println("-----------Fim EmOrdem-----------");
        
        System.out.println("-------Inicio Profundidade-------");
        ab.percorre(new Profundidade());
        System.out.println("--------Fim Profundidade---------");
        
        System.out.println("---------Inicio EmNivel----------");
        ab.percorre(new EmNivel());
        System.out.println("----------Fim EmNivel------------");
        
        System.out.println("---------Inicio remove-----------");
        ab.remove(17);
        System.out.println("----------Fim remove-------------");
        
        System.out.println("-------Inicio Profundidade-------");
        ab.percorre(new Profundidade());
        System.out.println("--------Fim Profundidade---------");
        
    }
}
