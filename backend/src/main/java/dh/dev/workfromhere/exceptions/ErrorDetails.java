package dh.dev.workfromhere.exceptions;

import lombok.Builder;
import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
@Builder
public class ErrorDetails {

    private final ErrorCode errorCode;
    private final String message;
    private final HttpStatus httpStatus;
}
