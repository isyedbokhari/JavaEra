package day19_arrays;

import java.util.Arrays;

public class Task01 {

	public static void main(String[] args) {
		
		String[] classmates = {"Syed", "Payzulla", "Abdusamat", "Camiran", "Bee", "Pari", "Muattar", "Nuer", "Waranya", "Kalbinur"};
//		System.out.println(classmates[0].charAt(0));
//		
//		System.out.println(classmates[1].charAt(0));
//
//		System.out.println(classmates[2].charAt(0));
//
//		System.out.println(classmates[3].charAt(0));
//
//		System.out.println(classmates[4].charAt(0));
//
//		System.out.println(classmates[5].charAt(0));
//
//		System.out.println(classmates[6].charAt(0));
//
//		System.out.println(classmates[7].charAt(0));
//
//		System.out.println(classmates[8].charAt(0));
//
//		System.out.println(classmates[9].charAt(0));
		
		
		for (int i = 0; i <= classmates.length-1; i++) {
			System.out.println(classmates[i].charAt(0));
		}

		
		
		
		System.out.println("====================");
		
		
		
		
		/*
         *  Syed Bokhari
            Chaiwat Pipatpongsa
            Hakeem Alim
            camiran muhammad
            Abdusamat Ahmet
            Waranya Chayawat
            Beatrice Namumba
            Abdullah Mehmood
            Alexander Abi-Aad
            Hamad Durrani
            Ali Muataer
            Shahzaib Hussain
            Kalbinur Akbar
            Naidan Jigjiddorj
            zakir hussain
            Truc Phan
            Francisco Marquez Lopez
            Tashpolotova Elizat
            Arezoo Sadeghi
            Arad Misaghi
*/ 
        
        String names[] = {"Ali Muataer","camiran muhammad"
                ,"Hamad Durrani","zakir hussain","Truc Phan"
                ,"Arad Misaghi","Arezoo Sadeghi","Tashpolotova Elizat"};
        
//        String str  = "zakir hussain"; /// A.M
//        String arr[] = str.split(" ");
//        String fristNAme = arr[0].toUpperCase();
//        String lastNAme = arr[1].toUpperCase();
//        System.out.println(fristNAme);
//        System.out.println(lastNAme);
//        
//        System.out.println(fristNAme.charAt(0)+"."+lastNAme.charAt(0));
        
        for (String n : names) {
        //    System.out.println(n);
            String str  = n; /// A.M
            String arr[] = str.split(" ");
            String fristNAme = arr[0].toUpperCase();
            String lastNAme = arr[1].toUpperCase();
//            System.out.println(fristNAme);
//            System.out.println(lastNAme);
            
            System.out.println(fristNAme.charAt(0)+"."+lastNAme.charAt(0));
            
        }
	}

}
