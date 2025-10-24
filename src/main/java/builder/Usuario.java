package builder;

public class Usuario {
    private final String nombre;
    private final int edad;
    private final String email;

    private Usuario(Builder builder) {
        this.nombre = builder.nombre;
        this.edad = builder.edad;
        this.email = builder.email;
    }

    public static class Builder {
        private String nombre;
        private int edad;
        private String email;

        public Builder nombre(String nombre) { this.nombre = nombre; return this; }
        public Builder edad(int edad) { this.edad = edad; return this; }
        public Builder email(String email) { this.email = email; return this; }

        public Usuario build() { return new Usuario(this); }
    }

    @Override
    public String toString() {
        return "%s (%d años) - %s".formatted(nombre, edad, email);
    }
}
