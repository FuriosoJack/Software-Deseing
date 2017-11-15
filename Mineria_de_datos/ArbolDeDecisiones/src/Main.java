
import Estructura.Decision;
import Estructura.Nodo;
import Estructura.Probabilidad;
import java.util.ArrayList;
import java.util.List;

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

/**
 *
 * @author Juan Diaz - Furiosojack <http://blog.furiosojack.com>
 */
public class Main {
    public static void main(String[] args){
        
        List<Nodo> list = new ArrayList<Nodo>();
        
        Probabilidad nueva = new Probabilidad();
        Decision nueva2 = new Decision();
        list.add(nueva2);
        list.add(nueva);
        System.out.println(list.get(0).getClass());
    }
}
