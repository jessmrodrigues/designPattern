public class FabricaPessoa implements Factory{
    @Override
    public Pessoa getPessoa(String nome, String sexo) {
        if(sexo.equals("M"))
            return new Homem(nome);
        return new Mulher(nome);
    }
}
