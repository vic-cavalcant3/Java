package com.senai.cavalcante.Interface;

import com.senai.cavalcante.Model.AlunoSenai;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlunoRepository extends JpaRepository<AlunoSenai,Long> {
}
