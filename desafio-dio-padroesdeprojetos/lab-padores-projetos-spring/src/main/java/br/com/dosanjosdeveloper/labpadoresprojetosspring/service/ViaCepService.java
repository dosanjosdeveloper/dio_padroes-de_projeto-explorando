package br.com.dosanjosdeveloper.labpadoresprojetosspring.service;

import br.com.dosanjosdeveloper.labpadoresprojetosspring.model.Endereco;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "viacep",url = "https://viacep.com.br/ws")
public interface ViaCepService {
    @RequestMapping( method = RequestMethod.GET, value = "/{cep}/json/")
    Endereco consultaCep(@PathVariable("cep") String cep);

//    @GetMapping( "/{cep}/json/")
//    Endereco consultaCeps(@PathVariable("cep") String cep);
}
