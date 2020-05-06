package br.com.curso.mc.resource.HandlerException;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class ValidationError extends StandardError{
    private List<FieldMessage> errors = new ArrayList<FieldMessage>();

    public ValidationError(Integer status, String mensagem, Calendar timeStamp) {
        super(status, mensagem, timeStamp);
    }

    public List<FieldMessage> getErrors() {
        return errors;
    }

    public void addError(String fieldName,String message) {
        errors.add(new FieldMessage(fieldName,message));
    }
}
