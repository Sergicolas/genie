package com.genie.userms.Domain.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
@AllArgsConstructor
public class User {

    @Id
    private Long id;

    private String username;

    private String nome;

    private String cpf;

    private String telefone;




}
