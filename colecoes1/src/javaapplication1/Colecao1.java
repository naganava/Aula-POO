/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import Pessoa.Aluno;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author guest-gt0syg
 */
public class Colecao1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Aluno eu = new Aluno(1,"Felipe","(11)1111-1111","Rua dos bobo");
        Aluno voce = new Aluno(2,"Mario","(22)2222-2222","Avenida dos bobo");
        Aluno ela = new Aluno(3,"Maria","(33)3333-3333","Rua dos bobo");
        Aluno ele = new Aluno(4,"João","(44)4444-4444","Viela dos bobo");
        Aluno tu = new Aluno(5,"José","(55)5555-5555","Travessa dos bobo");
        
        ArrayList<Aluno> alunosArrayList = new ArrayList();
        
        alunosArrayList.add(eu);
        alunosArrayList.add(voce);
        alunosArrayList.add(ela);
        alunosArrayList.add(ele);
        alunosArrayList.add(tu);
        alunosArrayList.add(eu);
        
        Set<String> alunosHashSet = new HashSet();
        
        alunosHashSet.add(eu.getNome());
        alunosHashSet.add(voce.getNome());
        alunosHashSet.add(ela.getNome());
        alunosHashSet.add(ele.getNome());
        alunosHashSet.add(tu.getNome());
        
        Map<Integer,Aluno> alunosHashMap = new HashMap();
        
        alunosHashMap.put(1,eu);
        alunosHashMap.put(2,voce);
        alunosHashMap.put(3,ela);
        alunosHashMap.put(4,ele);
        alunosHashMap.put(5,tu);
        alunosHashMap.put(6, eu);
        alunosHashMap.put(7, voce);
        
        for(int i=0;i<alunosArrayList.size();i++){
            System.out.println("******************");
            alunosArrayList.get(i).imprimeDados();
            System.out.println("******************");
        }
        
        Iterator i = alunosHashSet.iterator();
        while(i.hasNext()){
            System.out.println("Nome: "+i.next());
        }
        
        for(Integer key : alunosHashMap.keySet()){
            System.out.println("******************");
            System.out.println(key);
            alunosHashMap.get(key).imprimeDados();
            System.out.println("******************");
        }
    }
    
}
