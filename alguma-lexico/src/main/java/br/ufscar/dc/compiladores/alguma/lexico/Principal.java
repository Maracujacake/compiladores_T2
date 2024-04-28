/*
Analisador sintático feito com base na linguagem fornecida nas aulas de Construção de compiladores 2024/1
O programa aceita um arquivo de entrada contendo um algoritmo e sua saída, caso apresente erros, demonstra as proximidades deste citando
algum ponto de referência

Aluno: Christian Coronel da Silva Polli
RA: 798083

Para demais informações sobre o trabalho, é recomendado visualizar a documentação no repo. do github.
*/

package br.ufscar.dc.compiladores.alguma.lexico;


import java.io.PrintWriter;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import java.io.IOException;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Token;

import java.io.File;
import java.io.FileWriter;

public class Principal {
    
    public static void main(String args[]) throws IOException{
   
        // Cria o arquivo de saída
        Arquivo.createFile(args[1]); 
        // Abre o arquivo fonte passado como parametro
        CharStream cs= CharStreams.fromFileName(args[0]);
        AlgumaLexerLexer lexer = new AlgumaLexerLexer(cs);
        // Inicia a variável Token como null
        Token t = null;
        CommonTokenStream tokens = new CommonTokenStream (lexer);
        
        AlgumaLexerParser parser = new AlgumaLexerParser(tokens);        
        // Instancia a classe responsável em gerar o arquivo de saída
        ErrorListener errList = new ErrorListener();
        parser.removeErrorListeners();
        parser.addErrorListener(errList);
        parser.programa();
    }
}