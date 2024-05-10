import java.util.Scanner;
public class Contador {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        int parametroUm = 0;
        int parametroDois = 0;

        System.out.println("Digite o primeiro parametro:");
        parametroUm = s.nextInt();

        System.out.println("Digite o segundo parametro:");
        parametroDois = s.nextInt();
        
        try{
            contar(parametroUm, parametroDois);
        }catch(ParametrosInvalidosException e){
            System.out.println("O segundo parametro tem que ser maior que o primeiro");
        }


    
    }
    static void contar(int parametroUm, int parametroDois)throws ParametrosInvalidosException{

        if(parametroDois > parametroUm){
            for(int indice = parametroUm ; parametroUm <= parametroDois; indice++ ){
                System.out.println("Imprimindo o número " + indice);
                parametroUm++;
                }
            }else{
                throw new ParametrosInvalidosException();
            }

    }
}
