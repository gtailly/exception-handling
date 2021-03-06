package fr.gtailly.exceptions.handling.object;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.INTERNAL_SERVER_ERROR)
public class BadRequestException extends RuntimeException {
    public BadRequestException(String message, Object... args) {
        super(String.format(message, args));
    }
}
