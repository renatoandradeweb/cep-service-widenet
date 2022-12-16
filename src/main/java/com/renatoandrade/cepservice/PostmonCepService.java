package com.renatoandrade.cepservice;

import javax.ws.rs.client.WebTarget;

public class PostmonCepService extends AbstractCepService {
    public PostmonCepService() {
        super("https://api.postmon.com.br");
    }

    @Override
    protected WebTarget buildPath(final String cep) {
        return super.buildPath("v1/cep/" + cep);
    }
}
