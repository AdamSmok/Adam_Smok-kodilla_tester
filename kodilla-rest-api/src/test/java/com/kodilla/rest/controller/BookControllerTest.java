package com.kodilla.rest.controller;

import com.kodilla.rest.domain.BookDto;
import com.kodilla.rest.service.BookService;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class BookControllerTest {

    private static BookService bookServiceMock;
    private BookController bookController;

    @BeforeAll
    static void setBeforeAll(){
        bookServiceMock = Mockito.mock(BookService.class);
    }

    @BeforeEach
    void setBeforeEach(){
        bookController =new BookController(bookServiceMock);
    }


    @Test
    void shouldFetchBooks() {
        //given
        List<BookDto> booksList = new ArrayList<>();
        booksList.add(new BookDto("Title 1", "Author 1"));
        booksList.add(new BookDto("Title 2", "Author 2"));
        Mockito.when(bookServiceMock.getBooks()).thenReturn(booksList);

        //when
        List<BookDto> result = bookController.getBooks();

        //then
        assertThat(result).hasSize(2);
    }

    @Test
    void shouldAddBook() {
        //given
        BookDto newBook = new BookDto("New Title", "New Author");

        //when
        bookController.addBook(newBook);

        //then
        ArgumentCaptor<BookDto> bookCaptor = ArgumentCaptor.forClass(BookDto.class);
        Mockito.verify(bookServiceMock, Mockito.times(1)).addBook(bookCaptor.capture());
        BookDto capturedBook = bookCaptor.getValue();
        assertThat(capturedBook.getTitle()).isEqualTo("New Title");
        assertThat(capturedBook.getAuthor()).isEqualTo("New Author");
    }
}