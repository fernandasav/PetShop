public class Main{

    public static void main(String[] args){

        Endereco enderecoUm = new Endereco("Antonio Salles", "14B", "47895-555", "Boa Vista", "Pará");
        Dono donoUm = new Dono("Carlos", "12345678-09", "carlos.silva@gmail.com", enderecoUm);
        Cachorro cachorroUm = new Cachorro (TipoAnimal.CACHORRO, "Bob", 12, true, donoUm,1,CachorroRaca.BEAGLE);

        Endereco enderecoDois = new Endereco("Liberdade", "258", "44585-000", "Bom Retiro", "Bahia");
        Dono donoDois = new Dono("Edna", "25836914-45", "edna_santini@gmail.com", enderecoDois);
        Cachorro cachorroDois = new Cachorro(TipoAnimal.CACHORRO,"Emily", 14, false, donoDois, 2, CachorroRaca.LHASA_APSO);

        Endereco enderecoTres = new Endereco("Flores de Maio", "1515", "11224-333", "Parque das Flores", "São Paulo");
        Dono donoTres = new Dono("Angela", "77886655-13", "angelainacio11@gmail.com", enderecoTres);
        Cachorro cachorroTres = new Cachorro( TipoAnimal.CACHORRO, "Amora", 5, true, donoTres, 3, CachorroRaca.SRD);

        Endereco enderecoQuatro = new Endereco("Pinheiro Tavares", "1313-G", "14466-888", "Bella Nonna", "Paraná");
        Dono donoQuatro = new Dono("Diego", "12555578-09", "santos_diego9@gmail.com", enderecoQuatro);
        Gato gatoQuatro= new Gato (TipoAnimal.GATO, "Tiger", 2, true, donoQuatro,4, GatoRaca.RAGDOLL);

        Endereco enderecoCinco = new Endereco("Veneza", "C105", "11585-100", "Itália", "Rio Grande do Sul");
        Dono donoCinco = new Dono("Lorena", "11836914-11", "lolo_aparecida@gmail.com", enderecoCinco);
        Gato gatoCinco = new Gato(TipoAnimal.GATO,"Lolita", 5, false, donoCinco, 5, GatoRaca.SIAMES);

        Endereco enderecoSeis = new Endereco("Natalino do Norte", "2512", "10220-303", "Polo Norte", "Acre");
        Dono donoSeis = new Dono("Vladmir", "22887755-99", "vladmir-1983@gmail.com", enderecoSeis);
        Gato gatoSeis = new Gato( TipoAnimal.GATO, "Geraldo", 8, true, donoSeis, 6, GatoRaca.PERSA);


        Cadastro cadastro = new Cadastro();
        cadastro.disponivel(cachorroUm);
        cadastro.disponivel(cachorroDois);
        cadastro.disponivel(cachorroTres);
        cadastro.disponivel(gatoQuatro);
        cadastro.disponivel(gatoCinco);
        cadastro.disponivel(gatoSeis);

        cadastro.mostraAnimaisdisponiveis();

    }
}






