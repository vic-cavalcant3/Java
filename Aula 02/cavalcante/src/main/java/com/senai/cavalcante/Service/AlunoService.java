package com.senai.cavalcante.Service;

import com.senai.cavalcante.Interface.AlunoRepository;
import com.senai.cavalcante.Model.AlunoSenai;

import java.util.List;

public class AlunoService {
    private final AlunoRepository repository;

    public AlunoService(AlunoRepository repository) {
        this.repository = repository;
    }

    public List<AlunoSenai> buscarAlunos(){
        return repository.findAll();
    }

    public AlunoSenai salvar(AlunoSenai aluno){
        return repository.save(aluno);
    }

    public void deletar(Long id){
        repository.deleteById(id);
    }

    public AlunoSenai buscarPorId(Long id){
        return repository.findById(id).orElse(null);
    }
}
