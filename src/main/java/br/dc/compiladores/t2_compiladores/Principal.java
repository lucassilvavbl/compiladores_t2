package br.dc.compiladores.t2_compiladores;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;

public class Principal {
    public static void main(String args[]) throws IOException {
        try (PrintWriter pw = new PrintWriter(new FileOutputStream(args[1]))) {
            int x = 0;
            // Cria um CharStream a partir do arquivo de entrada e cria um lexer para
            // analisar o CharStream
            CharStream cs = CharStreams.fromFileName(args[0]);
            t2_compiladoresLexer lexer = new t2_compiladoresLexer(cs);

            // Cria um CommonTokenStream a partir dos tokens gerados pelo lexer e cria um
            // parser que vai utilizar os tokens para fazer a análise sintática
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            t2_compiladoresParser parser = new t2_compiladoresParser(tokens);

            // Remove os listeners padrão
            parser.removeErrorListeners();
            // Cria um objeto com os erros personalizados
            RegistraErros re = new RegistraErros(pw, x);

            // Inicia o programa
            parser.addErrorListener(re);

            parser.programa();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}