package dh.dev.workfromhere.exceptions;

import dh.dev.workfromhere.spaces.exception.SpaceResourceException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(SpaceResourceException.class)
    public ResponseEntity<ErrorDetails> spaceResourceException(SpaceResourceException e) {
        ErrorDetails errorDetails = ErrorDetails.builder()
                .errorCode(e.getErrorCode())
                .message(e.getErrorCode().getErrorMessage())
                .httpStatus(e.getErrorCode().getHttpStatus())
                .build();

        return new ResponseEntity<>(errorDetails, HttpStatus.BAD_REQUEST);
    }
}
