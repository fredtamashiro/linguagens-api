package br.com.fredtamashiro.linguagensapi;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LinguagemController {

    // private List<Linguagem> linguagens = 
    //     List.of(
    //         new Linguagem("PHP", "https://raw.githubusercontent.com/abrahamcalf/programming-languages-logos/master/src/php/php_512x512.png",1),
    //         new Linguagem("Java","https://raw.githubusercontent.com/abrahamcalf/programming-languages-logos/master/src/java/java_512x512.png",2),
    //         new Linguagem("C Sharp","https://raw.githubusercontent.com/abrahamcalf/programming-languages-logos/master/src/csharp/csharp_512x512.png",2)
    //     );

    
    @Autowired
    private LinguagemRepository repository;

    @GetMapping("/home")
    public String ProcessarHome() {
        return "Bora Programar!";
    }

    @GetMapping("/linguagens")
    public List<Linguagem> obterLinguagens(){
        List<Linguagem> linguagens = repository.findAll();
        return linguagens;
    }

}