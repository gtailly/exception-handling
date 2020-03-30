package fr.gtailly.exceptions.handling.object;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NO_CONTENT)
public class NoContentException extends RuntimeException {
    public NoContentException(String message, Object... args) {
        super(String.format(message, args));
    }
}
