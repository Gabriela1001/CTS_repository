package cts.s02.principii_clean_code.main;

import java.io.FileNotFoundException;
import java.util.List;

import cts.s02.principii_clean_code.clase.Aplicant;
import cts.s02.principii_clean_code.clase.readers.AngajatReader;
import cts.s02.principii_clean_code.clase.readers.AplicantReader;

public class Program {

	public static void main(String[] args) {
		List<Aplicant> listaAngajati;
		try {
			AplicantReader reader=new AngajatReader();
			listaAngajati = reader.readAplicants("C:\\Users\\gabri_w\\IdeaProjects\\CTS_repository\\seminar_2\\angajati.txt");
			for(Aplicant angajat:listaAngajati)
				System.out.println(angajat.toString());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
