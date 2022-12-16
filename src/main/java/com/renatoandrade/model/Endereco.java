package com.renatoandrade.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Endereco {
    @JsonAlias({"logradouro", "address"})
    private String logradouro;
    private String complemento;

    @JsonAlias({"bairro", "district"})
    private String bairro;

    @JsonAlias({"uf", "state"})
    private String  uf;
    @JsonAlias({"localidade", "city"})
    private String  localidade;
    @JsonAlias({"cep", "code"})
    private String  cep;

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getLocalidade() {
        return localidade;
    }

    public void setLocalidade(String localidade) {
        this.localidade = localidade;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Logradouro: ").append(logradouro);
        if(complemento != null && !complemento.isEmpty()) {
            builder.append(" - Complemento: ").append(complemento);
        }
        builder.append(" - Bairro: ").append(bairro);
        builder.append(" - Localidade: ").append(localidade);
        builder.append(" - UF: ").append(uf);
        builder.append(" - CEP: ").append(cep);

        return builder.toString();
    }
}
