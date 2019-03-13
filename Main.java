
public class Main{
    
    public static void main(String[] args) {
        
        ArvoreBinaria ab = new ArvoreBinaria();
        ab.insere(5);
        ab.insere(3);
        ab.insere(4);
        ab.insere(7);
        ab.insere(6);
        ab.insere(17);
        ab.insere(12);

        System.out.println("---------Inicio EmOrdem----------");
        ab.percorre(new EmOrdem());
        System.out.println("-----------Fim EmOrdem-----------");
        
        System.out.println("-------Inicio Profundidade-------");
        ab.percorre(new Profundidade());
        System.out.println("--------Fim Profundidade---------");
        
        System.out.println("---------Inicio EmNivel----------");
        ab.percorre(new EmNivel());
        System.out.println("----------Fim EmNivel------------");
        
        ab.remove(6);
        
    }
}
