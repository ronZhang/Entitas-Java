package ilargia.entitas.exceptions;

import ilargia.entitas.api.entitas.EntitasException;

public class CollectorException extends EntitasException {
    public CollectorException(String message, String hint) {
        super(message, hint);
    }
}