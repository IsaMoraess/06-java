public class ContaNetflix {
    String idiomaPreferencial;
    String resolucaoTela;

    void entrar() {
        buscarPreferenciasDoUsuario();
        identificarResolucao();
    }

    void buscarPreferenciasDoUsuario() {
        idiomaPreferencial = "PT-BR";
    }

    void identificarResolucao() {
        resolucaoTela = "Full HD";
    }

    void assistirFilme(String nomeFilme) {
        System.out.println("Iniciando o filme" + nomeFilme);
        System.out.println("Carrregando o filme na resoluçao" + resolucaoTela);
        carregarAudioFilme();
    }

    void carregarAudioFilme() {
    if (idiomaPreferencial == "PT-BR" || idiomaPreferencial == "EN-USA") {
        System.out.println("Carregando o audio em " + idiomaPreferencial );
    } else {
        System.out.println("Carregando o audio em EN-USA");

    }
    }
}

