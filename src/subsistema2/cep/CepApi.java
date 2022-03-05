package subsistema2.cep;

import o.di.gof.SingletonEager;

public class CepApi {
    private  static CepApi instancia = new CepApi();

    private CepApi(){
        super();
    }

    public static CepApi getInstancia(){
        return instancia;

    }
    public String recuperarCidade (String cep){
        return "Sao Jose dos Campos";
    }

    public String recuperarEStado(String cep){
        return "SP";
    }
}

