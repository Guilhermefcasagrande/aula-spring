package br.edu.unidavi.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clientes")
public class ClienteRestController {

    @Autowired
    ClienteRepository repo;

    @GetMapping
    public List<Cliente> getAll(){
        return repo.findAll();
    }

    @GetMapping("/nome/{nome}")
    public List<Cliente> getAll(@PathVariable String nome){
        return repo.findByNome(nome);
    }


    @PostMapping
    public Cliente create(@RequestBody Cliente cliente){
        return repo.save(cliente);
    }
}
