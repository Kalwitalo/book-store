package dev.kalwitalo.provider.RestController;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/orders")
public class OrderRestController {
    @GetMapping("{id}")
    private ResponseEntity<String> show(@PathVariable Long id) {
        return ResponseEntity.ok("You order a product with id: " + id);
    }
}
