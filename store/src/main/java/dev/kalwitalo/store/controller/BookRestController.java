package dev.kalwitalo.store.controller;

import dev.kalwitalo.store.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/books")
public class BookRestController {
    @Autowired
    BookService bookService;

    @GetMapping
    public String index() {
        return "Show books";
    }

    @GetMapping("{id}")
    public String show(@PathVariable Long id) {
        String bookMessage = bookService.findInformation(id);
        String message = "Show book ";
        message += " - " + bookMessage;
        return message;
    }
}
