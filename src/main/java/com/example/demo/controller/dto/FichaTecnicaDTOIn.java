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
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

/**
 *
 * @author Missaci
 */
public class FichaTecnicaDTOIn {
    
    private Peso peso;
    private Tamanho tamanho;
    
    @NotEmpty
    private String marca;
    
    @NotEmpty
    private String cor;
    
    private Date validade;
    
    public FichaTecnicaDTOIn(){
        
        
    }
    
    static FichaTecnica parse (List<FichaTecnicaDTOIn> fichaIn) {
        
        FichaTecnica fichas = new FichaTecnica();
        for(FichaTecnicaDTOIn obj: fichaIn){
            
             FichaTecnica ft = new FichaTecnica( obj.getPeso(), obj.getTamanho(), obj.getCor(), obj.getMarca(), obj.getValidade());
             fichas = ft;
            
            
            
        }
        return fichas;
    }
    
    
    
    public FichaTecnicaDTOIn(Peso peso, Tamanho tamanho, String marca, String cor, Date validade){
        this.peso = peso;
        this.tamanho = tamanho;
        this.marca = marca;
        this.cor = cor;
        this.validade = validade;
        
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
