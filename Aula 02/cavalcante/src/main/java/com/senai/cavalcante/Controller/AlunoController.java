package com.senai.cavalcante.Controller;


import com.senai.cavalcante.Model.AlunoSenai;
import com.senai.cavalcante.Service.AlunoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
public class AlunoController {

    private final AlunoService alunoService;

    public AlunoController(AlunoService service) {
        this.alunoService = service;
    }

    @GetMapping
    public List<AlunoSenai> listar() {
        return alunoService.buscarAlunos();
    }

    @PostMapping
    public AlunoSenai salvarAluno(@RequestBody AlunoSenai aluno) {
        return alunoService.salvar(aluno);
    }

    @GetMapping("/{id}")
    public AlunoSenai buscar(@PathVariable Long id) {
        return alunoService.buscarPorId(id);
    }

    @PutMapping("/{id}")
    public AlunoSenai atualizar(@PathVariable Long id, @RequestBody AlunoSenai novoAluno) {
        AlunoSenai alunoExistente = alunoService.buscarPorId(id);
        if (alunoExistente == null) return null;

        alunoExistente.setNome(novoAluno.getNome());
        alunoExistente.setEmail(novoAluno.getEmail());
        alunoExistente.setTelefone(novoAluno.getTelefone());
        return alunoService.salvar(alunoExistente);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        alunoService.deletar(id);
    }
}