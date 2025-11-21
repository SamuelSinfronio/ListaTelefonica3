package ifba;

public class ListaEncadeada { 
    private class No {
        Telefone dado;
        No proximo;

        No(Telefone dado) {
            this.dado = dado;
            this.proximo = null;
        }
    }

    private No inicio;
    private int tamanho;

    public ListaEncadeada() {
        this.inicio = null;
        this.tamanho = 0;
    }
    

    public void inserirInicio(Telefone tel) {
        No novo = new No(tel);
        novo.proximo = inicio;
        inicio = novo;
        tamanho++;
    }

    public void inserirFim(Telefone tel) {
        No novo = new No(tel);

        if (inicio == null) {
            inicio = novo;
        } else {
            No aux = inicio;
            while (aux.proximo != null) {
                aux = aux.proximo;
            }
            aux.proximo = novo;
        }
        tamanho++;
    }

    public void inserirPosicao(Telefone tel, int pos) {
        if (pos < 0 || pos > tamanho) {
            System.out.println("Posição inválida.");
            return;
        }

        if (pos == 0) {
            inserirInicio(tel);
            return;
        }

        No novo = new No(tel);
        No aux = inicio;

        for (int i = 0; i < pos - 1; i++) {
            aux = aux.proximo;
        }

        novo.proximo = aux.proximo;
        aux.proximo = novo;
        tamanho++;
    }

    public void removerInicio() {
        if (inicio == null) {
            System.out.println("Lista vazia.");
            return;
        }
        inicio = inicio.proximo;
        tamanho--;
    }

    public void removerFim() {
        if (inicio == null) {
            System.out.println("Lista vazia.");
            return;
        }

        if (inicio.proximo == null) {
            inicio = null;
        } else {
            No aux = inicio;
            while (aux.proximo.proximo != null) {
                aux = aux.proximo;
            }
            aux.proximo = null;
        }

        tamanho--;
    }

    public void removerPosicao(int pos) {
        if (pos < 0 || pos >= tamanho) {
            System.out.println("Posição inválida.");
            return;
        }

        if (pos == 0) {
            removerInicio();
            return;
        }

        No aux = inicio;
        for (int i = 0; i < pos - 1; i++) {
            aux = aux.proximo;
        }

        aux.proximo = aux.proximo.proximo;
        tamanho--;
    }


    public Telefone verificarPosicao(int pos) {
        if (pos < 0 || pos >= tamanho) {
            System.out.println("Posição inválida.");
            return null;
        }

        No aux = inicio;
        for (int i = 0; i < pos; i++) {
            aux = aux.proximo;
        }

        return aux.dado;
    }


    public void listar() {
        if (inicio == null) {
            System.out.println("Lista vazia.");
            return;
        }

        No aux = inicio;
        int index = 0;

        while (aux != null) {
            System.out.println(index + " - " + aux.dado);
            aux = aux.proximo;
            index++;
        }
    }

    public int getTamanho() {
        return tamanho;
    }
	    public Telefone pesquisar(String nome) {
        No aux = inicio;

        while (aux != null) {
            if (aux.dado.getNome().equalsIgnoreCase(nome)) {
                return aux.dado;
            }
            aux = aux.proximo;
        }

        return null;
    }
   
}

