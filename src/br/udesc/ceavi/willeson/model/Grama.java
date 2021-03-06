package br.udesc.ceavi.willeson.model;

import br.udesc.ceavi.willeson.controller.Cenario;

/**
 *
 * @author Willeson Thomas da Silva
 */
public class Grama extends Cenario {

    private String img;
    private int posicao;

    public Grama() {
    }

    public Grama(String img, int posicao) {
        this.img = img;
        this.posicao = posicao;
    }

    @Override
    public String getImg() {
        return img;
    }

    @Override
    public void setImg(String img) {
        this.img = img;
    }

    @Override
    public int getPosicao() {
        return posicao;
    }

    @Override
    public void setPosicao(int posicao) {
        this.posicao = posicao;
    }

}
