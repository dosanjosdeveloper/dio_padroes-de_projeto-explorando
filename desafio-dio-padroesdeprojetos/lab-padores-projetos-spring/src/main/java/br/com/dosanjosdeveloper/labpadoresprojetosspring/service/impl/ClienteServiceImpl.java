package br.com.dosanjosdeveloper.labpadoresprojetosspring.service.impl;

import br.com.dosanjosdeveloper.labpadoresprojetosspring.model.Cliente;
import br.com.dosanjosdeveloper.labpadoresprojetosspring.model.ClienteRepository;
import br.com.dosanjosdeveloper.labpadoresprojetosspring.model.Endereco;
import br.com.dosanjosdeveloper.labpadoresprojetosspring.model.EnderecoRepository;
import br.com.dosanjosdeveloper.labpadoresprojetosspring.service.ClienteService;
import br.com.dosanjosdeveloper.labpadoresprojetosspring.service.ViaCepService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ClienteServiceImpl implements ClienteService {
    @Autowired
    private ClienteRepository clienteRepository;
    @Autowired
    private EnderecoRepository enderecoRepository;
    @Autowired
    private ViaCepService viaCepService;
    @Override
    public Iterable<Cliente> buscaTodos() {
        return clienteRepository.findAll();
    }

    @Override
    public Cliente buscarPorId(Long id) {
        Optional<Cliente> cliente = clienteRepository.findById(id);
        return cliente.get();
    }

    @Override
    public void inserir(Cliente cliente) {
        salvarClienteComCep(cliente);
    }

    private void salvarClienteComCep(Cliente cliente) {
        String cep = cliente.getEndereco().getCep();
        Endereco endereco = enderecoRepository.findById(cep).orElseGet(()->{
            Endereco novoEndereco = viaCepService.consultaCep(cep);
            return novoEndereco; });
        cliente.setEndereco(endereco);
        clienteRepository.save(cliente);
    }

    @Override
    public void atualizar(Long id, Cliente cliente) {
        Optional<Cliente> clienteBd = clienteRepository.findById(id);
        if (clienteBd.isPresent()){
            salvarClienteComCep(cliente);
        }else {
            System.out.println("Cliente Não Encontrado.");
        }
    }

    @Override
    public void deletar(Long id) {
        clienteRepository.deleteById(id);
    }
}
