/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinalalgoritmos;

import java.util.LinkedList;

/**
 *
 * @author Javier
 */
public class LinkedListMergeSort {

    Estudiante head = null; 
    String ordenamiento;
    
    
    //Lo ordeno de acuerdo al criterio del atributo Ordenamiento que puedo setear desde el main
    protected  Estudiante sortedMerge(Estudiante a, Estudiante b) 
    { 
        Estudiante result = null; 
        if (a == null) 
            return b; 
        if (b == null) 
            return a; 
        switch(ordenamiento) {
            
        case "Economia":
            if (a.promEconomia >= b.promEconomia) { 
            result = a; 
            result.next = sortedMerge(a.next, b); 
            } 
             else { 
            result = b; 
            result.next = sortedMerge(a, b.next); 
        }     break;
        case "Salud":
            if (a.promSalud >= b.promSalud) { 
            result = a; 
            result.next = sortedMerge(a.next, b); 
            } 
             else { 
            result = b; 
            result.next = sortedMerge(a, b.next); 
        }     break;
        case "Laboral":
            if (a.promLaboral >= b.promLaboral) { 
            result = a; 
            result.next = sortedMerge(a.next, b); 
            } 
             else { 
            result = b; 
            result.next = sortedMerge(a, b.next); 
        }     break;
        case "Familiar":
            if (a.promFamilia >= b.promFamilia) { 
            result = a; 
            result.next = sortedMerge(a.next, b); 
            } 
             else { 
            result = b; 
            result.next = sortedMerge(a, b.next); 
        }     break;
        default:
}
        
        return result; 
    } 
  
    protected Estudiante mergeSort(Estudiante h) 
    { 
        if (h == null || h.next == null) { 
            return h; 
        } 
  
        Estudiante middle = getMiddle(h); 
        Estudiante nextofmiddle = middle.next; 
  
        middle.next = null; 
  
        Estudiante left = mergeSort(h); 
  
        Estudiante right = mergeSort(nextofmiddle); 
  
        Estudiante sortedlist = sortedMerge(left, right); 
        return sortedlist; 
    } 
  
    public static Estudiante getMiddle(Estudiante head) 
    { 
        if (head == null) 
            return head; 
  
        Estudiante slow = head, fast = head; 
  
        while (fast.next != null && fast.next.next != null) { 
            slow = slow.next; 
            fast = fast.next.next; 
        } 
        return slow; 
    }  
  
 
  
    void push(Estudiante new_node) 
    { 
         
  
        new_node.next = head; 
  
        head = new_node; 
    } 
  
    void printList(Estudiante headref) 
    { 
        while (headref != null) { 
            System.out.println(headref.matricula + "-" + headref.promEconomia+"-" +headref.promSalud); 
            headref = headref.next; 
        } 
    } 

    public Estudiante getHead() {
        return head;
    }

    public void setHead(Estudiante head) {
        this.head = head;
    }

    public String getOrdenamiento() {
        return ordenamiento;
    }

    public void setOrdenamiento(String ordenamiento) {
        this.ordenamiento = ordenamiento;
    }
    
    public int size(Estudiante estudiante){
    int contador =0;
    while(estudiante!=null){
        contador ++;
        estudiante=estudiante.next;
    }
    
    return contador;
    }
    
 }

