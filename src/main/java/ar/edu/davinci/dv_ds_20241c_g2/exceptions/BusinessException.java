package ar.edu.davinci.dv_ds_20241c_g2.exceptions;

public class BusinessException extends Exception {
    private static final long serialVersionUID = -9129839746807292097L;

    public BusinessException(String mensaje) {
        super(mensaje);
    }
}
