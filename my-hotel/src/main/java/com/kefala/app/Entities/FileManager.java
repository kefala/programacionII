package com.kefala.app.Entities;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by kefala on 01/07/16.
 */
public class FileManager<MODEL_DTO>  {

    private String filePath, fileName;

    public FileManager(String filePath, String fileName) {
        this.filePath = filePath;
        this.fileName = fileName;
    }

    private File getFile() throws IOException {
        File directory = new File(filePath);
        if (! directory.exists()){
            directory.mkdir();
        }
        File archivo = new File(filePath+ fileName);
        if(!archivo.exists()) {
            new FileWriter(archivo);
        }
        return archivo;
    }


    public List<MODEL_DTO> readContent(){
        List<MODEL_DTO> listado = new ArrayList<MODEL_DTO>();
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(getFile()));
            listado = (ArrayList<MODEL_DTO>)ois.readObject();
            ois.close();
        } catch (EOFException e){
            //e.printStackTrace();
        } catch (IOException ioe){
            ioe.printStackTrace();
        } catch (Exception e){
            e.printStackTrace();
        }
        return listado;

    }

    public void writeList(List<MODEL_DTO> list) {
        try {
            ObjectOutputStream oos= new ObjectOutputStream(new FileOutputStream(getFile()));
            oos.writeObject(list);
            oos.close();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }



}
