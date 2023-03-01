public class Main {
    public static void main(String args[]){
        FabricaPessoa factory = new FabricaPessoa();


        String nome = "jess";
        String sexo = "F";

        Pessoa p = factory.getPessoa(nome, sexo);
        System.out.println(p.getNome());
    }
}
