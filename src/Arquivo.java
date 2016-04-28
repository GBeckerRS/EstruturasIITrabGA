// N�s (Aline, Jonatan, Gabriel), garantimos que:
//
// - N�o utilizamos c�digo fonte obtidos de outros estudantes,
// ou fonte n�o autorizada, seja modificado ou c�pia literal.
// - Todo c�digo usado em nosso trabalho � resultado do nosso
// trabalho original, ou foi derivado de um
// c�digo publicado nos livros texto desta disciplina.
// - Temos total ci�ncia das consequ�ncias em caso de violarmos estes termos.

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Arquivo {
	
	public static void SalvarArquivo(String nomeArquivo, String conteudoArquivo){
		FileWriter arq;
		try {
			arq = new FileWriter("misc/" + nomeArquivo);
			PrintWriter gravarArq = new PrintWriter(arq); 
			gravarArq.printf(conteudoArquivo); 
			arq.close();
		} catch (IOException e) {
			System.out.println("Problema ao criar arquivo "+ nomeArquivo + e.getMessage());
		} 
	}
}
