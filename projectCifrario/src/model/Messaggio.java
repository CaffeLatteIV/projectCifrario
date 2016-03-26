/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;



/**
 *
 * @author Utente
 */
public class Messaggio {
    String messaggio;
    double[] percentuale;
    char[] caratteri;
    int[] ricorrenze;//NOTA: vanno inizializzati a 0

    public Messaggio(String messaggio) {
        this.messaggio = messaggio;
        percentuale = new double[26];
        caratteri= new char[26];
        ricorrenze=new int[26];
//        caratteri = new char[]{' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ', ' ',' ',' '};
    }
    

public void creaArrayDiCaratteri(){
    int l=0;
    //ordino le percentuali
//        for (int i = 0; i < ricorrenze.length; i++) {
//            ricorrenze[i]=0;   
//            System.out.println(ricorrenze);
//        }
//        
        
    
    for(int i=0; i<messaggio.length(); i++){
        char c=messaggio.charAt(i);
        boolean match=false;
        for(int j=0; j<l; j++){
            if(caratteri[j]==c){
                 match=true;
                ricorrenze[j]++;
                break;
            }
        }
        if(!match){
            caratteri[l]=c;
            ricorrenze[l]+=1;
            l++;
        }
      
    }
//    for (int i = 0; i < ricorrenze.length; i++) {
//        System.out.println(ricorrenze);
//        
//    }
    

}
    public void creaArrayPercentuali(){
        
    
}
    public void ordinaGliArray(){  
        int indiceUltimo = percentuale.length-1; 
        int i;
        int primo = 0; 
        while (primo < indiceUltimo){
        // il ciclo termina al penultimo elemento 
        // scansione degli elementi non ancora ordinati, partendo dall’ultimo 
            i = indiceUltimo; 
            while (i > primo) { 
 
                if (percentuale[i] > percentuale[i - 1]){
  
                    double tmp = percentuale[i]; 
                    percentuale[i] = percentuale[i-1]; 
                    percentuale[i-1] = tmp;
                    //ordinamento caratteri
                    char chr = caratteri[i];
                    caratteri[i]= caratteri[i-1];
                    caratteri[i-1]= chr;
                } 
            i = i - 1; 
            } 
 
            primo = primo + 1; 
    } 
       
                    
                   
    }
    public void creaArrayDiPercentuali(){
        
    }
    public void decodificaMessaggio(){
        for (int i = 0; i < messaggio.length(); i++) {
            for (int j = 0; j < caratteri.length; j++) {
                if (messaggio.toCharArray()[i]==caratteri[j]){

            switch(j){
                case 0:
                    messaggio.toCharArray()[i]='E';
                    break;
                case 1:
                    messaggio.toCharArray()[i]='A';
                    break;
                case 2:
                    messaggio.toCharArray()[i]='I';
                    break;    
                case 3:
                    messaggio.toCharArray()[i]='O';
                    break; 
                case 4:
                    messaggio.toCharArray()[i]='N';
                    break;
                case 5:
                    messaggio.toCharArray()[i]='L';
                    break;   
                case 6:
                    messaggio.toCharArray()[i]='R';
                    break;
                case 7:
                    messaggio.toCharArray()[i]='T';
                    break;
                case 8:
                    messaggio.toCharArray()[i]='S';
                    break;
                case 9:
                    messaggio.toCharArray()[i]='C';
                    break;   
                case 10:
                    messaggio.toCharArray()[i]='D';
                    break;
                case 11:
                    messaggio.toCharArray()[i]='P';
                    break;   
                case 12:
                    messaggio.toCharArray()[i]='U';
                    break;       
                case 13:
                    messaggio.toCharArray()[i]='M';
                    break;   
                case 14:
                    messaggio.toCharArray()[i]='V';
                    break;       
                case 15:
                    messaggio.toCharArray()[i]='G';
                    break;       
                case 16:
                    messaggio.toCharArray()[i]='H';
                    break;
                case 17:
                    messaggio.toCharArray()[i]='F';
                    break;   
                case 18:
                    messaggio.toCharArray()[i]='B';
                    break;   
                case 19:
                    messaggio.toCharArray()[i]='Q';
                    break;   
                case 20:
                    messaggio.toCharArray()[i]='Z';
                    break; 
                
            }
                }
            }
            
        }
        
    }

    public String getMessaggio() {
        return messaggio;
    }

    
    
    
}
