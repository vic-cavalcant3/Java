package com.senai.cavalcante.Controller;

import com.senai.cavalcante.Model.AlunoSenai;
import com.senai.cavalcante.Service.AlunoService;

import java.util.List;

public class AlunoControler {

    private final AlunoService service;

    public AlunoControler(AlunoService service){
        this.service = service;
    }

    public List<AlunoSenai> listar(){
        return  service.buscarAlunos();
    }

    public AlunoSenai criar(AlunoSenai aluno){
        return service.salvar(aluno);
    }

    public AlunoSenai buscar(Long id){
        return service.buscarPorId(id);
    }

    public AlunoSenai atualizar (Long id, AlunoSenai novoALuno){
        AlunoSenai alunoExistente = service.buscarPorId(id);
        if(alunoExistente == null) return null;

        alunoExistente.setNome(novoALuno.getNome());
        alunoExistente.setEmail(novoALuno.getEmail());
        alunoExistente.setTelefone(novoALuno.getTelefone());
        return service.salvar(alunoExistente);
    }

    public void deletar(Long id){
        service.deletar(id);
    }
}
