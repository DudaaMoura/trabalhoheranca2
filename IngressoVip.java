public class IngressoVip extends Ingresso {

    private float valorAdicional;

    public void setValorAdicional(float valorAdicional) {
        this.valorAdicional = valorAdicional;
    }

    public float getValorAdicional() {
        return valorAdicional;
    }
    
    
    public IngressoVip(float valor, float valorAdicional){
        super();
        this.valorAdicional = valorAdicional;

    }
    public IngressoVip(){

    }

    public String toString(){
        return "O valor total é:"+(valorAdicional+getValor());
    }


    
}
