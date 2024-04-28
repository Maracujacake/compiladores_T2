package br.ufscar.dc.compiladores.alguma.lexico;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Arquivo{

    // Buffer do arquivo informado pelo usuário
    public static StringBuffer arquivo = new StringBuffer(); 
    // Caminho do arquivo informado pelo usuário
    public static String filePath;                           
    
    
    public static void AddString(String texto){
        arquivo.append(texto).append("\n");
    }
    
    
    public static String getTexto(){
        return arquivo.toString();
    }
    
    public static void createFile(String caminho){
        filePath = caminho;
    }
    
 
    public static void gravaArquivo(){
        
        try {
            Files.writeString(Paths.get(filePath), getTexto());
        } 
        catch (IOException e) {
        }
        
        System.exit(0);

    }    
    
}