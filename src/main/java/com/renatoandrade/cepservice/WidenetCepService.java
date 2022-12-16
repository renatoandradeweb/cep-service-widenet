package com.renatoandrade.cepservice;

import javax.enterprise.context.Dependent;
import javax.ws.rs.client.WebTarget;

@Dependent
public class WidenetCepService extends AbstractCepService {
    public WidenetCepService() {
        super("https://apps.widenet.com.br/");
    }

    @Override
    protected WebTarget buildPath(final String cep) {
        return super.buildPath("busca-cep/api/cep.json?code=" + cep);
    }
}
