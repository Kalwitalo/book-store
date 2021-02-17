package dev.kalwitalo.store.service;

import dev.kalwitalo.store.client.ProviderClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {
    @Autowired
    ProviderClient providerClient;

    public String findInformation(Long id) {
        return providerClient.show(id);
    }
}
