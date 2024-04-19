package org.group35EducationCenter.validation.handler;

import org.group35educationcenter.validation.dto.ValidationErrorDto;
import org.group35educationcenter.validation.dto.ValidationErrorsDto;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.ArrayList;
import java.util.List;

@ControllerAdvice
public class ValidationExceptionHandler {

    // перехват ошибки валидации и возврат клиенту понятного JSON
    @ExceptionHandler(value = MethodArgumentNotValidException.class)
    public ResponseEntity<ValidationErrorsDto> handleValidationException(MethodArgumentNotValidException e){
        List<ValidationErrorDto> validationErrors = new ArrayList<>();

        //получаем список всех ошибок
        List<ObjectError> errors = e.getBindingResult().getAllErrors();

        // проходим по всем ошибкам и для каждой получаем где она возникла, какое значение было неправильное

        for (ObjectError error : errors) {
            FieldError fieldError = (FieldError) error;
            // собираем сводную информацию об ошибке для JSON
            ValidationErrorDto errorDto = ValidationErrorDto.builder()
                    .field(fieldError.getField()) // указываем название поля
                    .message(fieldError.getDefaultMessage()) // указываем текст ошибки
                    .build();

            if (fieldError.getRejectedValue() != null) {
                errorDto.setRejectedValue(fieldError.getRejectedValue().toString());
            }

            validationErrors.add(errorDto);
        }

        return ResponseEntity
                .badRequest()
                .body(ValidationErrorsDto.builder()
                        .errors(validationErrors)
                        .build());

    }
}
