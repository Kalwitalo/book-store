package dev.kalwitalo.store.client;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient("provider/provider")
public interface ProviderClient {

    @GetMapping("orders/{id}")
    String show(@PathVariable Long id);
}
