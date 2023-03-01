public class Director {
    InterfaceObjeto objeto;

    public void setObjeto(InterfaceObjeto objeto) {
        this.objeto = objeto;
    }

    public InterfaceObjeto construcao01(){
        objeto.reset();
        objeto.setAltura(25);
        objeto.setComprimento(35);
        objeto.setCaracteristicas(55);
        return objeto.build();
    }
}
