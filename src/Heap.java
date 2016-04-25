// N�s (Aline, Jonatan, Gabriel), garantimos que:
//
// - N�o utilizamos c�digo fonte obtidos de outros estudantes,
// ou fonte n�o autorizada, seja modificado ou c�pia literal.
// - Todo c�digo usado em nosso trabalho � resultado do nosso
// trabalho original, ou foi derivado de um
// c�digo publicado nos livros texto desta disciplina.
// - Temos total ci�ncia das consequ�ncias em caso de violarmos estes termos.


public interface Heap
{
    public int parent (int index);
    public int left (int index);
    public int right (int index);
    public void buildHeap (ObjetoOrdenado[] arranjo);
    public void heapfy (int indexRoot);
    public void insert ();
    public int extract ();
    public void increase ();
    public void printHeap ();
    public int get_qtElementos();
    public void set_qtElementos(int _qtElementos);
    public ObjetoOrdenado[] getHeap();
}

