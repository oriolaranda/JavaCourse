package principal;

import java.util.Random;

import javax.swing.JLabel;

/** 
 * Classe Algoritmes (Logic)
 * @author Oriol Aranda & Sergi Del Rio
 * @version 1.3
 * 
 **/ 
public class Algorismes {
	int comp=0;
    
  
	/* *********** *
	 *  ENCRIPTAR  *
	 * *********** */
	 
	public String encriptar (String missatge, String clau){
        int llarg = missatge.length(); //variable llargada missatge escrit
        int[] encriptat_int = new int[llarg]; //Creem vectors per emmagatzemar en cada espai el número corresponent en ASCII del caracter del missatge, de la clau i del missatge final encriptat
        int[] clau_int = new int[llarg];
        int[] missatge_int = new int[llarg];
        String missatge_encriptat = ""; //string del missatge encriptat
        comp=0;

        for (int i=0; i<llarg;i++){ //for per omplir el vector missatge amb els numeros ascii corresponents 
        				missatge_int[i] = missatge.charAt(i); 
        				clau_int[i] = clau.charAt(comp)-32; //el vector clau omplir-lo amb la diferencia entre el numero ascii i el que em conciderat el primer caracter (numero ascci el 32)
                        comp++;
                if (comp == clau.length()){ //si el missatge és més gran que la clau, aquesta es repeteix fins a ocupar el mateix
                        comp=0;
                }
        }
        
        for (int i=0;i<llarg;i++){
        	if(missatge_int[i]+clau_int[i]>126 && missatge_int[i]+clau_int[i]<161){ // problema que t'explicarem amb el codi ascii
        		encriptat_int[i]=missatge_int[i]+clau_int[i]+400; 
        	}else{
                encriptat_int[i] = missatge_int[i]+clau_int[i]; //omple el vector del missatge encriptat amb la suma dels dos altres vectors
                if(encriptat_int[i]>252){
                        encriptat_int[i]-= 220; //el num 252 es el num ascii max que hem agafat si sobrepasa torna al 32 que es el num ascii mínim
                }
        	}
        	missatge_encriptat += String.valueOf((char) encriptat_int[i]); //passa el vector missatge encriptat a char (string)
        }
        return missatge_encriptat;
	}
	
	
	

	/* ************** *
	 *  DESENCRIPTAR  *
	 * ************** */
	
	public String desencriptar (String missatge, String clau){
		
		comp=0;
        int llarg = missatge.length();
        int[] desencriptat_int = new int[llarg];
        int[] clau_int = new int[llarg];
        int[] missatge_int = new int[llarg];
        String missatge_desencriptat = "";
       
        for (int i=0; i<llarg;i++){ //Omplir vectors
                missatge_int[i] = missatge.charAt(i);
                clau_int[i] = clau.charAt(comp)-32;
                        comp++;
                if (comp == clau.length()){
                        comp=0;
                }
        }
        for (int i=0;i<llarg;i++){ 
        	if(missatge_int[i]>526 && missatge_int[i]<561){ //problema amb ascii
        		desencriptat_int[i]=(missatge_int[i]-400)-clau_int[i];
        	}else{
                desencriptat_int[i] = missatge_int[i]-clau_int[i]; //inversa de l'altre algorisme
                if(desencriptat_int[i]<32){
                        desencriptat_int[i]+=220; //si surt un num ascii inferior a 32, se li assigna un dins del interval correcte (32-252)
                }   
        	}
        	missatge_desencriptat +=  String.valueOf((char) desencriptat_int[i]);
        }
        return missatge_desencriptat;
	}
    
	
	
    /* ************ *
     *  CREAR CLAU  *
     * ************ */
	
    public String crear_clau(int n_char, boolean check1, boolean check2, boolean check3, JLabel error){
    	
    	Random r = new Random(); //crea clau aleatoria
    	String newkey="";
    	int ran=0;
    	
    	for(int i=0; i<n_char;i++){
    		if(check1==true && check2==false && check3==false){
    			ran= r.nextInt(90-65+1)+65; //A-Z
    			
    		}else if(check1==true && check2==true && check3==false){
    			do{
        			ran= r.nextInt(122-65+1)+65;//A-Z, a-z
        		}while (ran >90 && ran<97); 
    			
    		}else if(check1==true && check2==false && check3==true){
    			do{
        			ran= r.nextInt(90-48+1)+48;//A-Z, 0-9
        		}while (ran >57 && ran<65); 
    			
    		}else if(check1==true && check2==true && check3==true){
    			do{
        			ran= r.nextInt(122-48+1)+48; //A-Z,a-z,0-9
        		}while ((ran >57 && ran<65) || (ran>90 && ran<97));
    			
    		}else if(check1==false && check2==true && check3==true){
    			do{
    				ran= r.nextInt(122-48+1)+48; //a-z,0-9
        		}while ((ran >57 && ran<97)); 
    			
    		}else if(check1==false && check2==true && check3==false){
    			ran= r.nextInt(122-97+1)+97; //a-z
    			
    		}else if(check1==false && check2==false && check3==true){
    			ran= r.nextInt(57-48+1)+48; //0-9
    		}
    		
    		
    		else{
    			error.setVisible(true);
    			ran=0;
    		}
    		if(ran!=0){
    		newkey += String.valueOf((char) ran);
    		error.setVisible(false);
    		}else{
    			
    		}
    	}
    	return newkey;
    }
    
    
}
