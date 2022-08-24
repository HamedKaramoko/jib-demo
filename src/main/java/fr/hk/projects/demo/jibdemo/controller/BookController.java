package fr.hk.projects.demo.jibdemo.controller;

import fr.hk.projects.demo.jibdemo.dto.BookDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api/v1/Books")
@Slf4j
public class BookController {

    @GetMapping
    public List<BookDto> getBooks() {
        log.info("I am in");
        List<BookDto> books = Arrays.asList(new BookDto("isbn1", "Book1"), new BookDto("isbn2", "Book2"));
        log.info("I am about to leave with {}", books);
        return books;
    }
}
