package com.example.nlw_week;

// todas essas anotações são "componentes", que baseados em seus nomes, fazem o Spring entender o que é cada trecho
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
/*MÉTODOS COMUNS
 * - get = buscar uma informação dentro do servidor
 * - put = alterar uma informação dentro do servidor
 * - post = inserir uma informação dentro do servidor
 * - delete = deletar uma informação dentro do servidor
 * - patch = alterar PONTUALMENTE uma informação dentro do servidor
 */

/*TIPOS DE PARÂMETROS
 * - Body - cria um corpo para envio de parâmetros { }
 * - Query Params - parâmetros baseados em query, contendo chaves e valores ex: http://localhost:8085/users?nome=Gabriel&idade=23 (opcional) separados por '&'
 * - Parâmetros de rotas - fazem parte da rota e têm obrigatoriedade de serem informados ex: http://localhost:8085/users/{nome}/{idade}
 */

@RestController // começo da API Rest e informando ao compilador que toda a classe se torna uma
                // Controller
@RequestMapping("/mapping") // informa qual o recurso/path que o navegador deve procurar ao iniciar a
                            // aplicação
public class PrimeiraController {

    @GetMapping("/retornarMapping") // definição do path para fazer uma espécie de ligação entre o RequestMapping e
                                    // o método por meio do GetMapping
    public Usuario retornoPrimeiraController() { // criação do método da execução e que gera um retorno ao usuário
        var usuario = new Usuario("Gabriel", 23); // quando o compilador sabe qual o tipo do retorno, é possível
                                                  // utilizar o "var" ao invés de ter que especificar o tipo da variável
                                                  // ou objeto que se está retornando. E além disso, nessa linha está
                                                  // ocorrendo a instanciação do objeto
        return usuario; // retorna o objeto como se fosse um .json
    }

    @PostMapping("/primeiroPost") // o navegador só é capaz de acessar recursos via Get e não Post, para isso é preciso do HttPie
    public String primeiroPost() {
        return "Meu primeiro post...";
    }

    // criação do objeto construtor
    record Usuario(String nome, int idade) {
    }

}
