package cts.s02.principii_clean_code.clase.readers;

import cts.s02.principii_clean_code.clase.Aplicant;

import java.io.FileNotFoundException;
import java.util.List;


public abstract class AplicantReader {
    public abstract List<Aplicant> readAplicants(String file) throws FileNotFoundException;
}
