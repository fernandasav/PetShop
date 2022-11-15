
    public class Gato extends Animal{

        private GatoRaca gatoRaca;

        public Gato(TipoAnimal tipoAnimal, String nome, int idade, boolean estaDoente, Dono dono, int id, GatoRaca gatoRaca) {
            super(tipoAnimal, nome, idade, estaDoente, dono, id);
            this.gatoRaca = gatoRaca;
        }

        public GatoRaca getGatoRaca() {
            return gatoRaca;
        }

        public void setGatoRaca(GatoRaca gatoRaca) {
            this.gatoRaca = gatoRaca;
        }

        @Override
        public String toString() {
            return super.toString() +
                    "\n RAÇA DO GATO: " + gatoRaca +
                    "\n" + "___________________________";
        }
    }


