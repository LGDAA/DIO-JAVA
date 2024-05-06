public class FormatadorCepExemplo {
    public static void main(String[] args) {
        try {
            String cepFormatado = formatarCep("79330030");
            System.out.println(cepFormatado);
        }
        catch (CepInvalidoException e) {
            System.out.println("O CEP nao corresponde com as regra de negocio");
        }
    }
        
        static String formatarCep(String cep) throws CepInvalidoException{
            if(cep.length() != 8)
              throw new CepInvalidoException();
            
              //simulando um cep formatado
              return "79.330-030";
            }
    }
