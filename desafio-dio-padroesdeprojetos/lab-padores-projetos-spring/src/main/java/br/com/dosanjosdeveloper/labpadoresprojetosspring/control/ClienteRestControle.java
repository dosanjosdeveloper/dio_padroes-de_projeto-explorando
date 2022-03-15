package br.com.dosanjosdeveloper.labpadoresprojetosspring.control;


import br.com.dosanjosdeveloper.labpadoresprojetosspring.model.Cliente;
import br.com.dosanjosdeveloper.labpadoresprojetosspring.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class ClienteRestControle {
    @Autowired
    private ClienteService clienteService;

    @GetMapping
    public ResponseEntity<Iterable<Cliente>> buscarTodos(){
        return ResponseEntity.ok(clienteService.buscaTodos());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Cliente> buscarPorId(@PathVariable Long id){
        return ResponseEntity.ok(clienteService.buscarPorId(id));
    }

    @PostMapping("/{id}")
    public ResponseEntity<Cliente> inserir(@PathVariable Long id, @RequestBody Cliente cliente){
        clienteService.inserir(cliente);
        return ResponseEntity.ok(cliente);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id){
        clienteService.deletar(id);
        return ResponseEntity.ok().build();
    }
}
