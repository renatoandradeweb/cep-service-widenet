package com.renatoandrade.cepservice;

import com.renatoandrade.model.Endereco;

public interface CepService {
    Endereco buscaEndereco(String cep);
}
