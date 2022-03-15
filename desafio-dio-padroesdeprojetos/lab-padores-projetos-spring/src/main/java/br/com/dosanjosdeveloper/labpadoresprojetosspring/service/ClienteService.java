package br.com.dosanjosdeveloper.labpadoresprojetosspring.service;

import br.com.dosanjosdeveloper.labpadoresprojetosspring.model.Cliente;

public interface ClienteService {
    Iterable<Cliente> buscaTodos();
    Cliente buscarPorId(Long id);
    void inserir(Cliente cliente);
    void atualizar(Long id,Cliente cliente);
    void deletar(Long id);
}
