/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio1cliente;

/**
 *
 * @author Douglas
 */
public class PublicacaoCliente {
    private int id;
    private String titulo;
    private int paginaInicial;
    private int paginaFinal;
    private int anoPublicacao;

    public PublicacaoCliente() {
    }
    
    public PublicacaoCliente(int id, String titulo, int paginaInicial, int paginaFinal, int anoPublicacao) {
        this.id = id;
        this.titulo = titulo;
        this.paginaInicial = paginaInicial;
        this.paginaFinal = paginaFinal;
        this.anoPublicacao = anoPublicacao;
    }
    
    public int getId() {
        return this.id;
    }
    
    public void setId (int id){
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getPaginaInicial() {
        return paginaInicial;
    }

    public void setPaginaInicial(int paginaInicial) {
        this.paginaInicial = paginaInicial;
    }

    public int getPaginaFinal() {
        return paginaFinal;
    }

    public void setPaginaFinal(int paginaFinal) {
        this.paginaFinal = paginaFinal;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }
    
    public void imprimePublicacao(){
        System.out.print ("Publicação ");
        System.out.println(this.getId() + ": " +
                this.getTitulo() + ", p." +
                this.getPaginaInicial() + "-" +
                this.getPaginaFinal() + ", " +
                this.getAnoPublicacao() );
    }
}
