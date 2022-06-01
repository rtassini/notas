package com.ifsp.notas.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class NotaNotFoundException extends Exception {
    public NotaNotFoundException(){
        super("Nota não encontrada");
    }
}
