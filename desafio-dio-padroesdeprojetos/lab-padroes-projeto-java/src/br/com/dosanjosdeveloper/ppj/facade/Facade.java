package br.com.dosanjosdeveloper.ppj.facade;

import br.com.dosanjosdeveloper.ppj.facade.subsistema.cep.CepApi;
import br.com.dosanjosdeveloper.ppj.facade.subsistema.crm.CrmService;

public class Facade {
    public void migrarCliente(String nome, String cep){
        String cidade = CepApi.getInstancia().recuperarCidade(cep);
        String estado = CepApi.getInstancia().recuperarCidade(cep);
        CrmService.gravarCliente(nome,cep,cidade,estado);
    }
}
