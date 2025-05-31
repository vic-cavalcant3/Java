package com.senai.cavalcante.Service;

import org.springframework.stereotype.Service;
import com.senai.cavalcante.Interface.AlunoRepository;
import com.senai.cavalcante.Model.AlunoSenai;

import java.util.List;

@Service
public class AlunoService {
    private final AlunoRepository alunoRepository;

    public AlunoService(AlunoRepository alunoRepository) {
        this.alunoRepository = alunoRepository;
    }

    public List<AlunoSenai> buscarAlunos(){
        return alunoRepository.findAll();
    }

    public AlunoSenai salvar(AlunoSenai alunos){
        return alunoRepository.save(alunos);
    }

    public void deletar(Long id){alunoRepository.deleteById(id);}

    public AlunoSenai buscarPorId(Long id){
        return alunoRepository.findById(id).orElse(null);
    }
}
