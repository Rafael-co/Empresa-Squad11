package org.soulcodeacademy.empresa.controllers;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class DependenteController {
 @Autowired
    private DependenteService dependenteService;
    @GetMapping("/dependentes")
    public List<Dependente> listar() {
        return this.dependenteService.listar();
    }

    @GetMapping("/dependentes/{idDependente}")
    public Dependente getDependente(@PathVariable Integer idDependente) {
        return this.dependenteService.getDependente(idDependente);
    }

    @PostMapping("/dependentes")
    public Dependente salvar(@Valid @RequestBody DependenteDTO dependente) {
        Dependente salvo = this.dependenteService.salvar(dependente);
        return salvo;
    }

    @PutMapping("/dependentes/{idDependente}")
    public Dependente atualizar(@PathVariable Integer idDependente, @Valid @RequestBody DependenteDTO dependente) {
        Dependente atualizado = this.dependenteService.atualizar(idDependente, dependente);
        return atualizado;
    }

    @DeleteMapping("/dependentes/{idDependente}")
    public void deletar(@PathVariable Integer idDependente) {
        this.dependenteService.deletar(idDependente);
    }
}


