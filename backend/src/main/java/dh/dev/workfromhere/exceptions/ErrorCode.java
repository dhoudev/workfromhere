package dh.dev.workfromhere.exceptions;

import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
public enum ErrorCode {
    SPACE_NOT_FOUND("Space Resource Cannot Be Found", HttpStatus.NOT_FOUND),;

    private final String errorMessage;
    private final HttpStatus httpStatus;

    ErrorCode(String errorMessage, HttpStatus httpStatus) {
        this.errorMessage = errorMessage;
        this.httpStatus = httpStatus;
    }
}
