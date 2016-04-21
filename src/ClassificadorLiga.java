// N�s (Aline, Jonatan, Gabriel), garantimos que:
//
// - N�o utilizamos c�digo fonte obtidos de outros estudantes,
// ou fonte n�o autorizada, seja modificado ou c�pia literal.
// - Todo c�digo usado em nosso trabalho � resultado do nosso
// trabalho original, ou foi derivado de um
// c�digo publicado nos livros texto desta disciplina.
// - Temos total ci�ncia das consequ�ncias em caso de violarmos estes termos.

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ClassificadorLiga {

	private static BufferedReader bufferArq;

	public static void main(String[] args) 
	{		
		String caminhoArquivo = "C:\\Users\\Jonatan\\Documents\\E0.csv";
        if(args.length > 0)
            caminhoArquivo = args[0];
        
        try{
        	File arquivo = new File(caminhoArquivo);
        	String linhaArquivo;
        	FileReader arquivoFileReader = new FileReader(arquivo);
			bufferArq = new BufferedReader(arquivoFileReader);
        	while ((linhaArquivo = bufferArq.readLine()) != null) {
        		System.out.println(linhaArquivo);
        	}
        }catch(IOException excep){
            System.out.println("Problema ao ler arquivo "+ caminhoArquivo +". "+ excep.getMessage());
        }
	}

}
