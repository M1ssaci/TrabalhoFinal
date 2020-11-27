/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.controller.dto;

import com.example.demo.model.FichaTecnica;
import com.example.demo.model.Peso;
import com.example.demo.model.Tamanho;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


/**
 *
 * @author Missaci
 */
public class FichaTecnicaDTO {
    
    private Peso peso;
    private Tamanho tamanho;
    private String marca;
    private String cor;
    private Date validade;
    
    
    

    public FichaTecnicaDTO(FichaTecnica ficha){
        
        this.peso = ficha.getPeso();
        this.tamanho = ficha.getTamanho();
        this.marca = ficha.getMarca();
        this.cor = ficha.getCor();
        this.validade = ficha.getValidade();
        
        
    }
    
    static List<FichaTecnicaDTO> parse(FichaTecnica fichaTecnica) {
        
            List<FichaTecnicaDTO> fichas = new ArrayList<>();
        
            
            fichas.add(new FichaTecnicaDTO(fichaTecnica));
          
    
        return fichas;
    }

    public Peso getPeso() {
        return peso;
    }

    public void setPeso(Peso peso) {
        this.peso = peso;
    }

    public Tamanho getTamanho() {
        return tamanho;
    }

    public void setTamanho(Tamanho tamanho) {
        this.tamanho = tamanho;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Date getValidade() {
        return validade;
    }

    public void setValidade(Date validade) {
        this.validade = validade;
    }
    
    
    
    
}
