package com.renatoandrade.cepservice;

import com.ibm.asyncutil.iteration.AsyncIterator;
import com.renatoandrade.model.Endereco;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import java.util.logging.Logger;

public abstract class AbstractCepService implements CepService {

    private static final Logger LOG = Logger.getLogger(AbstractCepService.class.getName());
    private final WebTarget target;
    private final Client client;
    private final String dominio;

    public AbstractCepService(String dominio) {
        this.dominio = insertTrailingSlash(dominio);
        this.client = ClientBuilder.newClient();
        this.target = client.target(dominio);
    }

    protected final String insertTrailingSlash(String path) {
        return path.endsWith("/") ? path : path + "/";
    }

    protected WebTarget buildPath(String caminho) {
        return client.target(dominio + caminho);
    }

    protected String getFullPath(String cep) {
        return this.dominio + buildPath(cep);
    }

    @Override
    public Endereco buscaEndereco(String cep) {
        LOG.info(
                String.format("Buscando endereço para o CEP %s usando serviço %s", cep, dominio)
        );
        return buildPath(cep).request().get(Endereco.class);

    }
}
