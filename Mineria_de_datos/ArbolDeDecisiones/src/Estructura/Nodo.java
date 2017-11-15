/*
 * Copyright (C) 2017 Juan Diaz - Furiosojack <http://blog.furiosojack.com>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package Estructura;

import java.util.List;

/**
 *
 * @author Juan Diaz - Furiosojack <http://blog.furiosojack.com>
 */
public class Nodo {
    
    private String nombre;
    private float valor;
    private List<Nodo> alternativas;
    private float probabilidadDeUsarme;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public float getProbabilidadDeUsarme() {
        return probabilidadDeUsarme;
    }

    public void setProbabilidadDeUsarme(float probabilidadDeUsarme) {
        this.probabilidadDeUsarme = probabilidadDeUsarme;
    }

    public List<Nodo> getAlternativas() {
        return alternativas;
    }

    public void setAlternativas(List<Nodo> alternativas) {
        this.alternativas = alternativas;
    }
    
    
}
