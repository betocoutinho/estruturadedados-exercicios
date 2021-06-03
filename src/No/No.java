package No;

public class No <T>{
    private T elemento;
    private No proximo;

    public No(T elemento, No proximo) {
        this.elemento = elemento;
        this.proximo = proximo;
    }

    public Object getElemento() {
        return elemento;
    }

    public void setElemento(T elemento) {
        this.elemento = elemento;
    }

    public No getProximo() {
        return proximo;
    }

    public void setProximo(No proximo) {
        this.proximo = proximo;
    }
}
