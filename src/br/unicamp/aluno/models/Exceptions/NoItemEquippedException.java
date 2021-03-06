package br.unicamp.aluno.models.Exceptions;

import java.util.concurrent.ExecutionException;

public class NoItemEquippedException extends ExecutionException {

	private static final long serialVersionUID = 1L;

	public NoItemEquippedException() {
        super("No item equipped");
    }

    public NoItemEquippedException(String message) {
        super(message);
    }

    public NoItemEquippedException(String message, Throwable cause) {
        super(message, cause);
    }

    public NoItemEquippedException(Throwable cause) {
        super(cause);
    }
}
