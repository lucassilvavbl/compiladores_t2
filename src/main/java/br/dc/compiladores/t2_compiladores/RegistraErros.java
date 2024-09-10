package br.dc.compiladores.t2_compiladores;

import org.antlr.v4.runtime.ANTLRErrorListener;
import org.antlr.v4.runtime.atn.ATNConfigSet;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.Token;
import java.io.PrintWriter;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import java.util.BitSet;

public class RegistraErros implements ANTLRErrorListener {
    PrintWriter pw;
    int qtd_Erros;

    public RegistraErros(PrintWriter pw, int qtd_Erros) {
        this.pw = pw;
        this.qtd_Erros = qtd_Erros;
    }

    @Override
    public void reportAmbiguity(Parser recognizer, DFA dfa, int startIndex, int stopIndex, boolean exact,
            BitSet ambigAlts, ATNConfigSet configs) {
    }

    @Override
    public void reportAttemptingFullContext(Parser recognizer, DFA dfa, int startIndex, int stopIndex,
            BitSet conflictingAlts, ATNConfigSet configs) {
    }

    @Override
    public void reportContextSensitivity(Parser recognizer, DFA dfa, int startIndex, int stopIndex, int prediction,
            ATNConfigSet configs) {
    }

    @Override
    public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine,
            String msg, RecognitionException e) {

        Token t = (Token) offendingSymbol;

        // Verificação de erros
        if (qtd_Erros == 0) {
            if ("<EOF>".equals(t.getText())) {
                pw.println("Linha " + line + ": erro sintatico proximo a EOF");
                qtd_Erros = 1;
            } else if (t.getType() == t2_compiladoresLexer.CADEIA_ABERTA) {
                pw.println("Linha " + line + ": cadeia literal nao fechada");
                qtd_Erros = 1;
            } else if (t.getType() == t2_compiladoresLexer.COMENTARIO_ABERTO) {
                pw.println("Linha " + line + ": comentario nao fechado");
                qtd_Erros = 1;
            } else if (t.getType() == t2_compiladoresLexer.ERRO) {
                pw.println("Linha " + line + ": " + t.getText() + " - simbolo nao identificado");
                qtd_Erros = 1;
            } else {
                pw.println("Linha " + line + ": erro sintatico proximo a " + t.getText());
                qtd_Erros = 1;
            }
            pw.println("Fim da compilacao");
        }
    }
}