package br.com.fiap.springpfentregas.dto.request;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PastOrPresent;

import java.time.LocalDate;

public record PessoaRequest(

        @NotNull(message = "O nome é obrigatório")
        String nome,

        @Email(message = "Email inválido")
        @NotNull(message = "O atriburo email pessoa é obrigatório")
        String email,

        @PastOrPresent(message = "A data de nascimento não pode ser no futuro")
        @NotNull(message = "O atriburo data de nascimento é obrigatório")
        LocalDate nascimento

) {
}
