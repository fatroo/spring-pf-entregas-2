package br.com.fiap.springpfentregas.dto.request;

import jakarta.validation.constraints.FutureOrPresent;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDateTime;
import java.util.Collection;

public record ViagemRequest(
        Collection<AbstractRequest> produtos,
        Collection<AbstractRequest> passageiros,
        @NotNull(message = "O atributo cliente é obrigatória ")
        AbstractRequest cliente,
        @NotNull(message = "O endereço origem é obrigatório" )
        EnderecoRequest origem,
        @NotNull(message = "O endereço destino é obrigatório" )
        EnderecoRequest destino,
        @FutureOrPresent
        LocalDateTime saida,
        @FutureOrPresent
        LocalDateTime chegada
) {
}
