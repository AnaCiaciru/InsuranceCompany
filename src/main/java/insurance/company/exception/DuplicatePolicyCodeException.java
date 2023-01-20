package insurance.company.exception;

public class DuplicatePolicyCodeException extends RuntimeException{
    public DuplicatePolicyCodeException() {super("An Insurance Policy with the same PolicyCode already exists!");}
}
