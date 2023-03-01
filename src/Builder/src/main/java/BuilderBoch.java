public class BuilderBoch {
    int comprimento, altura, largura;

    public BuilderBoch() {

    }

    public BuilderBoch SetComprimento(int x) {
        this.comprimento = x;
        return this;
    }

    public BuilderBoch setAltura(int x) {
        this.altura = x;
        return this;
    }

    public BuilderBoch setLargura(int x) {
        this.largura = x;
        return this;
    }

    public BuilderBoch build() {
        return this;
    }

    public static BuilderBoch getInstance() {
        return new BuilderBoch();
    }
    BuilderBoch bb = BuilderBoch.getInstance().
            SetComprimento(10).
            setAltura(15).
            setLargura(15).
            build();
}


